package com;

public class ReeferContainer extends Container {
	String coolingUnitName;
	public ReeferContainer(String num, String code, int size, String unit){
		super(num,code,size); //implementing super constructor 
		coolingUnitName=unit;
	}
	public void display() //Implementing abstract method in child class  
	{
		System.out.println("Reefer Container details:");
		System.out.println("Container number is: "+super.ctrNumber+" Iso Code is: "+super.isoCode+" size is: "+super.size+" unit name is: "+coolingUnitName); //Access parent class non-static instance variables using super keyword 
	}
}
