package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Account;
import com.bank.service.AccountService;

@RestController
@RequestMapping(value="/Acc")
public class AccountController {
	@Autowired
	AccountService as;
	
	@PostMapping(value="/setAc")
	public String setAc(@RequestBody Account ac ) {
		return as.setAc(ac);
	}
	@PostMapping(value="/setAllAc")
	public String setAllAc(@RequestBody List<Account> ac) {
		return as.setAllAc(ac);
	}
	@GetMapping(value="/getAllAc")
	public List<Account> getAllAc() {
		return as.getAllAc();
	}
	@GetMapping(value="/getById/{x}")
	public Account getById(@PathVariable int x) {
		return as.getById(x);
	}
	@GetMapping(value="/getByAccountNumber/{y}")
	public Account getByAccountNumber(@PathVariable long y) {
		return as.getByAccountNumber(y);
	}
	@GetMapping(value="/getByName/{z}")
	public List<Account> getByName(@PathVariable String z) {
		return as.getByName(z);
	}
	@GetMapping(value="/getMax")
	public Account getMax() {
		return as.getMax();
	}
	@GetMapping(value="/getMin")
	public Account getMin() {
		return as.getMin();
	}
	@GetMapping(value="/getAccByName/{zx}")
	public List<Account> getAccByName(@PathVariable String zx) {
		return as.getAccByName(zx);
}
	@GetMapping(value="/getBranchByName/{r}")
	public List<String> getBranchByName(@PathVariable String r){
		return as.getBranchByName(r);
	}
}
