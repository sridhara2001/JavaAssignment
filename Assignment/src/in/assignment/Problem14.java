package in.assignment;

import java.util.Scanner;

// Finding the Armstrong numbers in an Interval
public class Problem14 {

	public static void main(String[] args) {
		System.out.println("Enter Range of Number");
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.print("The Armstrong numbers in the interval range of "+n1+" and "+n2+" is: ");
		
		for(int i=n1; i<=n2; i++) {
			boolean flag=true;
			int num=i;
			int digits=0;
			while(num>0) {
				num = num/10;
				digits = digits+1;
			}
			
			int num1=i;
			int sum=0;
			while(num1>0) {
				int rem=num1%10;
				num1=num1/10;
				
				int r=1;
				for(int j=1; j<=digits; j++) {
					r=r*rem;
				}
				sum=sum+r;
			}
			if(i==sum) {
				System.out.print(i+" ");
			}
		}
		System.out.println();

	}

}
