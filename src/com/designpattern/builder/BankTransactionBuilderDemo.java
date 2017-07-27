package com.designpattern.builder;

import com.designpattern.builder.TransactionBuilder.TransactionBuilderclass;

public class BankTransactionBuilderDemo {

	public static void main(String[] args) {
		System.out.println("Type 1");
		type1();
		System.out.println("Type 2");
		type2();
		System.out.println("Type 3");
		type3();
	}

	private static void type3() {

		TransactionBuilderclass TransactionBuilderclass = new TransactionBuilderclass();
		TransactionBuilderclass.accountHolderName("Mala").accountNumber(001).balance(1000.00).isBalanceCheck(true);

		TransactionBuilder TransactionBuilderBuilder = TransactionBuilderclass.load();
		System.out.println("Account Holder 1 balance: " + Balance(TransactionBuilderBuilder));

		TransactionBuilderclass.accountHolderName("Pavan").accountNumber(002).balance(10000.00).isBalanceCheck(true)
				.creditAmount(1000.00).debitAmount(3000);
		TransactionBuilderBuilder = TransactionBuilderclass.load();
		System.out.println("Account Holder 2 balance: " + Balance(TransactionBuilderBuilder));

	}

	private static void type2() {
		TransactionBuilder TransactionBuilder1 = new TransactionBuilder("Malatesh", 001, 1000, false);
		System.out.println("Account Holder 1 balance: " + Balance(TransactionBuilder1));

		TransactionBuilder TransactionBuilder2 = new TransactionBuilder("Pavan", 002, 10000, true);
		TransactionBuilder2.setCreditAmount(1000);
		TransactionBuilder2.setDebitAmount(2000);
		System.out.println("Account Holder 1 balance: " + Balance(TransactionBuilder2));
	}

	private static void type1() {
		TransactionBuilder TransactionBuilder1 = new TransactionBuilder();
		TransactionBuilder1.setAccountHolderName("Malatesh");
		TransactionBuilder1.setAccountNumber(001);
		TransactionBuilder1.setBalance(1000.00);
		TransactionBuilder1.setBalanceCheck(true);
		System.out.println("Account Holder 1 balance: " + Balance(TransactionBuilder1));

		TransactionBuilder TransactionBuilder2 = new TransactionBuilder();
		TransactionBuilder2.setAccountHolderName("Pavan");
		TransactionBuilder2.setAccountNumber(002);
		TransactionBuilder2.setBalance(10000.00);
		TransactionBuilder2.setBalanceCheck(false);
		System.out.println("Account Holder 2 balance: " + Balance(TransactionBuilder2));
		TransactionBuilder2.setCreditAmount(2000.00);
		TransactionBuilder2.setBalanceCheck(true);
		System.out.println("Account Holder 2 balance: " + Balance(TransactionBuilder2));

	}

	private static double Balance(TransactionBuilder TransactionBuilder) {
		if (TransactionBuilder.isBalanceCheck()) {
			return TransactionBuilder.getBalance();
		}
		return 0;
	}
}
