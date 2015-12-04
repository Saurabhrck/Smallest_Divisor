import java.util.*;

public class Scd {

	public static void main(String[] args){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer");
		n=sc.nextInt();
		if (n%2==0){
			System.out.println("The smallest divisor of "+n+" is 2");
		}
		else{
			double p=Math.sqrt(n);
			double q=Math.floor(p);
			int z=1;
			for(int i=3;i<=q;i+=2){
				if(n%i==0){
					System.out.println("The smallest divisor is "+i);
					z=0;
					break;
				}
			}
			if(z==1){
			System.out.println("The smallest divisor is 1");
			System.out.println("The number is prime");
			}
			
		}
	sc.close();	
	}
}
