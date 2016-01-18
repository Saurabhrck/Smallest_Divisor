package com;
import java.util.*;
public class LGManagement {
	private LGDetails[] lgDetailsArr=new LGDetails[10];
	public LGManagement(LGDetails[] lgDetailsArr){
		this.lgDetailsArr=lgDetailsArr;
	}
	public int addLG(LGDetails a,int b){
		if(a==null||b>=lgDetailsArr.length){
			return -1;
		}
		else if(lgDetailsArr[b]!=null){
			return 0;
		}
		else{
			lgDetailsArr[b]=a;
			return 1;
		}
	}
	public int findLGStrength(String a){
		int count = 0;
		if(a==null){
			count=-1;
		}
		else{
			for (int i=0;i<lgDetailsArr.length;i++){
				if(a.compareTo(lgDetailsArr[i].getLgName())==0){
					count=lgDetailsArr[i].getNumTrainees();
				}
				
			}
		}
		return count;
	}
	public ArrayList<LGDetails> copyLGtoList(int min,int max){
		ArrayList<LGDetails> a =new ArrayList<LGDetails>();
		for (LGDetails b:lgDetailsArr){
			if(b.getNumTrainees()>=min&&b.getNumTrainees()<=max){
				a.add(b);
			}
		}
		return a;
	}
}
