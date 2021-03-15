package constructors;

public class Overloading {
	//Method Overload
	public static void main(String[] args) {
		Sum();
		Sum(10,20);
		Sum(1,2,3);
		

	}
	public static void Sum() {
		System.out.println(5+5);
	}
	public static void Sum(int a, int b) {
		System.out.println(a+b);
	}
	public static void Sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}

}
