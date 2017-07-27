package com.designpattern.singelton;

public class SingeltonDemo {

	public static void main(String[] args) {

		SingeltonClass single1 = SingeltonClass.getinstance();

		SingeltonClass single2 = SingeltonClass.getinstance();

		System.out.println(single1);
		System.out.println(single2);

	}
}
