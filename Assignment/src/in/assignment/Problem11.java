package in.assignment;

import java.util.Scanner;

// Palindrome a Number
public class Problem11 {
	public static void palindromeNum(int num) {
		int n=num;
		int palNum = 0;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			palNum = (palNum*10)+rem;
		}
		if(palNum==n) {
			System.out.println(n+" is Palindrome number");
		}else {
			System.out.println(n+" is not Palindrome number");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Problem11.palindromeNum(num);

	}

}
