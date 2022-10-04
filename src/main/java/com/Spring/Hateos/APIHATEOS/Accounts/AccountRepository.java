package com.Spring.Hateos.APIHATEOS.Accounts;

import java.util.List;

 
public interface AccountRepository {
	
	List<Account> getAllAccounts();
	
	Account getAccount(String number);
	
}