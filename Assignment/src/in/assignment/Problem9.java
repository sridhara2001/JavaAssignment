package in.assignment;

import java.util.Scanner;

// Sum of digits in a giver number
public class Problem9 {
	public static int sumOfDigits(int num) {
		int sum=0;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			sum += rem;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = Problem9.sumOfDigits(num);
		System.out.println("The Sum of digits in above number is "+sum);

	}

}
