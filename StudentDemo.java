package com;
import java.util.Scanner;
public class StudentDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Student[] student=new Student[5];
		for(int i=0;i<student.length;i++){
			System.out.println("Enter the roll number");
			int roll=sc.nextInt();
			System.out.println("Enter name");
			String name=sc1.nextLine();
			System.out.println("Enter marks");
			double marks=sc.nextDouble();
			student[i]=new Student(roll,name,marks);
		}
		System.out.println("The odd splitted list is: ");
		for(int i=0;i<splitStudentArray(student,'o').length;i++){
			if(splitStudentArray(student,'o')[i]!=null){
			System.out.println(splitStudentArray(student,'o')[i].getName()+" "+splitStudentArray(student,'o')[i].getRoll()+" "+splitStudentArray(student,'o')[i].getMarks());
			}
		}
		System.out.println("The even splitted list is: ");
		for(int i=0;i<splitStudentArray(student,'e').length;i++){
			if(splitStudentArray(student,'e')[i]!=null){
			System.out.println(splitStudentArray(student,'e')[i].getName()+" "+splitStudentArray(student,'e')[i].getRoll()+" "+splitStudentArray(student,'e')[i].getMarks());
			}
		}
	}
	public static Student[] splitStudentArray(Student[] student, char a){
		Student[] temp=new Student[5];
		if (a=='o'){
				int i=0;
				for(int j=0;j<student.length;j++){
					if((student[j].getMarks())%2==1){
						temp[i]=student[j];
						i++;
					}
				}
		}
		else if (a=='e'){
			int i=0;
			for(int j=0;j<student.length;j++){
				if((student[j].getMarks())%2==0){
					temp[i]=student[j];
					i++;
				}
			}
		}
		else
			System.out.println("no catagory specified");
	return temp;	
	}
}
