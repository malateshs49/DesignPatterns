package com.designpatterns.builder.fluentbuilder;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {

	protected Person person = new Person();

	public Person build() {
		return person;
	}

	public SELF addName(String name) {
		person.name = name;
		return getSelf();
	}

	@SuppressWarnings("unchecked")
	public SELF getSelf() {
		return (SELF) this;
	}
}
