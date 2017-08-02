package com.designpattern.creational.abstractfactory;

public class AmexFactory extends CreditcardFactory {

	@Override
	public Creditcard getCreditcard(CreditcardType type) {
		switch (type) {
		case GOLD:
			return new AmexGoldCard();

		case PLATINUM:
			return new AmexPlatinumCard();
		default:
			return null;
		}
	}

	@Override
	public Validator isValid(CreditcardType type) {
		switch (type) {
		case GOLD:
			return new AmexGoldCardValidator();

		case PLATINUM:
			return new AmexPlatinumCardValidator();
		default:
			return null;
		}
	}

}
