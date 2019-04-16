package com.mathangi.java.exception;

public class Printer {
	void print(int noc) {
		for(int i=noc; i!=0; i--) {
			System.out.println("printing");
		}
	}
	
	boolean validate(int noc) {
		if (noc <0) {
			throw new IllegalArgumentException("NOC should be >0");
		}
		else
			return true;
		}	
}
