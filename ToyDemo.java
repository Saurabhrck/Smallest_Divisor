//filename Toy.java
package com;

public class ToyDemo {

	public static void main(String[] args) {
		Toy toy1= new Toy("apple","fruit",55.5,20.1);
		Toy toy2= new Toy("mango","fruit",30.0,15.5);
		Toy toy3= new Toy("cat","animal",45.0,10.6);
		Toy toy4= new Toy("dog","animal",36.0,9.8);
		System.out.println("The least price is: " +getLeastPriceToy(toy1,toy2,toy3,toy4,"animal"));
		System.out.println("The least price is: " +getLeastPriceToy(toy1,toy2,toy3,toy4,"fruit"));
	}
	public static String getLeastPriceToy(Toy toy1,Toy toy2,Toy toy3,Toy toy4,String category){
		double fprice = 0;
		double temp;
		String min_name=" ";
		if (category==" "){
			System.out.println("No category found");
		}
		else{
			if(toy1.getCategory().equals(category)){
				fprice=toy1.getPrice()-(toy1.getPrice()*toy1.getDiscount()/100);
				min_name=toy1.getName();
			}
			if(toy2.getCategory().equals(category)){
				temp=fprice;
				fprice=toy2.getPrice()-(toy2.getPrice()*toy2.getDiscount()/100);
				if(fprice<temp){
					min_name=toy2.getName();
				}
			}
			if(toy3.getCategory().equals(category)){
				fprice=toy3.getPrice()-(toy3.getPrice()*toy3.getDiscount()/100);
				min_name=toy3.getName();
			}
			if (toy4.getCategory().equals(category)){
				temp=fprice;
				fprice=toy4.getPrice()-(toy4.getPrice()*toy4.getDiscount()/100);
				if(fprice<temp){
					min_name=toy4.getName();
				}
			}
		}
		
	return min_name;	
	}
}
