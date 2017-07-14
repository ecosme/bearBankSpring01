package com.hon.bearBank.service;

import com.hon.bearBank.entity.Account;

public interface AccountService {
	public void transferMoney(long sourceAccountId, long targetAccountId, double amount);
	public void depositMoney(long accountId, double amount) throws Exception;
	public Account getAccount(long accoutId);
}
