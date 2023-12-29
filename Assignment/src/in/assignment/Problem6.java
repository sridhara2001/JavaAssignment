package in.assignment;

import java.util.Scanner;

// Greatest between three numbers
public class Problem6 {
	public static int isGreat(int n1, int n2, int n3) {
		if(n1>n2 && n1>n3) {
			return n1;
		}else if(n2>n1 && n2>n3) {
			return n2;
		}else {
			return n3;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Numbers");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int result = Problem6.isGreat(num1, num2, num3);
		System.out.println(result+" is the greatest number between above three numbers");

	}

}
