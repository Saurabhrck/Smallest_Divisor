//filename CarDemo.java

package com;

public class CarDemo {

	public static void main(String[] args) {
		Car one=new Car("Audi","A3",2,1000.1);
		Car two=new Car("Proshe","Spider",4,2000.2);
		Car three=new Car("Lamborghini","Veneno",3,3500.3);
		Car four=new Car("Jeep","Srt8",6,1356.4);
		System.out.println("The lowest price car is: "+bestCar(one,two,three,four,'p'));
		System.out.println("The highest passenger capacity car is: "+bestCar(one,two,three,four,'c'));
	}
	public static String bestCar(Car one,Car two,Car three,Car four, char z){
		Car best=null;
		String f=" ";
		if(z=='c'){
			Car temp=one;
			if(two.getPassengerCapacity()>temp.getPassengerCapacity()){
				temp=two;
			}
			if(three.getPassengerCapacity()>temp.getPassengerCapacity()){
				temp=three;
			}
			if(four.getPassengerCapacity()>temp.getPassengerCapacity()){
				temp=four;
			}
			best=temp;
		}
		if(z=='p'){
			Car temp1=one;
			if(two.getOnRoadPrice()<temp1.getOnRoadPrice()){
				temp1=two;
			}
			if(three.getOnRoadPrice()<temp1.getOnRoadPrice()){
				temp1=three;
			}
			if(four.getOnRoadPrice()<temp1.getOnRoadPrice()){
				temp1=four;
			}
			best=temp1;
		}
		f=best.getMake()+"-"+best.getModel();
		return f;
	}

}
