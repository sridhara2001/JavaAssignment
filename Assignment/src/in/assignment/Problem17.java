package in.assignment;

import java.util.Scanner;

//Factorial of a Number
public class Problem17 {
	public static int factorial(int n) {
		int fact=1;
		for(int i=n; i>=1; i--) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("Enter factorial Number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print("The factorial of "+num+" = ");
		int result = Problem17.factorial(num);
		System.out.print(result);

	}

}
