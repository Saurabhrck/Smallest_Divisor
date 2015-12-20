package com;
import java.util.*;

public class SorterDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("How many number do you need?");
		int n=sc.nextInt();
		double[] array=new double[n];
		System.out.println("Enter "+n+" double values");
		for(int c=0;c<array.length;c++){
			array[c]=sc.nextDouble();
		}
		System.out.println("The a String to be sorted");
		String line=sc1.nextLine();
		System.out.println("Enter the number of students");
		int p=sc.nextInt();
		Student[] student=new Student[p];
		for(int i=0;i<student.length;i++){
			System.out.println("Enter the roll number");
			int roll=sc.nextInt();
			System.out.println("Enter name");
			String name=sc1.nextLine();
			System.out.println("Enter marks");
			double marks=sc.nextDouble();
			student[i]=new Student(roll,name,marks);
		}
		System.out.println("The sorted array is");
		for (int i=0;i<sortDouble(array).length;i++){
			System.out.println(sortDouble(array)[i]);
		}
		System.out.println("The sorted String is: "+sortString(line));
		System.out.println("The sorted student list is: ");
		for(int i=0;i<sortStudent(student).length;i++){
			System.out.println(sortStudent(student)[i].getName()+" "+sortStudent(student)[i].getRoll()+" "+sortStudent(student)[i].getMarks());
		}
		

	}
	public static double[] sortDouble(double[] a){
		int n,c,d;
		double swap;
		n=a.length;
		for (c=0;c<(n-1);c++){
			for (d=0;d<(n-c-1);d++){
				if (a[d]>a[d+1]){
					swap=a[d];
					a[d]=a[d+1];
					a[d+1]=swap;
					
				}
			}
		}
		return a;
	}
	public static String sortString(String a){
		String sorted;
		char[] chars=a.toCharArray();
		Arrays.sort(chars);
		sorted=new String(chars);
		return sorted;
		
	}
	public static Student[] sortStudent(Student[] a){
		Student swap;
		int n,c,d;
		n=a.length;
		for (c=0;c<(n-1);c++){
			for (d=0;d<(n-c-1);d++){
				if (a[d].getMarks()>a[d+1].getMarks()){
					swap=a[d];
					a[d]=a[d+1];
					a[d+1]=swap;
				}
			}
		}
		return a;
		
	}

}
