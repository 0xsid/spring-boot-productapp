package com.deloitte.deloittespringboot.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="products")
@JsonIgnoreProperties({"hibernatelazyInitializer","handler"})
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int productId;
	String productName;
	float price;
	
	LocalDate releaseDate;
	
	public Product() {
		
	}
	
	
	
	public Product( String productName, float price, LocalDate releaseDate) {
		
		
		this.productName = productName;
		this.price = price;
		this.releaseDate = releaseDate;
	}



	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}



	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", releaseDate=" + releaseDate + "]";
	}
	
	
}
