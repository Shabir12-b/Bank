package com.bank.dao;

import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.Account;
import com.bank.repository.AccountRepository;
@Repository
public class AccountDao {
	@Autowired
	AccountRepository ar;
	
	public Account getMax(){
		return ar.getMax();
	}

	public String setAc(Account ac) {
		ar.save(ac);
		return"SUCCESS";
		
	}

	public String setAllAc(List<Account> ac) {
		ar.saveAll(ac);
		return "SUCCESFULL";
	}

	public List<Account> getAllAc() {
		return ar.findAll();
	}

	public Account getById(int x) {
		return ar.findById(x).get();
	}

	public Account getByAccountNumber(long y) {
		return ar.getByAccountNumber(y);
	}

	public List<Account> getByName(String z) {
		return ar.getByName(z);
//		List<Account>a = getAllAc();
//		List<Account>b = a.stream().filter(x->x.getName().equalsIgnoreCase(z)).collect(Collectors.toList());
//		return b;
	}

	public Account getMin() {
		
		return ar.getMin();
	}

	public List<Account> getAccByName(String zx) {
		return ar.getAccByName(zx);
	}

	public List<String> getBrachByName(String r) {
		return ar.getBranchByName(r);
	}

}
