package oops;

import java.util.Random;

public class ArrayDemo2 {
	public static void main(String[] args) {
		
		// 52
		// 
		
		int[] cards = new int[52];
		
		
		
		
		// at the time of creation , we have to provide size to array
		int[] i1 = new int[5];
		
		// Random value inside array
		Random rand = new Random();
		
		// 50-125 
		// 125 - 50 = 75
		
		for(int i = 0 ; i < i1.length ; i++) {
			i1[i] = rand.nextInt(50)+50;
		}
		
		
		for(int l : i1) {
			System.out.println(l);
		}
		
		
		// because array is fastest available collection
		
		// Early Initilization
		// Lazy Initialiation
		

		
	}
}
