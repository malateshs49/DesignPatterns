package com.designpattern.ocp;

enum CARDTYPE {
	AMEX, MASTER_CARD, VISA
}

public class CreditCards {
	String cardName;

	CARDTYPE cardType;

	String bankName;

	public CreditCards(String cardName, CARDTYPE cardType, String bankName) {
		this.cardName = cardName;
		this.cardType = cardType;
		this.bankName = bankName;
	}

}
