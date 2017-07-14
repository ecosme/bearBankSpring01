package com.hon.bearBank.service;

import com.hon.bearBank.dataprovider.AccountDao;
import com.hon.bearBank.entity.Account;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao acctDao){
		this.accountDao = acctDao;
	}
	
	@Override
	public void transferMoney(long sourceAccountId, long targetAccountId, double amount) {
		Account srcAcct = accountDao.find(sourceAccountId);
		Account trgAcct = accountDao.find(targetAccountId);
		srcAcct.setBalance(srcAcct.getBalance() - amount);
		trgAcct.setBalance(trgAcct.getBalance() + amount);
		accountDao.update(srcAcct);
		accountDao.update(trgAcct);
	}

	@Override
	public void depositMoney(long accountId, double amount) throws Exception {
		Account acct = accountDao.find(accountId);
		acct.setBalance(acct.getBalance() + amount);
		accountDao.update(acct);
	}

	@Override
	public Account getAccount(long accountId) {
		return accountDao.find(accountId);
	}

}
