package in.assignment;

import java.util.Scanner;

// Abundant Number (The sum of all divisors of a number is greater than number)
public class Problem24 {
	public static void isAbundant(int num) {
		int sum=0;
		System.out.print("The divisors of above number are : ");
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum=sum+i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("The sum of divisors of "+num+" = "+sum);
		if(sum>num) {
			System.out.println(num+" is Abundant Number");
		} else {
			System.out.println(num+" is not Abundant Number");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Problem24.isAbundant(num);

	}

}
