package tryCatch;

public class TryCatchExample {

	public static void main(String[] args) {
		//We're trying to get the array at index 3 which does not exist
		//try and catch, catched the error and prints An exception happened
//		try {
//			int[] a = {4, 5, 1};
//			System.out.println(a[3]);
//		}catch(Exception e) {
//			System.out.println("An exception happened");
//		}
		
		try {
			int[] a = null;
			System.out.println(a[1]);
		}catch(NullPointerException e) {
			System.out.println("Your array is null!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Your index is out of bounds!");
		}catch(Exception e) {
			System.out.println("Something else went wrong!");
		}
		
		try {
			int[] a = {6,7,8,3,4,5};
			System.out.println(a[6]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Your Index is out of bound!");
		}
		
		try {
			int i = 5/0; //Throws Arithmetic Exception
		}catch(ArithmeticException object1) {
			System.out.println("Exception Details-"+ object1);
		}
		
		

	}

}
