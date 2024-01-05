package in.assignment;

import java.util.Scanner;

//Factors of a number (The Divisors of Number)
public class Problem19 {
	public static void factors(int n) {
		System.out.print("The Factors above number is : ");
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Problem19.factors(num);

	}

}
