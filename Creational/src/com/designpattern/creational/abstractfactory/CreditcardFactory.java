package com.designpattern.creational.abstractfactory;

public abstract class CreditcardFactory {

	public static CreditcardFactory getCreditcardFactory(int creditScore) {
		if (creditScore > 650) {
			return new AmexFactory();
		}
		return new VisaFactory();
	}

	public abstract Creditcard getCreditcard(CreditcardType type);

	public abstract Validator isValid(CreditcardType type);
}
