package methods;

public class LearningMethods {

	public static void main(String[] args) {
//		int number = 10;
//		String data = "result";
//		
//		
//		System.out.println(a(10,50));
//		System.out.println(a(5,5));
//		System.out.println("Hello"+some(10));
		
		
		//c();
		//b(number, data);
		
		
		sum(6,6);
		System.out.println(sum(6,6));
		sum("hi", "hello");
		System.out.println(sum("hi", "hello"));
		sum("hi", 5);
		System.out.println(sum("hi", 5));
		sum(5, "skdfjs");
		System.out.println(sum(5, "skdfjs"));
		
		System.out.println(some(10));

	}
		//AcessLevel-Static/NonStatic  ReturnType Nameofmethod(Argument)(Body)
		//ReturnType: void(it does not return anything)... datatype
	//PolyMorphism: Poly=multiple //Morphism=changes/behavior = multiple behaviors
	//Polymorphism depends on the number of parameters and pattern of datatype
	public static int sum(int i, int j) {
		return i+j;
	}
	public static String sum(String i, String j) {
		return i+j;
	}
	public static String sum(String j, int i) {
		return i+j;
	}
	public static String sum(int j, String i) {
		return i+j;
	}
	
	
	public static String a(int i,int j) {
		System.out.println("a");
		return i+j+"Result";
		
	}
	public static void b(int d, String e) {
		int j = 50;
		System.out.println(e+ d+j+100);
		
	}
	public static void c() {
		System.out.println("c");
		
	}
	public static boolean some(int a) {
		if(a==10) {
			System.out.println("true");
			return true;
		}
		else {
			return false;
		}
	}

	
	

}
