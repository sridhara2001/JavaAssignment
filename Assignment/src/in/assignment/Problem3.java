package in.assignment;

import java.util.Scanner;

// Sum of First N natural numbers
public class Problem3 {
	public static int sumOfNumbers(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = Problem3.sumOfNumbers(num);
		System.out.println("Sum of First "+num+" Natural numbers is "+result);

	}

}
