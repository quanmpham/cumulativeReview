package collections;

public class Arrays {

	public static void main(String[] args) {
		//Two ways to define array
		
		//Method 1: Use this when you already know the values
//		String[] names = {"John","Quan","Jane"};
//		int[] num = {1,6,8,9};
		
		//Method 2: Use this when you know how many items but don't know the values
		int[] numbers = new int[5];// there are max of 5 numbers
		
		numbers[0] = 55;
		numbers[1] = 65;
		numbers[2] = 75;
		numbers[3] = 85;
		numbers[4] = 95;
		
		System.out.println(numbers[3]);
		
		numbers = new int[6]; //You loose all values after creating new array with same name
		numbers[5] = 105;
		System.out.println(numbers[3]);
		//RESTRICTION of ARRAY: They are fixed.


	}

}
