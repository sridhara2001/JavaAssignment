package in.assignment;

import java.util.Scanner;

public class Problem31 {
	public static void Quadrant(int x, int y) {
		if(x>0) {
			if(y>0) {
				System.out.println("("+x+","+y+") are lies in 1st Quadrant");
			}else {
				System.out.println("("+x+","+y+") are lies in 4th Quadrant");
			}
		}else {
			if(y>0) {
				System.out.println("("+x+","+y+") are lies in 2nd Quadrant");
			}else {
				System.out.println("("+x+","+y+") are lies in 3rd Quadrant");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Please enter coordinates");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y= sc.nextInt();
		Quadrant(x,y);
	}

}
