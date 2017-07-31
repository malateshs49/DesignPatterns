package com.designpattern.creational.factory;

public class WebsiteBuilderFactory {

	public static Website showWebsite(WebsiteType type) {
		switch (type) {
		case BLOG:
			return new Blog();
		case SHOPPING:
			return new Shopping();

		default:
			return null;
		}
	}

}
