package constructors;

public class Shirt {
	 String style;
	 String color;
	 char size;
	
	public static void main(String[] args) {
		Shirt obj = new Shirt();
		System.out.println(obj);
//		Shirt obj2 = new Shirt("White",'S');
//		Shirt obj3 = new Shirt(2,2);
//		System.out.println(obj.getShirtColorStyle());
		
		
		
	}
	
	public String getShirtColorStyle() {
		return color + ":" + style;
		
				
	}
	
	 Shirt(){
		color ="white";
		style= "street";
		
	}
	
	 Shirt(String newColor, char newSize){
		System.out.println(newColor);
		System.out.println(newSize);
		
	}
	
	 Shirt(int a, int b){
		System.out.println(a+b);
	}
}
