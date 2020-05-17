package com.designpattern.creational.factory;


import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class FactoryPatternTest {

	@Test
	public void FactoryPatternTestCase() {

		Website blog = WebsiteBuilderFactory.showWebsite(WebsiteType.BLOG);
		System.out.println(blog.getPages());

		Website shopping = WebsiteBuilderFactory.showWebsite(WebsiteType.SHOPPING);
		System.out.println(shopping.getPages());

		assertEquals(blog.getPages().size(), 3);
		assertEquals(shopping.getPages().size(), 3);
	}

}
