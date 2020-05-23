package com.designpatters.liskov;

public class Rectangle {

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	private int length;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	private int breadth;

	public int area() {
		return length * breadth;
	}

}
