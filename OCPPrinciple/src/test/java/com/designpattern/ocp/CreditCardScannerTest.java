package com.designpattern.ocp;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CreditCardScannerTest extends TestCase {

	private List<CreditCards> creditCardList;
	FilterImplementation filter;

	@Before
	public void setUp() throws Exception {
		creditCardList = new ArrayList<CreditCards>();
		creditCardList.add(new CreditCards("Coral", CARDTYPE.MASTER_CARD, "HDFC"));
		creditCardList.add(new CreditCards("CoralAmex", CARDTYPE.AMEX, "HDFC"));
		creditCardList.add(new CreditCards("SBIClassic", CARDTYPE.AMEX, "SBI"));
		creditCardList.add(new CreditCards("SBIVisaClassic", CARDTYPE.VISA, "SBI"));
		filter = new FilterImplementation();

	}

	@Test
	public void testForCardType() {
		long count = filter.filterCardType(creditCardList, new CardSpecification(CARDTYPE.VISA)).count();
		assertEquals(1, count);
	}

	@Test
	public void testForBankName() {
		long count = filter.filterCardType(creditCardList, new BankSpecification("HDFC")).count();
		assertEquals(2, count);
	}

	@Test
	public void testForBankAndCard() {
		long count = filter.filterCardType(creditCardList, new BankAndCardSpecification(CARDTYPE.VISA, "HDFC")).count();
		assertEquals(0, count);
	}

	@Test
	public void testForBankOrCard() {
		long count = filter.filterCardType(creditCardList, new BankOrCardSpecification(CARDTYPE.VISA, "HDFC")).count();
		assertEquals(3, count);
	}

}
