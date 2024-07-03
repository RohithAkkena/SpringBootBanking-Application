package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.number.money.MonetaryAmountFormatter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.web.Repo.Account1Repo;
import com.web.model.Account1;
@Service
public class Account1serviceImp implements Account1sevice {
@Autowired
private Account1Repo repo;
	@Override
	public Account1 saveAccount(Account1 account) {
		account.setStatus("active");
		return repo.save(account);
	}

	@Override
	public Account1 updateAccount(int account_number) {
	
		return null;
	}

	@Override
	public String depositAmount(Account1 account,int account_number) {
		 double deposit=0.0;
		
		  Account1 acco=repo.findById(account_number).get();
		 
		  if(account.getName().equals(acco.getName()) && account.getPassword().equals(acco.getPassword())) {
			  deposit=acco.getAmount()+account.getAmount();
			  acco.setAmount(deposit);
			  repo.save(acco); 
			  return "successfully";
			 }
			 else {
				 return "enter valid details";
			 	}
		 
	}

	@Override
	public Account1 withdrawAmount(Account1 account,int account_number) {
		double withdraw=0;
		double withdraw_amount=account.getAmount();
		
		 Account1 accou=repo.findById(account_number).get();
		 double current_amount=accou.getAmount();
		if(current_amount>withdraw_amount) {
			withdraw=current_amount-withdraw_amount;
		}
		accou.setAmount(withdraw);
		repo.save(accou);
		return accou;
	}

	@Override
	public String transferAmount(Account1 account, int account_number1,int account_number2) {
	Account1 sender=repo.findById(account_number1).get();
	Account1 receiver=repo.findById(account_number2).get();
	double transfer_amount=account.getAmount();
	double sender_amount=sender.getAmount();
	double receiver_amount=receiver.getAmount();
	sender_amount=sender_amount-transfer_amount;
	receiver_amount=receiver_amount+transfer_amount;
	sender.setAmount(sender_amount);
	receiver.setAmount(receiver_amount);
	repo.save(sender);
	repo.save(receiver);
		return "sucess";
	}

	@Override
	public Account1 closeAccount(Account1 account,int account_number) {
		Account1 acc=repo.findById(account_number).get();
		acc.setStatus("deactive");
		repo.save(acc);
		return acc;
	}

	@Override
	public String getbalance(Account1 account,int account_number) {
	 Account1 acc=repo.findById(account_number).get();
	 if(account.getName().equals(acc.getName()) && account.getPassword().equals(acc.getPassword())) {
		 return String.valueOf(acc.getAmount());
	 }
	 else {
		 return "enter valid details";
		 }

	}

	@Override
	public List<Account1> getAll(Account1 account) {
		List<Account1>list=(List<Account1>)repo.findAll();
		return list;
	}

	@Override
	public void deleteAccount(Account1 account, int account_number) {
		
	 repo.deleteById(account_number);
		
	}

}
