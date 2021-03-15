package practice;

public class ManualSort {

	public static void main(String[] args) {
		int[] num = { 12, 3, 2, 6, 23, 33, 19 };
//		int[] i = { 12, 3, 2, 6, 23, 33, 19 };
//		int[] j = { 12, 3, 2, 6, 23, 33, 19 };
		
		int temp;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for(int x: num) {
			System.out.println(x);
		}

	}

}
