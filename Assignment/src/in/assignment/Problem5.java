package in.assignment;

import java.util.Scanner;

// Sum of numbers in a given interval
public class Problem5 {
	public static int sumofNumbers(int n1, int n2) {
		int sum=0;
		for(int i=n1; i<=n2; i++) {
			sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter Numbers");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result = Problem5.sumofNumbers(num1, num2);
		System.out.println("The sum of numbers between "+num1+" and "+num2+" is equal to "+result);

	}

}
