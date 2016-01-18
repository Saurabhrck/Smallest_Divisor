package com;

public class ContainerDetails {

	public static void main(String[] args) {
		ReeferContainer ct1=new ReeferContainer("ONLR4534349","40RH",40,"FREEZER");
		HazardousContainer ct2=new HazardousContainer("PONH8743549","45EU",45,123,"DAN");
		Container ct;
		ct=ct1; //create runtime reference to ReeferContainer 
		ct.display(); //dynamic method dispatch for ReeferContainer display method
		ct=ct2; ////create runtime reference to HazardousContainer
		ct.display(); //dynamic method dispatch for HazardousContainer display method

	}

}
