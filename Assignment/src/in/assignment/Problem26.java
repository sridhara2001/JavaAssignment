package in.assignment;

import java.util.Scanner;

public class Problem26 {
	public static int GCDOfNums(int a, int b) {
		int gcd=1;
		if(a==0 || b==0) {
			return 0;
		}else {
			for(int i=1; i<=a && i<=b; i++) {
				int q1=a%i;
				int q2=b%i;
				if(q1==0 && q2==0) {
					gcd=i;
				}
			}
			return gcd;
		}
	}
	
	public static int LCMOfNums(int a, int b) {
		int lcm = (a*b)/GCDOfNums(a,b);
		return lcm;
	}

	public static void main(String[] args) {
		System.out.println("Enter numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = Problem26.GCDOfNums(a,b);
		System.out.println("GCD of given numbers is :"+result);
		int result1 = Problem26.LCMOfNums(a,b);
		System.out.println("LCM of given numbers is :"+result1);

	}

}
