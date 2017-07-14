package com.hon.bearBank.dataprovider;

import java.util.List;

import com.hon.bearBank.entity.Account;

public interface AccountDao {
	public void insert(Account account);
	public void update(Account account);
	public void update(List<Account> accounts);
	public void delete(Long accountId);
	public Account find(Long accountId);
}
