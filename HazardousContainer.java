package com;

public class HazardousContainer extends Container {
	int imdgClass;
	String imdgCode;
	public HazardousContainer(String num, String code, int size, int inclass, String gcode){
		super(num,code,size); //implementing super constructor 
		imdgClass=inclass;
		imdgCode=gcode;
	}
	public void display() //Implementing abstract method in child class 
	{
		System.out.println("Hazardous Container details:");
		System.out.println("Container number is: "+super.ctrNumber+" Iso Code is: "+super.isoCode+" size is: "+super.size+" Imdg class is: "+imdgClass+" Imdg Code is: "+imdgCode); //Access parent class non-static instance variables using super keyword
	}
}
