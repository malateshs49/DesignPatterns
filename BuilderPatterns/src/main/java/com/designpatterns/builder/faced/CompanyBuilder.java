package com.designpatterns.builder.faced;

public class CompanyBuilder extends PersonBuilder {

	public CompanyBuilder(Person person) {
		this.person = person;
	}

	public CompanyBuilder isAtCompany(String companyName) {
		person.companyName = companyName;
		return this;
	}

	public CompanyBuilder asType(String typeOfEmployee) {
		person.typeOfEmployee = typeOfEmployee;
		return this;
	}

	public CompanyBuilder as(String designation) {
		person.designation = designation;
		return this;
	}

}
