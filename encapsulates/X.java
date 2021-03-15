package encapsulates;

public class X {
	
	private static int a = 55;
	
	public static void main(String[] args) {
		//a= 60;
		//System.out.println(a);
		
		Y obj = new Y();
//		obj.getWord();
		obj.setWord("Hi");
		System.out.println(obj.getWord());
//		obj.getWord();
		
//		System.out.println(obj.getWord());
		
		
	}
}
