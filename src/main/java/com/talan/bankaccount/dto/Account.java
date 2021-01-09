package com.talan.bankaccount.dto;

public class Account {

	private Money balance = new Money(0);

	public Money getBalance() {
		return balance;
	}

	public void deposit(Money amount) {
		this.balance = this.balance.plus(amount);
	}

	public void withdraw(Money amount) {
		this.balance = this.balance.minus(amount);
	}

	public void transferAmount(Account srcAcc, Money amount) {
		deposit(amount);
		srcAcc.withdraw(amount);
		
	}

}
