package com.talan.bankaccount.dto;

public class Money {

	private int amount = 0;

	public Money(int amount) {
		this.amount = amount;
	}

	public Money minus(Money minusAmount) {
		return new Money(this.amount - minusAmount.amount);
	}

	public Money plus(Money plusAmount) {
		return new Money(this.amount + plusAmount.amount);
	}

	@Override
	public boolean equals(Object obj) {
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}

}
