package com.designpatterns.builder.faced;

public class Person {

	public String name;

	public String streetName, area, pincode;

	public String companyName, designation, typeOfEmployee;

	@Override
	public String toString() {
		return "Person " + name + " staying at " + streetName + " in area " + area + " under pincode " + pincode
				+ " is working in " + companyName + " as " + typeOfEmployee + " as " + designation;
	}

}
