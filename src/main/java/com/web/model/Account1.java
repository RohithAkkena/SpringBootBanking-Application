package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account1 {
@Id
	private int account_number;
	private String name;
	private String password;
	private String con_password;
	private double amount;
	private String address;
	private long mobile_num;
	private String status;
	public Account1() {
		super();
	}
	public Account1(int account_number, String name, String password, String con_password, double amount,
			String address, long mobile_num, String status) {
		super();
		this.account_number = account_number;
		this.name = name;
		this.password = password;
		this.con_password = con_password;
		this.amount = amount;
		this.address = address;
		this.mobile_num = mobile_num;
		this.status = status;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCon_password() {
		return con_password;
	}
	public void setCon_password(String con_password) {
		this.con_password = con_password;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(long mobile_num) {
		this.mobile_num = mobile_num;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Account1 [account_number=" + account_number + ", name=" + name + ", password=" + password
				+ ", con_password=" + con_password + ", amount=" + amount + ", address=" + address + ", mobile_num="
				+ mobile_num + ", status=" + status + "]";
	}
	
		
	

}
