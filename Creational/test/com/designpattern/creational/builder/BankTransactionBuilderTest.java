package com.designpattern.creational.builder;

import com.designpattern.creational.builder.TransactionBuilder.TransactionBuilderclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTransactionBuilderTest {

	@Test
	public void builderType1Test() {

		TransactionBuilder TransactionBuilder1 = new TransactionBuilder();
		TransactionBuilder1.setAccountHolderName("Malatesh");
		TransactionBuilder1.setAccountNumber(001);
		TransactionBuilder1.setBalance(1000.00);
		TransactionBuilder1.setBalanceCheck(true);
		assertEquals(Balance(TransactionBuilder1), 1000.00, 0.0);

		TransactionBuilder TransactionBuilder2 = new TransactionBuilder();
		TransactionBuilder2.setAccountHolderName("Pavan");
		TransactionBuilder2.setAccountNumber(002);
		TransactionBuilder2.setBalance(10000.00);
		TransactionBuilder2.setBalanceCheck(false);
		assertEquals(Balance(TransactionBuilder2), 0.00, 0.0);

		TransactionBuilder2.setCreditAmount(2000.00);
		TransactionBuilder2.setBalanceCheck(true);
		assertEquals(Balance(TransactionBuilder2), 12000.00, 0.0);

	}

	@Test
	public void builderType2Test() {

		TransactionBuilder TransactionBuilder1 = new TransactionBuilder("Malatesh", 001, 1000, false);
		assertEquals(Balance(TransactionBuilder1), 0.00, 0.0);

		TransactionBuilder TransactionBuilder2 = new TransactionBuilder("Pavan", 002, 10000, true);
		TransactionBuilder2.setCreditAmount(1000);
		TransactionBuilder2.setDebitAmount(2000);
		assertEquals(Balance(TransactionBuilder2), 9000.00, 0.0);
	}

	@Test
	public void builderType3Test() {

		TransactionBuilderclass TransactionBuilderclass = new TransactionBuilderclass();
		TransactionBuilderclass.accountHolderName("Mala").accountNumber(001).balance(1000.00).isBalanceCheck(true);

		TransactionBuilder transactionBuilderBuilder = TransactionBuilderclass.load();
		assertEquals(Balance(transactionBuilderBuilder), 1000.00, 0.0);

		TransactionBuilderclass.accountHolderName("Pavan").accountNumber(002).balance(10000.00).isBalanceCheck(true)
				.creditAmount(1000.00).debitAmount(3000);
		transactionBuilderBuilder = TransactionBuilderclass.load();
		assertEquals(Balance(transactionBuilderBuilder), 8000.00, 0.0);

	}

	private static double Balance(TransactionBuilder TransactionBuilder) {
		if (TransactionBuilder.isBalanceCheck()) {
			return TransactionBuilder.getBalance();
		}
		return 0;
	}
}
