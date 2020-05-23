package com.designpatterns.builder.fluentbuilder;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

	public EmployeeBuilder addPosition(String position) {
		person.position = position;
		return getSelf();
	}

	@Override
	public EmployeeBuilder getSelf() {
		return this;
	}

}
