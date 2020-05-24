package com.designpatters.liskov;

public class Shape {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5, 4);
		UseIt(rect);
		System.out.println(rect.area());

		Square square = new Square(4, 4);
		UseIt(square);
		System.out.println(square.area());

		Rectangle square1 = new Square(5, 4);
		UseIt(square1);
		System.out.println(square1.area());

	}

	public static void UseIt(Rectangle r) {
		int length = r.getLength();
		r.setBreadth(10);
		r.setLength(length);
	}

}
