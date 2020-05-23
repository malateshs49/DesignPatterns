package com.designpatterns.dependencyinversion;

public class MainClass {
	public static void main(String[] args) {
		
		Relationships relation = new Relationships();
		relation.addRelation(new Person("Sudarshan"), new Person("Malatesh"));
		relation.addRelation(new Person("Panduranga"), new Person("Vanitha"));
		relation.addRelation(new Person("Panduranga"), new Person("Surendra"));
		Research research= new Research();
		research.ResearchAnalyser(relation,"Panduranga");
		

	}
}