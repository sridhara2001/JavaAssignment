package in.assignment;

import java.util.Scanner;

// Fibonacci Series
public class Problem15 {
	public static void fibonacci(int n) {
		int firstTerm=0;
		int secondTerm=1;
		for(int i=0; i<=n; i++) {
			System.out.print(firstTerm+" ");
			int nextTerm = firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		Problem15.fibonacci(num);

	}

}
