package interfaces;

public interface Z {
	
	public abstract void abc();
	
	public abstract void mno();
	
	//default means default(define) body of this method
	//intention, i will tell you what the method is, you will be the one to 
	//dictate what you want the party to say
	default void greetings() {     //After Java version 8, you can use this in interface
		System.out.println("hi");
	}
	public abstract void sampleInterface();
}
