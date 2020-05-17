package com.designpattern.creational.factory;

public class Shopping extends Website {

	@Override
	public void createWebsite() {
		pages.add(new ProductPage());
		pages.add(new CheckoutPage());
		pages.add(new PaymentPage());
	}

}
