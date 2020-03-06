package com.niit.tlc.myrest1;

public class Country {
	int id;
	String CountryName;
	long population;
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(int id, String countryName, long population) {
		super();
		this.id = id;
		CountryName = countryName;
		this.population = population;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	


	

}
