package in.assignment;

import java.util.Scanner;

// Harshad Number (Number which is divisible by sum of its digits)
public class Problem23 {
	public static void isHarshad(int num) {
		int n=num;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			n=n/10;
			sum=sum+rem;
		}
		System.out.println("The sum of digits of above number is : "+sum);
		if(num%sum==0) {
			System.out.println(num+" is Harshad Number");
		} else {
			System.out.println(num+" is not Harshad Number");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Problem23.isHarshad(num);

	}

}
