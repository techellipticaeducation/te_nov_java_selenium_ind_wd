package oops;

public class ArrayDemo {
	public static void main(String[] args) {

		// 5 subject
		// science, math, physics, bio and gk
		// 50 students, // 50 * 5 = 250 variable
		
		
		// array
		int[] mark = {34,23,56,12,78}; // 1D 
//		System.out.println(mark.length);
		
//		for(int i = 0 ; i < mark.length ; i++) {
//			System.out.println(mark[i]);
//		}
		// array neither increase their size not decrease 
		
//		mark[5] = 145;
		
		// foreach loop
		// collections
//		for(int k  :  mark) {
//			System.out.println(k);
//		}
		
		// length = 5
		// upper bound = 4
		
		
		// array of array 2D array
		
		
		int[][] totalclassMarks = 
			{
				{10,20,45,56,23},
				{16,22,42,59,13},
				{60,20,65,56,53},
				{50,80,45,26,23}
			};
		
		
		for(int[] marks  : totalclassMarks) {
			for(int m: marks) {
				System.out.print(m +" ");
			}
			System.out.println();
		}
	

	}
}
