package in.assignment;

import java.util.Scanner;

// Number is positive or negative
public class Problem1 {
	public static void isNum(int num) {
		if(num>0) {
			System.out.println(num+" is a Positive Number");
		}else {
			System.out.println(num+" is a Negative Number");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Problem1.isNum(num);

	}

}
