package com.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{
	
    @Query(value = "select * from account_details where account_number = ?  ", nativeQuery=true)
	Account getByAccountNumber(long y);
    
    @Query(value = "select * from account_details where name = ? ", nativeQuery=true)
	List<Account> getByName(String z);

   @Query(value="select * from account_details where available_balance = (select max(available_balance) from account_details)", nativeQuery=true)
   // @Query(value = "select * from account_details order by available_balance desc limit 1", nativeQuery=true)
	Account getMax();

   @Query(value="select * from account_details where available_balance = (select min(available_balance) from account_details)", nativeQuery=true)
   //@Query(value = "select * from account_details order by available_balance limit 1", nativeQuery = true)
	Account getMin();
   

   @Query(value="Select * from account_details where name = ?", nativeQuery=true)
    List<Account> getAccByName(String zx);

   @Query(value="select branch from account_details where name = ?", nativeQuery=true)
    List<String> getBranchByName(String r);

}
