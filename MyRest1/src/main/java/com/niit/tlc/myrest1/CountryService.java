package com.niit.tlc.myrest1;

import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class CountryService {
	static HashMap<Integer,Country> countryIdMap=getCountryIdMap();

	CountryService()
	{if(countryIdMap==null)
	{
		countryIdMap=new HashMap<Integer,Country>();
		Country india=new Country(1,"India",1000);
		Country nepal=new Country(4,"Nepal",5000);
		Country bhutan=new Country(3,"Bhutan",7000);
		Country uae=new Country(2,"UAE",8000);
		
	countryIdMap.put(1, india);
	countryIdMap.put(4, nepal);
	countryIdMap.put(3, bhutan);
	countryIdMap.put(2, uae);
	}
}
	public List getALLCountries()
	{
		List countries = new ArrayList(countryIdMap.values());
		return countries;
	}
	public Country getCountry(int id)
	{
		Country country = countryIdMap.get(id);
		return country;
	}
	public Country addCountry(Country country)
	{
		country.setId(countryIdMap.size()+1);
		countryIdMap.put(country.getId(),country);
		return country;
	}
	public Country updateCountry(Country country)
	{
		if (country.getId() <=0)
			return null;
		countryIdMap.put(country.getId(),country);
		return country;
		}
	public void deleteCountry(int id)
	{
		countryIdMap.remove(id);
	}
	public static HashMap<Integer,Country> getCountryIdMap()
	{
		return countryIdMap;
	}
}
