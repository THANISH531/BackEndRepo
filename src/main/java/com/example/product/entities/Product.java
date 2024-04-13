package com.example.product.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mobile")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="productmodel")
	private String productmodel;
	@Column(name="productversion")
	private String productversion;
	@Column(name="price")
	private String price;
	public Product() {
	}
		
	public Product( String productmodel, String productversion, String price) {
			super();
			this.productmodel = productmodel;
			this.productversion = productversion;
			this.price = price;
		}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductmodel() {
		return productmodel;
	}
	public void setProductmodel(String productmodel) {
		this.productmodel = productmodel;
	}
	public String getProductversion() {
		return productversion;
	}
	public void setProductversion(String productversion) {
		this.productversion = productversion;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
		
}
