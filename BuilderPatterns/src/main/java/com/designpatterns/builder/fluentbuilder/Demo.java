package com.designpatterns.builder.fluentbuilder;

public class Demo {

	public static void main(String[] args) {
		EmployeeBuilder builder = new EmployeeBuilder();
		Person person = builder.addName("Mala").addPosition("Software Engineer").build();

		System.out.println(person);

	}

}
