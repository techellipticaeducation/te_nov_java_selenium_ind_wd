package datatype;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {

		// ticket sell 
		// age <=18 , ticket -100, ticket - 200

		// Scanner class

		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("What is your age :");

			int age = scan.nextInt();
			int price = age<=18 ? 100 : 200 ;
			System.out.println("Your Ticket Price : " + price);
		}
	}
}
