package in.assignment;

import java.util.Scanner;

//Friendly Pair (Ratio b/w the sum of divisors of a number and number itself)
public class Problem25 {
	public static void isRatio(int num) {
		int sum=0;
		System.out.print("The divisors of above number are : ");
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum=sum+i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("The sum of divisors is : "+sum);
		
		int sum1=sum;
		int num1=num;
		for(int j=1; j<num1; j++) {
			for(int k=1; k<=j; k++) {
				if(sum1%k==0) {
					if(num1%k==0) {
						sum1=sum1/k;
						num1=num1/k;
					}
				}
			}
		}
		System.out.println("The Ratio between "+sum+" and "+num+" is "+sum1+" : "+num1);
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Problem25.isRatio(num);

	}

}
