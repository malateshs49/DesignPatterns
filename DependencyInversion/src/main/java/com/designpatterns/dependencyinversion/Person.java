package com.designpatterns.dependencyinversion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.javatuples.Triplet;

enum RELATIONS {
	PARENT, SIBBLING
}

public class Person {

	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}

class Relationships implements RelationshipBrowser {

	List<Triplet<Person, RELATIONS, Person>> relations = new ArrayList<>();

	public List<Triplet<Person, RELATIONS, Person>> getRelations() {
		return relations;
	}

	public void addRelation(Person parent, Person child) {
		relations.add(new Triplet<>(parent, RELATIONS.PARENT, child));
		relations.add(new Triplet<>(child, RELATIONS.SIBBLING, parent));
	}

	@Override
	public List<Person> findAllChildren(String fatherName) {
		return relations.stream()
				.filter(p -> p.getValue0().name.equalsIgnoreCase(fatherName) && p.getValue1() == RELATIONS.PARENT)
				.map(Triplet::getValue2).collect(Collectors.toList());
	}

}

interface RelationshipBrowser {
	List<Person> findAllChildren(String name);
}

class Research {

	public void ResearchAnalyser(Relationships relationship) {
		List<Triplet<Person, RELATIONS, Person>> relations = relationship.getRelations();
		relations.stream().filter(p -> p.getValue0().name.equalsIgnoreCase("Sudarshan"))
				.forEach(p -> System.out.println("Father " + p.getValue0() + " has kid by name " + p.getValue2()));
	}

	public void ResearchAnalyser(RelationshipBrowser relationship, String fatherName) {
		for (Person child : relationship.findAllChildren(fatherName)) {
			System.out.println(child.name + " is child of parent " + fatherName);
		}
	}
}
