package in.assignment;

import java.util.Scanner;

// Perfect Square (Number obtained by multiplying number by itself)
public class Problem22 {
	public static void isPerfectSqaure(int num) {
		int numSquare = 0;
		for(int i=1; i<num; i++) {
			numSquare = i*i;
			if(num==numSquare) {
				break;
			}
		}
		
		if(numSquare==num) {
			System.out.println(num+" is Perfect Square");
		} else {
			System.out.println(num+" is not Perfect Square");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Problem22.isPerfectSqaure(num);

	}

}
