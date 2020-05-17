package com.designpattern.creational.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class AbstractFactoryDemo {

	@Test
	public void AbstractFactoryDemoTest() {

		CreditcardFactory abstractFactory = CreditcardFactory.getCreditcardFactory(750);
		Creditcard creditCard = abstractFactory.getCreditcard(CreditcardType.PLATINUM);
		assertEquals(creditCard.getClass(), AmexPlatinumCard.class);

		abstractFactory = CreditcardFactory.getCreditcardFactory(750);
		creditCard = abstractFactory.getCreditcard(CreditcardType.GOLD);
		assertEquals(creditCard.getClass(), AmexGoldCard.class);

		abstractFactory = CreditcardFactory.getCreditcardFactory(600);
		creditCard = abstractFactory.getCreditcard(CreditcardType.GOLD);
		assertEquals(creditCard.getClass(), VisaGoldCard.class);

		abstractFactory = CreditcardFactory.getCreditcardFactory(600);
		creditCard = abstractFactory.getCreditcard(CreditcardType.PLATINUM);
		assertEquals(creditCard.getClass(), VisaPlatinumCard.class);

	}

}
