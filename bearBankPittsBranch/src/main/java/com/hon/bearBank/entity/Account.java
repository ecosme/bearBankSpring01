package com.hon.bearBank.entity;

import java.util.Date;

public class Account {
	private long Id;
	private String ownerName;
	private double balance;
	private Date accessTime;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Date getAccessTime() {
		return accessTime;
	}
	public void setAccessTime(Date accessTime) {
		this.accessTime = accessTime;
	}
	
	public String toString(){
		return this.Id + " " + this.getOwnerName() + " " + this.getBalance();
	}
	
}
