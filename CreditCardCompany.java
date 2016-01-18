//filename CreditCardCompany.java
package com;
public class CreditCardCompany {

	public static double getPybackAmount(Customer c){
		double a=c.getCreditCardCharges();
		double pb=0.0;
		if(a<=500){
			pb=a*(.25/100);
		}
		else{
			pb=500*(.25/100);
			a=a-500;
			if(a<=500){
				pb=pb+(a*(.25/100));				
			}
			if (a>500 && a<=1500){
				pb=pb+(a*(.5/100));				
			}
			if (a>1500){
				pb=pb+(1500*(.5/100));				
				a=a-1500;
				if(a>500 && a<=1500){
					pb=pb+(a*(.5/100));					
				}
				else if(a<=500){
					pb=pb+(a*(.25/100));				
				}
				else
					if(a>1500 && a<=2500){
						pb=pb+(a*(.75/100));
					}
					else{
						pb=pb+(2500*(.75/100));						
						a=a-2500;
						if (a<=500){
							pb=pb+(a*(.25/100));							
						}
						if(a>500 && a<=1500){
							pb=pb+(a*(.5/100));							
						}
						if(a>1500 && a<=2500){
							pb=pb+(a*(.75/100));							
						}
						if(a>2500){
							pb=pb+(a/100);							
						}
					}
			}
		}
		return pb;
	}
}
