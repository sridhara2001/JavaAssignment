package in.assignment;

import java.util.Scanner;

// Nth Fibonacci term
public class Problem16 {
	public static int nthfibonacci(int n) {
		int firstTerm=0;
		int secondTerm=1;
		int nextTerm;
		for(int i=2; i<=n; i++) {
			nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
		return secondTerm;
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = Problem16.nthfibonacci(num);
		System.out.println("The "+num+"th term in fibonacci series is : "+result);

	}

}
