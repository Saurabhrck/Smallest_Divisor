package com;

public class Student {
	private int rollNo;
	private String name;
	private double marks;
	public Student(int a, String b, double c){
		rollNo=a;
		name=b;
		marks=c;
	}
	public double getMarks(){
		return marks;
	}
	public void setMarks(int a){
		marks=a;
	}
	public int getRoll(){
		return rollNo;
	}
	public String getName(){
		return name;
	}
}
