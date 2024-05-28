package com.cloudkitchen.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Admindto {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private int id ;
	private String RestaurantName;
	private String location;
	private String password;
	@OneToMany
	private List<Recipe> recpie;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHotelName() {
		return RestaurantName;
	}
	public void setHotelName(String hotelName) {
		RestaurantName = hotelName;
	}
	public String getLoc() {
		return location;
	}
	public void setLoc(String location) {
		this.location = location;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Recipe> getRecpie() {
		return recpie;
	}
	public void setRecpie(List<Recipe> recpie) {
		this.recpie = recpie;
	}
	public Admindto( String RestaurantName, String location, String password, List<Recipe> recpie) {
		super();
//		this.id = id;
		this.RestaurantName = RestaurantName;
		this.location = location;
		this.password = password;
		this.recpie = recpie;
	}
	
	
	
	

}
