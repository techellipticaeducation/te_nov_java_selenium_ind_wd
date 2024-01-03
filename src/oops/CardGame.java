package oops;

import java.util.Random;

public class CardGame {
	
	public static void main(String[] args) {
		// top-down approach
		
		
		int totalNumberOfCard = 52;
		int[] cardArray = new int[52];
		
		Random r1 = new Random();
		int valuesAssignedCounter = 0;
		int loopCounter = 0 ;
		while(valuesAssignedCounter < 52) {
			int randValue = r1.nextInt(53);
			if(randValue == 0) {
				continue;
			}
			boolean isPresent = isValueAvailableInCardArray(cardArray, randValue);
			if(!isPresent) {
				cardArray[valuesAssignedCounter] = randValue;
				valuesAssignedCounter++;
			}
			loopCounter++;
		}
	
		int counter = 1;
		for(int i : cardArray) {
			String returnString = getCardName(i);
			System.out.print(returnString+" ");
			if(counter % 13 == 0) {
				System.out.println();
			}
			counter++;
		}
		// club [C] 1-13, diamond [D]14-26, heart [H]27-39, spades [S]40-52
		
	}
	
	public static String getCardName(int value) {
		// 34 , 34/13 = H, 34%13  = 7
		
		String returnCardType = "";
		if(value / 13 == 0) {
			returnCardType = "C";
		}
		if(value / 13 == 1) {
			returnCardType = "D";
		}
		if(value / 13 == 2) {
			returnCardType = "H";
		}
		if(value / 13 == 3) {
			returnCardType = "S";
		}
		
		returnCardType  = returnCardType + value%13;
		
		return returnCardType;
	}
	
	
	public static boolean isValueAvailableInCardArray(int[] arr, int value) {
		for(int i : arr) {
			if(i == value) {
				return true;
			}
		}
		return false;
	}
	
	
}
