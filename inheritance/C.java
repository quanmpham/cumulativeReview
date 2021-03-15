package inheritance;

public class C {
	
	public static void Cs() {
		System.out.println("C_static");
	}
	public void Cns() {
		System.out.println("C_nonstatic");
		B obj = new B();
		obj.Bns();
		
	}

}
