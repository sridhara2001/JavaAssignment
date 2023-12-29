package in.assignment;

import java.util.Scanner;

// Number is even or odd
public class Problem2 {
	public static void isEven(int num) {
		if(num%2==0) {
			System.out.println(num+" is a Even Number");
		}else {
			System.out.println(num+" is a Odd Number");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Problem2.isEven(num);

	}

}
