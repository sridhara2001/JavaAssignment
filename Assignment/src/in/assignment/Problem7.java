package in.assignment;

import java.util.Scanner;

// Checking Leap Year
public class Problem7 {
	public static String isYear(int year) {
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					return "This is Leap year";
				}else {
					return "This is not a Leap Year";
				}
			}else {
				return "This is Leap Year";
			}
		} else {
			return "This is not a Leap Year";
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		String result = Problem7.isYear(year);
		System.out.println(result);

	}

}
