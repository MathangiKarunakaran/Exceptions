package com.mathangi;

public class SavingsAccount {
	
	
	/*void withdraw(int amount) {
		try {
		ac.checkBalance(amount);
		} 
		catch (RuntimeException re) {
			System.out.println("Sorry "+re);
		}
		
	}*/
	void withdraw(int amount) {
		Account account= new Account();
		try {
			if(account.validate(amount)) {
				System.out.println("withdraw success");
			}
		} catch (IllegalStateException | IllegalArgumentException ie) {
			System.out.println("withdraw fails "+ ie);
		}
	}
}
