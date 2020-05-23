package com.designpatterns.builder.faced;

public class Demo {

	public static void main(String[] args) {
		PersonBuilder pb = new PersonBuilder();
		Person p = pb.buildCompany().as("Software Engineer").asType("FullTime").isAtCompany("Morgan").buildEmployee()
				.inArea("Kurubharahalli").inPincode("560086").isAt("bangalore").name("Malatesh").build();

		System.out.println(p);
	}

}
