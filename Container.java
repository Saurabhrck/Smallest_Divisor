package com;

public abstract class Container {
	String ctrNumber;
	String isoCode;
	int size;
	public Container(String a, String b, int c ){
		ctrNumber=a;
		isoCode=b;
		size=c;
	}
	public abstract void display(); //abstract method display

}
