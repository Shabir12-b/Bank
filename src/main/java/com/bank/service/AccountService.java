package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.AccountDao;
import com.bank.entity.Account;
@Service
public class AccountService {
	@Autowired
	AccountDao ad;

	public String setAc(Account ac) {
		
		return ad.setAc(ac);
	}

	public String setAllAc(List<Account> ac) {
		return ad.setAllAc(ac);
	}

	public List<Account> getAllAc() {
		
		return ad.getAllAc();
	}

	public Account getById(int x) {
		return ad.getById(x);
	
	}

	public Account getByAccountNumber(long y) {
		
		return ad.getByAccountNumber(y);
	}

	public List<Account> getByName(String z) {
		
		return ad.getByName(z);
	}

	public Account getMax() {
		
		return ad.getMax();
	}

	public Account getMin() {
		
		return ad.getMin();
	}

	public List<Account> getAccByName(String zx) {
		return ad.getAccByName(zx);
	}

	public List<String> getBranchByName(String r) {
		return ad.getBrachByName(r);
	}

	

}
