package bank;

import java.math.BigInteger;
import java.util.*;

public class Account {

	private BigInteger accountNumber;
	private String ifsc;
	private String name;
	private String address;
	private double balance;
	private Type type;
	private ArrayList<String> statement = new ArrayList<String>();
	Date date ;
	
	public Account(String accountNumber,String ifsc, Type type,String name,String address) {
		this.accountNumber=new BigInteger(accountNumber);
		this.ifsc=ifsc;
		this.type=type;
		this.name=name;
		this.address=address;
		date= new Date();
		setStatement("Account Created on "+ date);
	}
	/**
	 * @return the accountNumber
	 */
	public BigInteger getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * @return the statement
	 */
	public ArrayList<String> getStatement() {
		return statement;
	}
	/**
	 * @param statement the statement to set
	 */
	public void setStatement(String detail) {
		statement.add(detail);
	}
	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}
	/**
	 * @return the ifsc
	 */
	public String getIfsc() {
		return ifsc;
	}
	/**
	 * @param ifsc the ifsc to set
	 */
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
	
	public void getAccountDetails() {
		System.out.println("Account Number : "+getAccountNumber());
		System.out.println("IFSC : "+getIfsc());
		System.out.println("Type : "+getType());
		System.out.println("Name : "+getName());
		System.out.println("Address : "+getAddress());
		System.out.println("Balance : "+getBalance());
	}
	

}