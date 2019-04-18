package com.mypkg.model;

public class Address {
	int pincode;
	String city,country;
	public Address( String city, String country,int pincode) {
		super();
		this.pincode = pincode;
		this.city = city;
		this.country = country;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", country=" + country + "]";
	}
	
}
