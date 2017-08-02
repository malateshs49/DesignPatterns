package com.designpattern.creational.abstractfactory;

public class VisaFactory extends CreditcardFactory {

	@Override
	public Creditcard getCreditcard(CreditcardType type) {
		switch (type) {
		case GOLD:
			return new VisaGoldCard();

		case PLATINUM:
			return new VisaPlatinumCard();
		default:
			return null;
		}
	}

	@Override
	public Validator isValid(CreditcardType type) {
		switch (type) {
		case GOLD:
			return new VisaGoldCardValidator();

		case PLATINUM:
			return new VisaPlatinumCardValidator();
		default:
			return null;
		}
	}

}
