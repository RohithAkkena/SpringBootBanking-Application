package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.model.Account1;
import com.web.service.Account1serviceImp;

@Controller
public class Account1Controller {
	@Autowired
	private Account1serviceImp service;
	@RequestMapping("/")
	public String homepage() {
		return "home1";	
	}
	@RequestMapping("/newaccount")
	public String newaccountpage() {
		return "newaccount";	
	}
	@RequestMapping("/Newaccount")

	public String savepage(Account1 account) {
		service.saveAccount(account);
		return "redirect:/viewaccount";	
	}
	@RequestMapping("/balance")
	public String	balancepage() {
		
		return "balance";	
	}
	@RequestMapping("/getbalance")
	public String	balanceview(Account1 account,@RequestParam int account_number,ModelMap mod) {
		mod.put("amount", service.getbalance(account,account_number));
		return "view";	
	}
	@RequestMapping("/deposit")
	public String depositpage() {
		return "deposit";	
	}
	@RequestMapping("/Deposit")
	@ResponseBody
	public String	deposit(Account1 account,@RequestParam int account_number,ModelMap mod) {
		mod.put("ans",  service.depositAmount(account,account_number));
		return "sucess";	
	}
	@RequestMapping("/withdraw")
	public String withdrawpage() {
		return "withdraw";	
	}
	@RequestMapping("/Withdraw")

	public String	withdraw(Account1 account,@RequestParam int account_number,ModelMap mod) {
		 mod.put("accounts",service.withdrawAmount(account,account_number));
		return "redirect:/viewaccount";	
	}
	@RequestMapping("/transfer")
	public String transferpage() {
		return "transfer";	
	}
	@RequestMapping("/Transfer")
	@ResponseBody
	public String	transfer(Account1 account,@RequestParam int account_number,@RequestParam int taccount_number,ModelMap mod) {
		 mod.put("accounts", service.transferAmount(account,account_number,taccount_number));
		return "sucess";	
	}
	@RequestMapping("/close")
	public String closepage() {
		return "close";	
	}
	
	  @RequestMapping("/Closeacc")
	  public String close(Account1 account,@RequestParam int account_number,ModelMap mod) {
	  mod.put("acco",service.closeAccount(account,account_number));
      return "redirect:/viewaccount"; 
      }
	  @RequestMapping("/viewaccount")
	  public String viewpage(Account1 account,ModelMap model) {
		  model.put("Account1s", service.getAll(account));
		  return"views";
	  }
	  @RequestMapping("/delete/{account_number}")
	  public String delete(Account1 account,@PathVariable int account_number) {
		  service.deleteAccount(account, account_number);
		  return"redirect:/viewaccount";
	  }
	 }
