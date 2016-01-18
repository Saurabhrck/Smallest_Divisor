package com;

public class LGDetails {
	private int lgID;
	private String lgName;
	private int numTrainees;
	public LGDetails(int lgId, String lgName, int numTrainees){
		this.lgID=lgId;
		this.lgName=lgName;
		this.numTrainees=numTrainees;
	}
	public int getLgID(){
		return lgID;
	}
	public void setLgID(int lgID){
		this.lgID=lgID;
	}
	public String getLgName(){
		return lgName;
	}
	public void setLgName(String lgName){
		this.lgName=lgName;
	}
	public int getNumTrainees(){
		return numTrainees;
	}
	public void setNumTrainees(int numTrainees){
		this.numTrainees=numTrainees;
	}
}
