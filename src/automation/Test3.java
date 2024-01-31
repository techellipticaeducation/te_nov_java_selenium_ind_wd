package automation;

public class Test3 {

	public static void main(String[] args) {
		// 0,1,1,2,3,5,8,13,21,34
		
		int firstValue = 0;
		int secondValue = 1;
		int sum = 0;
		System.out.println(sum);
		while((firstValue +secondValue) < 100) {
			sum = firstValue +secondValue;
			firstValue = secondValue;
			secondValue = sum;
			System.out.println(sum);
		}
		
		
	}
	
}
