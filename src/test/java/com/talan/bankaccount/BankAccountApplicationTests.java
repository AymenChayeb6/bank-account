package com.talan.bankaccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.talan.bankaccount.dto.Account;
import com.talan.bankaccount.dto.Money;

@SpringBootTest
class BankAccountApplicationTests {

	private Account account;

	@BeforeEach
	public void initAccount() {
		this.account = new Account();
	}
	
	@Test
	void deposit() {
		this.account.deposit(new Money(100));
		assertEquals(new Money(100), this.account.getBalance());
	}
	
	@Test
	void withdraw() {
		this.account.withdraw(new Money(150));
		assertEquals(new Money(-150), this.account.getBalance());
	}
	
	@Test
	void transferAmountToAnotherBankAccount() {
		Account srcAcc = new Account();
		srcAcc.deposit(new Money(200));
		this.account.transferAmount(srcAcc, new Money(50));
		assertEquals(new Money(50), this.account.getBalance());
		assertEquals(new Money(150), srcAcc.getBalance());
	}
}
