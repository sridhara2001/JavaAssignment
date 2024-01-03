package in.assignment;

import java.util.Scanner;

// Prime Numbers in an interval
public class Problem12 {

	public static void main(String[] args) {
		System.out.println("Enter Range of Number(Note: Numbers should be greater than 1)");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		for(int i=n1; i<=n2; i++) {
			boolean flag = true;
			for(int j=2; j<=i/2; j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

}
