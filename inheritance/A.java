package inheritance;

//A is the child-- inheriting parent B
//A extends B
//A (Child) = subClass
//B (parent) = superClass
// subClass extends superClass
//RULE: one class can inherite only one class
//RULE: Can't make a inheritance circle-- it has to be one way chain

public class A extends B{
	
	static int a = 88; //Method OVERRIDE
	
	public static void main(String[] args) {
		Bs(); //Because this is inherited, you can therefore do  this instead of B.BS();
		As();
		A obj = new A();
		
		Test();   //Method override because test refer to the one in this class instead of the one in parent class B
		
		obj.getParentTest();
		
		obj.Ans();
		
		

		//Super keyword can only be used in Nonstatic methods
		//Super keyword gets the value from the superClass instead of the one that was override
		
	}
	public void getParentTest() {
		//needs to be non-static for super to be used
		//this super here refer to the parent Test method in B class
		super.Test();
		
		
	}
	
	public static void Test() {
		System.out.println("test something");
	}
	public void Ans() {
		System.out.println(a);
		Cns();
		Bns();
		super.Bns();
		//System.out.println("A_nonStatic");
	}
	public static void As() {
		System.out.println("A_Static");
		

	}

}
