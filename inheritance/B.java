package inheritance;

public class B extends C {
	
	int a = 15;
	
	public static void Test() {
		System.out.println("B something");
	}
	
	public static void Bs() {
		System.out.println("B_static");
	}
	public void Bns() {
		System.out.println("B_nonstatic");
		sum(10);
		
	}
	public void sum(int i) {
		System.out.println(i+10);
	}
	

}
