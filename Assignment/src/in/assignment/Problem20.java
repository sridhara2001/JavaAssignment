package in.assignment;

import java.util.Scanner;

// Finding Sum of factorial of digits is equal or not to its number itself (Strong Number)
public class Problem20 {
	public static void isStrongNum(int num) {
		int n=num;
		int sum=0;
		while(n>0) {
			int rem = n%10;
			n = n/10;
			
			int fact=1;
			for(int j=1; j<=rem; j++) {
				fact=fact*j;
			}
			sum=sum+fact;
		}
		System.out.println("The sum of factorial of digits of "+num+" = "+sum);
		if(num==sum) {
			System.out.println("The Number "+num+" is Strong Number");
		} else {
			System.out.println("The Number "+num+" is not Strong Number");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Problem20.isStrongNum(num);

	}

}
