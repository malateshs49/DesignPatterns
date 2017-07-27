package com.designpattern.prototype;

public class InventoryDemo {

	public static void main(String[] args) {

		Registry registry = new Registry();

		Movie movie = (Movie) registry.createItem("MOVIE");
		movie.setItemDescription("Best movie of Decade");
		
		System.out.println(movie);
		System.out.println(movie.getItemName());
		System.out.println(movie.getItemPrice());
		System.out.println(movie.getnumberOfHours());
		System.out.println(movie.getItemDescription());

		System.out.println("\n");
		movie = (Movie) registry.createItem("MOVIE");
		movie.setItemDescription("Super movie of Decade");
		
		System.out.println(movie);
		System.out.println(movie.getItemName());
		System.out.println(movie.getItemPrice());
		System.out.println(movie.getnumberOfHours());
		System.out.println(movie.getItemDescription());

	}
}
