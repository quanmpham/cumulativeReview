package constructors;
//CONSTRUCTORS:something that does not need to be called, it will be automatically be called whenever you create the object
//1:if you have the same name of the class of a method, 
//2: no return type,  
//# not static that is known as constructor

//Constructor- parameterized (int a) because of that you cannot leave () blank anymore
public class Constructors {
	int length;
	int width;
	int height;
	
	public int getCubeVolume() {
		return (length*width*height);
	}
	
	Constructors(){
		length = 10;
		width = 20;
		height = 30;
		
		
	}
	
	Constructors(int l, int b, int h){
		length = l;
		width = b;
		height = h;
		
	}
}
