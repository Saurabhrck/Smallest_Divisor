//filename Customer.java
package com;
public class Customer {
	private int custId;
	private int accId;
	private double creditCardCharges;
	
	public Customer(int custId,int accId,double creditCardCharges){
		this.custId=custId;
		this.accId=accId;
		this.creditCardCharges=creditCardCharges;
	}
	public double getCreditCardCharges(){
		return creditCardCharges;
	}
	public void setCreditCardCharges(double a){
		creditCardCharges=a;
	}
	public int getCustId(){
		return custId;
	}
	public int getAccId(){
		return accId;
	}
}
