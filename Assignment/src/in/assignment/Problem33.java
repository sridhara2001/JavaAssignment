package in.assignment;

import java.util.Scanner;

public class Problem33 {
	public static void Handshakes(int people) {
		int noOfHandshakes = people * (people-1)/2;
		System.out.println(noOfHandshakes);
	}

	public static void main(String[] args) {
		System.out.println("Enter the number of people present to shake hands");
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		Handshakes(people);

	}

}
