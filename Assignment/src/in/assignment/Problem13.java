package in.assignment;

import java.util.Scanner;

// Whether number is Armstrong or not
public class Problem13 {
	public static void isArmstrong(int num) {
		int n=num;
		int digits=0;
		while(n>0) {
			n = n/10;
			digits = digits+1;
		}
		
		int n1=num;
		int sum=0;
		while(n1>0) {
			int rem=n1%10;
			n1=n1/10;
			sum = (int)(sum+Math.pow(rem, digits));
		}
		if(num==sum) {
			System.out.println(num+" is Armstrong number");
		}else {
			System.out.println(num+" is not a Armstrong number");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		Problem13.isArmstrong(num);

	}

}
