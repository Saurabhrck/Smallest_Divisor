//filename Car.java

package com;

public class Car {
	public String make;
	private String model;
	private int passengerCapacity;
	private double onRoadPrice;
public Car(String make,String model,int passengerCapacity, double onRoadPrice){
	this.make=make;
	this.model=model;
	this.passengerCapacity=passengerCapacity;
	this.onRoadPrice=onRoadPrice;
}
public int getPassengerCapacity(){
	return passengerCapacity;
}
public void setPassengerCapacity(int a){
	passengerCapacity=a;
}
public double getOnRoadPrice(){
	return onRoadPrice;
}
public void setOnRoadPrice(int b){
	onRoadPrice=b;
}
public String getMake(){
	return make;
}
public String getModel(){
	return model;
}
}
