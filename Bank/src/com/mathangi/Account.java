package com.mathangi;

public class Account {
	void withdraw(int amount) {	}
	
	boolean validate(int amount) {
		AccountValidator accountValidator = new AccountValidator();
		try {
			if(accountValidator.accountValidate()>0) {
				if(amount > 10000) {
					throw new IllegalArgumentException("Allowed limit exceeded!!");
			}
			return true;
		} else
			return false;
		} catch(IllegalStateException is) {
			throw new RuntimeException("Account validation fails");
		}
		
	}
}
