package in.assignment;

import java.util.Scanner;

//Greatest of Two Numbers
public class Problem4 {
	public static int isGreatest(int n1, int n2) {
		if(n1>n2) {
			return n1;
		}else {
			return n2;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Numbers");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result = Problem4.isGreatest(num1, num2);
		System.out.println(result+" is the Greatest number between two numbers");
	}

}
