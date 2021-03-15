package practice;

public class FindOddNumbers {

	public static void main(String[] args) {


		int[] numbers = {1,24,5,3,5,6,7,8,9,12,13,14,12};
		
		for(int i=0;i<= numbers.length;i++) {
			if(i%2==1) {
				System.out.println(i);
			}	
		}
		

	}

}
