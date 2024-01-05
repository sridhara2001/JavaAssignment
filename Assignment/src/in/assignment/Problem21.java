package in.assignment;

import java.util.Scanner;

// Perfect Square Number (The number is equal to sum of its divisors)
public class Problem21 {
	public static void isPerfect(int num) {
		int sum=0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		System.out.println("The sum of divisors of "+num+" = "+sum);
		if(num==sum) {
			System.out.println(num+" is Perfect Square Number");
		} else {
			System.out.println(num+" is not Perfect Square Number");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Problem21.isPerfect(num);

	}

}
