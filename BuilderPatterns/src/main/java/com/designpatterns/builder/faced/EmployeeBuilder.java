package com.designpatterns.builder.faced;

public class EmployeeBuilder extends PersonBuilder {

	public EmployeeBuilder(Person person) {
		this.person = person;
	}

	public EmployeeBuilder name(String name) {
		person.name = name;
		return this;
	}

	public EmployeeBuilder isAt(String streetname) {
		person.streetName = streetname;
		return this;
	}

	public EmployeeBuilder inArea(String inArea) {
		person.area = inArea;
		return this;
	}

	public EmployeeBuilder inPincode(String pincode) {
		person.pincode = pincode;
		return this;
	}

}
