package com;
import java.util.Scanner;
public class ItemDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner sc1=new Scanner(System.in);
		Item[] items=new Item[5];
		for (int i=0;i<items.length;i++){
			System.out.println("Enter Item Id");
			int id=sc.nextInt();
			System.out.println("Enter Item Name");
			String name=sc1.nextLine();
			System.out.println("Enter Item Price");
			double price=sc.nextDouble();
			System.out.println("Enter Item Discount");
			double discount=sc.nextDouble();
			items[i]=new Item(id,name,price,discount);
		}
		String result=getLeastPriceItem(items);
		System.out.println("The least prices item is: "+result);
	}
	public static String getLeastPriceItem(Item[] items){
		Item temp=items[0];
		for(int i=1;i<items.length;i++){
			if((temp.getItemPrice()-(temp.getItemPrice()*temp.getItemDiscount()/100))>(items[i].getItemPrice()-(items[i].getItemPrice()*items[i].getItemDiscount()/100)))
			{
				temp=items[i];
			}
		}
		return temp.getItemName();
	}

}
