package interfaces;

public class X implements Z,Z1 {

	public static void main(String[] args) {
		
		
		X obj = new X();
		obj.mno();
		obj.abc();
		obj.abcd();
		obj.greetings();
		

	}
	
	public void abc() {
		System.out.println("abc");
	}
	
	public void mno() {
		System.out.println("mno");
	}

	@Override
	public void abcd() {
		// TODO Auto-generated method stub
		
	}
	public void greetings() {     //After Java version 8, you can use this in interface
		System.out.println("welcome");
	}
	public void sampleInterface() {
		
	}
	public void bark() {
		System.out.println("a dog goes woof");
	}

}
