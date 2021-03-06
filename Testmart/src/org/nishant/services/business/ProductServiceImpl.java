package org.nishant.services.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	List<String> movieList = new ArrayList<String>();
	
	public ProductServiceImpl() {
		bookList.add("1");
		bookList.add("2");
		bookList.add("3");
		
		musicList.add("4");
		musicList.add("5");
		musicList.add("6");
		
		movieList.add("7");
		movieList.add("8");
		movieList.add("9");
	}
	
	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category){
		switch(category.toLowerCase()){
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
	}
}
