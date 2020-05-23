package com.designpatterns.builder.fluentbuilder;

public class Person {

	public String name;

	public String position;

	@Override
	public String toString() {
		return "Person " + this.name + " is working as " + position;

	}
}
