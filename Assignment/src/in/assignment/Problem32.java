package in.assignment;

import java.util.Scanner;

public class Problem32 {
	public static void Permutation(int n, int r) {
		int n1=1;
		int r1=1;
		
		if(n<r) {
			System.out.println("Permutation is not possible");
		}else {
			System.out.print("Permutation of "+n+" and "+r+" is ");
			if(n==0) {
				n1=1;
			}else {
				while(n>0) {
					n1=n1*n;
					n--;
				}
			}
			
			if(r==0) {
				r1=1;
			}else {
				while(r>0) {
					r1=r1*r;
					r--;
				}
			}
			
			int permutation = n1/r1;
			System.out.print(permutation);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Numbers");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		Permutation(n,r);
	}

}
