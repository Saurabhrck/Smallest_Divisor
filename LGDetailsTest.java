package com;

import java.util.ArrayList;

public class LGDetailsTest {

	public static void main(String[] args) {
		LGDetails a= new LGDetails(141,"MAS",30);
		LGDetails b= new LGDetails(142,"MJA",40);
		LGDetails c= new LGDetails(143,"MDOT",31);
		LGDetails d= new LGDetails(144,"MCPP",45);
		LGDetails e= new LGDetails(145,"MTST",66);
		LGDetails g= new LGDetails(146,"MRTL",82);
		LGDetails h= new LGDetails(147,"MSUPP",26);
		LGDetails j= null;
		LGDetails[] lgDetailsArrTest={a,b,c,d,e,g,h};
		LGManagement f=new LGManagement(lgDetailsArrTest);
		System.out.println(f.addLG(j, 6));
		System.out.println(f.findLGStrength("MCPP"));
		ArrayList<LGDetails> result=f.copyLGtoList(45, 90);
		for(LGDetails p:result){
			System.out.println(p.getLgID()+" "+p.getLgName()+" "+p.getNumTrainees());
		}
	}

}
