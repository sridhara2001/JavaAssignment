package in.assignment;

import java.util.Scanner;

//Power of Number
public class Problem18 {
	public static int powerofNum(int num, int power) {
		int n=1;
		for(int i=1; i<=power; i++) {
			n=n*num;
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		System.out.println("Enter power of the number");
		int power = sc.nextInt();
		int result=Problem18.powerofNum(num, power);
		System.out.println("The value of "+num+" power "+power+" = "+result);

	}

}
