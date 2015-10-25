package org.nishant.services.model;

public class Product {

	private String name;
	private String sku;
	private Double price;
	
	public Product(String name, String sku, Double price){
		this.name = name;
		this.sku = sku;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
