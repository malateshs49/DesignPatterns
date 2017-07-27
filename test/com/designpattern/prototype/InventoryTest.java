package com.designpattern.prototype;

import static org.junit.Assert.*;

import org.junit.Test;

public class InventoryTest {

	@Test
	public void prototypeTest() {

		Registry registry = new Registry();

		Movie movieFirst = (Movie) registry.createItem("MOVIE");
		movieFirst.setItemDescription("Best movie of Decade");

		Movie movieSecond = (Movie) registry.createItem("MOVIE");
		movieSecond.setItemDescription("Super movie of Decade");

		assertEquals(movieFirst.getItemName(), movieSecond.getItemName());
		assertEquals(movieFirst.getItemPrice(), movieSecond.getItemPrice(),0.0);
		assertEquals(movieFirst.getnumberOfHours(), movieSecond.getnumberOfHours());
		assertEquals(movieFirst.getItemDescription(), "Best movie of Decade");
		assertEquals(movieSecond.getItemDescription(), "Super movie of Decade");

		assertNotEquals(movieFirst, movieSecond);

	}
}
