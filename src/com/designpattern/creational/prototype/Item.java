package com.designpattern.creational.prototype;

public class Item implements Cloneable {

	private String itemName;

	private double itemPrice;

	private String title;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemDescription() {
		return title;
	}

	public void setItemDescription(String itemDescription) {
		this.title = itemDescription;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
