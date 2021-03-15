package interfaces;

public abstract class Y {

	public abstract void abc();
	
	public abstract void mno();
	
	//default means default body of this method
	//intention, i will tell you what the method is, you will be the one to 
	//dictate what you want the party to say
	public void greetings() {     
		System.out.println("hi");
	}
}
