package com.cloudkitchen.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class RecipeCart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String recipetype;
	private String recipelist;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRecipetype() {
		return recipetype;
	}
	public void setRecipetype(String recipetype) {
		this.recipetype = recipetype;
	}
	public String getRecipelist() {
		return recipelist;
	}
	public void setRecipelist(String recipelist) {
		this.recipelist = recipelist;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public RecipeCart(int id, String recipetype, String recipelist, double price) {
		super();
		this.id = id;
		this.recipetype = recipetype;
		this.recipelist = recipelist;
		this.price = price;
	}
	
	
}
