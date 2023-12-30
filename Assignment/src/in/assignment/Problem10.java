package in.assignment;

import java.util.Scanner;

// Reverse a Number
public class Problem10 {
	public static int reverseNum(int num) {
		int revNum = 0;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			revNum = (revNum*10)+rem;
		}
		return revNum;
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int revNum = Problem10.reverseNum(num);
		System.out.println(revNum);

	}

}
