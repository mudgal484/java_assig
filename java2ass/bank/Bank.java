package bank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank implements bank1 {

	private String bankName;
	private double rateOfInterest;
	private ArrayList<Account> accountList = new ArrayList<Account>();
	
	public Bank(String bankName,double rateOfInterest) {
		this.bankName=bankName;
		this.rateOfInterest=rateOfInterest;
		
		
		try {
		      File myObj = new File(bankName+"_transaction_log.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } 
		      
		    } catch (IOException e) {}
	}
	

	/**
	 * @return the accountList
	 */
	public ArrayList<Account> getAccountList() {
		return accountList;
	}

	public boolean registerAccount(Account account) {
		// TODO Auto-generated method stub
		accountList.add(account);
		setTransaction_log("Account Number - " + account.getAccountNumber() + " is registered");
		return true;
	}
	
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("Bank : "+bankName);
		System.out.println("Interest Rate "+rateOfInterest);
	}

	/**
	 * @return the transaction_log
	 */
	public void getTransaction_log() {
		try(Scanner scanner = new Scanner(new File(bankName+"_transaction_log.txt"))) {
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	/**
	 * @param transaction_log the transaction_log to set
	 */
	public void setTransaction_log(String transaction) {
		
		try(PrintWriter writer = new PrintWriter(bankName+"_transaction_log.txt")) {
			writer.println(transaction);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public Account getAccount(String ac_no){
		
		// TODO Auto-generated method stub
		Account acc=null;
		BigInteger temp = new BigInteger(ac_no);
		for(Account x : accountList) {
			
			if(temp.equals( x.getAccountNumber() ) ) {
				acc= x;
			}
		}
		return acc;
	}

	public void deductAmount(Account acc,double deduct_amount) {
		// TODO Auto-generated method stub
		double bal =acc.getBalance();
		double new_balance=bal-deduct_amount;
		acc.setBalance(new_balance);
		setTransaction_log("On "+new Date()+"From - "+acc.getAccountNumber()+" Balance "+bal+" Amount withdrawl - "+deduct_amount+" Left Balance - "+acc.getBalance());
		acc.setStatement("On "+new Date()+"From - "+acc.getAccountNumber()+" Balance "+bal+" Amount withdrawl - "+deduct_amount+" Left Balance - "+acc.getBalance());
	}
	
	public void addAmount(Account acc,double add_amount) {
		double bal =acc.getBalance();
		double new_balance=bal+add_amount;
		acc.setBalance(new_balance);
		setTransaction_log("On "+new Date()+"To - "+acc.getAccountNumber()+" Balance "+bal+" Amount deposited - "+add_amount+" New Balance - "+acc.getBalance());
		acc.setStatement("On "+new Date()+"To - "+acc.getAccountNumber()+" Balance "+bal+" Amount deposited - "+add_amount+" New Balance - "+acc.getBalance());
	
	}


}