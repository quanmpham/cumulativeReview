package encapsulates;

public class Y {
	
	private static int i = 10;
	static int j = 55;
	private String word = "Hello";
	
	//private you are only allow to access it within the same class
	public static void abc() {
		i = 15;
		System.out.println(i);
		
	}
	//getting something should return something so it shouldn't be "VOID"/use String,Int etc.
	//RULE: This > represent the class name 
	//and it can only be used in NonStatic method
	//and in case of chaining constructors -- this has to be in the first line
	public String getWord() {
		String word = "Blah Blah";
		return this.word=word;
	}
	public void setWord(String newValue) {
		this.word = newValue;
		
	}
	
		//Inheritance: Extends
		//Accessing Package: Import
		//Encapsulation: Private, Getter, Setter
}
