package com;

public class Item {
	private int itemId;
	private String itemName;
	private double itemPrice;
	private double itemDiscount;
	public Item(int a, String b, double c, double d){
		itemId=a;
		itemName=b;
		itemPrice=c;
		itemDiscount=d;
	}
	public double getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(double a){
		itemPrice=a;
	}
	public double getItemDiscount(){
		return itemDiscount;
	}
	public void setItemDiscount(double a){
		itemDiscount=a;
	}
	public int getitemId(){
		return itemId;
	}
	public String getItemName(){
		return itemName;
	}
}
