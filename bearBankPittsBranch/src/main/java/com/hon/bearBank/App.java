package com.hon.bearBank;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hon.bearBank.configuration.BankSysConfiguration;
import com.hon.bearBank.service.AccountService;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(BankSysConfiguration.class);
        
        AccountService acctSrvc =appContext.getBean("accountService", AccountService.class);
        System.out.println("Prepraring money transfer...");
        System.out.println("Account Source " + acctSrvc.getAccount(1).getBalance());
        System.out.println("Account Target " + acctSrvc.getAccount(2).getBalance());
        
        acctSrvc.transferMoney(acctSrvc.getAccount(1).getId(), acctSrvc.getAccount(2).getId(), 620.0);
        System.out.println("After transfer...");
        System.out.println("Account Source " + acctSrvc.getAccount(1).getBalance());
        System.out.println("Account Target " + acctSrvc.getAccount(2).getBalance());
    }
}
