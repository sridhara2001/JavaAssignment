package in.assignment;

import java.util.Scanner;

// Perfect Number (The number is equal to sum of its divisors)
public class Problem21 {
	public static int isPerfectNum(int num) {
		int sum=0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = Problem21.isPerfectNum(num);
		System.out.println("The sum of divisors of above number is : "+result);
		if(num==result) {
			System.out.println(num+" is Perfect Number");
		} else {
			System.out.println(num+" is not Perfect Number");
		}

	}

}
