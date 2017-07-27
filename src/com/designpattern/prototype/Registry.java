package com.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String, Item> items = new HashMap<String, Item>();

	public Registry() {
		loadItems();
	}

	public Item createItem(String Key) {
		Item item = null;
		try {
			item = (Item) items.get(Key).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return item;
	}

	private void loadItems() {

		Movie movie = new Movie();
		movie.setItemName("DDLJ");
		movie.setItemPrice(200);
		movie.setnumberOfHours(2);
		items.put("MOVIE", movie);

		Book book = new Book();
		book.setItemName("One Indian Gal");
		book.setItemPrice(400);
		book.setNumberOfPages(120);

		items.put("BOOK", book);

	}

}
