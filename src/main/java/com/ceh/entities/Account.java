package com.ceh.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_no")
	protected int accountno;
	@Column(name = "account_holder_nm")
	protected String accountholdername;
	@Column(name = "account_type")
	protected String accounttype;
	protected double balance;
	public int getAccounntno() {
		return accountno;
	}
	public void setAccounntno(int accountno) {
		this.accountno = accountno;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "account [accountno=" + accountno + ", accountholdername=" + accountholdername + ", accounttype="
				+ accounttype + ", balance=" + balance + "]";
	}
	
	


}
