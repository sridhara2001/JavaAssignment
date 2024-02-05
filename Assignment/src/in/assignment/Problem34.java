package in.assignment;

import java.util.Scanner;

public class Problem34 {
	public static void FractionAddition(int nom1, int nom2, int demon1, int demon2) {
		float sum=0;
		float fractionAdd;
		if(demon1==demon2) {
			sum=nom1+nom2;
			fractionAdd=sum/demon1;
			System.out.println(fractionAdd);
		}else {
			int demon=demon1*demon2;
			nom1=nom1*demon2;
			nom2=nom2*demon1;
			sum=nom1+nom2;
			fractionAdd=sum/demon;
			System.out.println(fractionAdd);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Fraction Numbers");
		Scanner sc = new Scanner(System.in);
		int nom1=sc.nextInt();
		int nom2=sc.nextInt();
		int demon1=sc.nextInt();
		int demon2=sc.nextInt();
		FractionAddition(nom1,nom2,demon1,demon2);
	}

}
