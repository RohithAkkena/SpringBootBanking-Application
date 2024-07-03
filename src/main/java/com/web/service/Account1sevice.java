package com.web.service;

import java.util.List;

import com.web.model.Account1;

public interface Account1sevice {
	public Account1 saveAccount(Account1 account);
	public Account1 updateAccount(int account_number);
	public  String depositAmount(Account1 account,int account_number);
	public Account1 withdrawAmount(Account1 account,int account_number);
	public String transferAmount(Account1 account, int account_number1,int account_number2);
	public Account1 closeAccount(Account1 account,int account_number);
	public String getbalance(Account1 account,int account_number);
	public List<Account1>getAll(Account1 account);
	public void deleteAccount(Account1 account,int account_number);
	
	
	
}
