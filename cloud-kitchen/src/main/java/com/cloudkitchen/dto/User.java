package com.cloudkitchen.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class User {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String password;
	private String Restaurantname;
	private String loc;
	String history;
	@OneToOne
	String cart;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRestaurantname() {
		return Restaurantname;
	}
	public void setRestaurantname(String restaurantname) {
		Restaurantname = restaurantname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getCart() {
		return cart;
	}
	public void setCart(String cart) {
		this.cart = cart;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public User(int id, String email, String password, String restaurantname, String loc, String history,
			String cart) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.Restaurantname = restaurantname;
		this.loc = loc;
		this.history = history;
		this.cart = cart;
	}
}
