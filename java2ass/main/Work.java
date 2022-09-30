package main;

import bank.*;


public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank sbi = SBI.getInstance();
		Account sbi1 = new Account("7017227506","sbi0066",Type.SAVINGS,"Krishna","Mathura");
		sbi.registerAccount(sbi1);
		sbi.getDetails();
		sbi.getAccount("7017227506").getAccountDetails();
		
		sbi.addAmount(sbi1,1000);
		sbi.deductAmount(sbi1, 100);
		System.out.println("-------bank accunt statements------");
		for(String stmt : sbi.getAccount("7017227506").getStatement()) {
			System.out.println(stmt);
		}
	}

}