//filename CreditCardDemo.java
package com;

public class CreditCardDemo {

	public static void main(String[] args) {
		Customer x1=new Customer(11,101,400);
		Customer x2=new Customer(12,102,1400);
		Customer x3=new Customer(13,103,2000);
		Customer x4=new Customer(14,104,2600);
		Customer x5=new Customer(15,105,10000);
		System.out.println("The payback amount for 1st persion is: "+CreditCardCompany.getPybackAmount(x1));
		System.out.println("The payback amount for 2nd persion is: "+CreditCardCompany.getPybackAmount(x2));
		System.out.println("The payback amount for 3rd persion is: "+CreditCardCompany.getPybackAmount(x3));
		System.out.println("The payback amount for 4th persion is: "+CreditCardCompany.getPybackAmount(x4));
		System.out.println("The payback amount for 5th persion is: "+CreditCardCompany.getPybackAmount(x5));
	}

}
