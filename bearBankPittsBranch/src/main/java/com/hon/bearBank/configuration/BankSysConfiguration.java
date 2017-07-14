package com.hon.bearBank.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hon.bearBank.dataprovider.AccountDao;
import com.hon.bearBank.dataprovider.AccountDaoInMemoryImpl;
import com.hon.bearBank.service.AccountService;
import com.hon.bearBank.service.AccountServiceImpl;

@Configuration 
public class BankSysConfiguration {

	@Bean
	public AccountService accountService(){
		AccountServiceImpl acctSrvc = new AccountServiceImpl();  
		acctSrvc.setAccountDao(accountDao());
		
		return acctSrvc; 
	}
	
	@Bean
	public AccountDao accountDao(){
		AccountDaoInMemoryImpl acctDaoIm = new AccountDaoInMemoryImpl();
		return acctDaoIm;
	}
	
}
