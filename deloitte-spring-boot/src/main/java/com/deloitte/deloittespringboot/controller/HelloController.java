package com.deloitte.deloittespringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.deloittespringboot.model.Product;
import com.deloitte.deloittespringboot.service.ProductService;
import com.deloitte.deloittespringboot.util.ProductNotFoundException;

@RestController
public class HelloController {

	@Autowired
	ProductService service;
	
//	@GetMapping("/hello")
//	public String sayHello(Model m) {
//		
//		m.addAttribute("msg", "How Are you?");
//		return "show";
//		
//	}
	
	@PostMapping("/products")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		
		ResponseEntity<Product> productResponse = new ResponseEntity<>(service.saveProduct(product),HttpStatus.CREATED);
		return productResponse;
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@GetMapping("/product/{pId}")
	public Product getProductById(@PathVariable("pId") int pId){
		return service.getProduct(pId);
	}
	
	@DeleteMapping("/product/delete/{pId}")
public ResponseEntity<Product> deleteProduct(@PathVariable("pId") int pId) {
		ResponseEntity<Product> deletedProductResponse=null;
		if(service.checkifExists(pId)) {
			service.deleteProductById(pId);
		 deletedProductResponse= new ResponseEntity<Product>(HttpStatus.OK);
		}
		else {
			throw new ProductNotFoundException("Product doesn't Exist!");
			
		}
		return deletedProductResponse;
	}
	
}
