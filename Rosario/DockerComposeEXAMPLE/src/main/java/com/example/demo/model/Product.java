package com.example.demo.model;

import org.springframework.data.annotation.Id;

public class Product {

	@Id
	private Long id;
	private String name;
	private Integer quantity;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Product(Long id, String name, Integer quantity) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}
	
	public Product() {
	}
	
	
	
}
