package com.designpattern.builder;

public class TransactionBuilder {

	public TransactionBuilder() {
	}

	public static class TransactionBuilderclass {

		private String accountHolderName;
		private int accountNumber;
		private double creditAmount;
		private double debitAmount;
		private boolean balanceCheck;
		private double balance;

		public TransactionBuilderclass() {
		}

		public TransactionBuilder load() {
			return new TransactionBuilder(this);
		}

		public TransactionBuilderclass accountHolderName(String accountHolderName) {
			this.accountHolderName = accountHolderName;
			return this;
		}

		public TransactionBuilderclass accountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}

		public TransactionBuilderclass balance(double balance) {
			this.balance = balance;
			return this;
		}

		public TransactionBuilderclass isBalanceCheck(boolean balanceCheck) {
			this.balanceCheck = balanceCheck;
			return this;
		}

		public TransactionBuilderclass creditAmount(double creditAmount) {
			this.creditAmount = creditAmount;
			return this;
		}

		public TransactionBuilderclass debitAmount(double debitAmount) {
			this.debitAmount = debitAmount;
			return this;
		}
	}

	private String accountHolderName;

	private int accountNumber;

	private double creditAmount;

	private double debitAmount;

	private boolean balanceCheck;

	private double balance;

	public TransactionBuilder(String accountHolderName, int accountNumber, int balance, boolean isBalanceCheck) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.balanceCheck = isBalanceCheck;
	}

	public TransactionBuilder(TransactionBuilderclass transactionBuilderclass) {
		this.accountHolderName = transactionBuilderclass.accountHolderName;
		this.accountNumber = transactionBuilderclass.accountNumber;
		this.balance = transactionBuilderclass.balance;
		this.balanceCheck = transactionBuilderclass.balanceCheck;
		this.creditAmount = transactionBuilderclass.creditAmount;
		this.debitAmount = transactionBuilderclass.debitAmount;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}

	public double getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}

	public boolean isBalanceCheck() {
		return balanceCheck;
	}

	public void setBalanceCheck(boolean balanceCheck) {
		this.balanceCheck = balanceCheck;
	}

	public double getBalance() {
		balance = (balance + creditAmount) - debitAmount;
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
