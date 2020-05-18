package com.designpattern.ocp;

public class CardSpecification implements Specification<CreditCards> {

	CARDTYPE cardType;

	public CardSpecification(CARDTYPE cardType) {
		this.cardType = cardType;
	}

	@Override
	public boolean isSame(CreditCards creditCard) {
		return creditCard.cardType == cardType;
	}

}

class BankSpecification implements Specification<CreditCards> {

	String bankName;

	public BankSpecification(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public boolean isSame(CreditCards t) {
		return t.bankName.equalsIgnoreCase(bankName);
	}

}

class BankAndCardSpecification implements Specification<CreditCards> {

	String bankName;

	CARDTYPE cardType;

	public BankAndCardSpecification(CARDTYPE cardType, String bankName) {
		this.cardType = cardType;
		this.bankName = bankName;
	}

	@Override
	public boolean isSame(CreditCards t) {
		return t.bankName.equalsIgnoreCase(bankName) && t.cardType == cardType;
	}

}

class BankOrCardSpecification implements Specification<CreditCards> {

	String bankName;

	CARDTYPE cardType;

	public BankOrCardSpecification(CARDTYPE cardType, String bankName) {
		this.cardType = cardType;
		this.bankName = bankName;
	}

	@Override
	public boolean isSame(CreditCards t) {
		return t.bankName.equalsIgnoreCase(bankName) || t.cardType == cardType;
	}

}
