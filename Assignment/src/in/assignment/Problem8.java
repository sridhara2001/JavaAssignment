package in.assignment;

import java.util.Scanner;

// Checking a number is prime number or not
public class Problem8 {
	public static boolean isPrime(int num) {
		boolean flag = true;
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean result = Problem8.isPrime(num);
		if(result==true) {
			System.out.println(num+" is prime number");
		}else {
			System.out.println(num+" is not prime number");
		}

	}

}
