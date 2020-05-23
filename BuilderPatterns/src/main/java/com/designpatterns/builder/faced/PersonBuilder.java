package com.designpatterns.builder.faced;

public class PersonBuilder {

	protected Person person = new Person();
	

	public Person build() {
		return person;
	}

	public EmployeeBuilder buildEmployee() {
		return new EmployeeBuilder(person);
	}

	public CompanyBuilder buildCompany() {
		return new CompanyBuilder(person);
	}

}
