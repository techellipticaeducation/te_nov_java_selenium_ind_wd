package datatype;

import java.util.Scanner;

public class ConditionalStatementDemo {
	public static void main(String[] args) {
		// age basis age gourp 
		// >18 - child  m <=18 = adult
		
		// 0-18 - Child
		// 19-30 = adult
		// 31-45 = Mature
		// 45 = Old
		

		// testcases - 17, 18 , 19,29,30,31,44,45,46, 0, 100, -1

		Scanner scan = new Scanner(System.in);
		// expected and actual
		while(true) {
			System.out.println("---------");
			System.out.print("Enter your age : ");
			int age = scan.nextInt();
			if(age == -10) {
				break;
			}
			System.out.print("Expected Age Group : " );
			String expectedAgeGroup = scan.next();


			String actualAge = "";
			if(age <= 18) {
				actualAge  = "Child";
			}else if(age >= 19 && age  <= 30) {
				actualAge  = "Adult";
			}else if(age > 30 && age <= 45) {
				actualAge  = "Mature";
			}else {
				actualAge = "Old";
			}
			
			if(expectedAgeGroup.equals(actualAge)) {
				System.out.println("Test case passed");
			}else {
				System.err.println("Test case Failed. Expected : " + expectedAgeGroup +", Actual : "+actualAge);
			}
			
		}
		System.out.println("we are out of loop now");


	}
}
