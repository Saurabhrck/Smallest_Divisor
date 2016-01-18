package com;

import java.io.*;



class Test {
	 public static void main(String[] args) throws IOException{
		try{
			
		
		 int[] b={1,2,3,4,5,6};
		 OutputStream c=new FileOutputStream("Text.txt");
		 for(int a:b){
			 c.write(a);
		 }
		 c.close();
		 InputStream d=new FileInputStream("Text.txt");
		 	for(int a=0;a<d.available();a++){
		 		System.out.println((char)d.read()+" ");
		 	}
		 	d.close();
	 }finally{
		 
	 }
	 }
}
