package com.hon.bearBank.dataprovider;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hon.bearBank.entity.Account;

public class AccountDaoInMemoryImpl implements AccountDao {

	private Map<Long, Account> accountsMap = new HashMap<>();
	
	public AccountDaoInMemoryImpl(){
		Account acc = new Account();
		acc.setId(1L);
		acc.setOwnerName("Joaquim");
		acc.setBalance(1110.0);
		accountsMap.put(acc.getId(), acc);
		
		acc = new Account();
		acc.setId(2L);
		acc.setOwnerName("Brenda");
		acc.setBalance(2130.0);
		accountsMap.put(acc.getId(), acc);

	}
	
	
	
	public void insert(Account account) {
		accountsMap.put(account.getId(), account);
		System.out.println("Account "+ account + " inserted");
	}

	public void update(Account account) {
		// TODO Auto-generated method stub
		accountsMap.put(account.getId(), account);
		System.out.println("Account updated "+ account);

	}

	public void update(List<Account> accounts) {
		// TODO Auto-generated method stub
		int newItms = 0;
		for (Account act : accounts){
			accountsMap.put(act.getId(), act);
			newItms++;
		}
		System.out.println("Updating... New items added " + newItms);
	}

	public void delete(Long accountId) {
		// TODO Auto-generated method stub
		System.out.println("Deleting...");
		accountsMap.remove(accountId);
	}

	public Account find(Long accountId) {
		// TODO Auto-generated method stub
		System.out.println("Finding...");
		return accountsMap.get(accountId);
	}

}
