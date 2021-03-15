package practice;

public class Ztest {
	private static  String name="Quan";
	private static int age=28;
	
	public Ztest(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	
	public static void main(String[] args) {
		Ztest obj = new Ztest(name,age);
		System.out.println(obj.name);
		System.out.println(obj.age);
//		
//		System.out.println(obj.getAge());
//		System.out.println(obj.getName());
//		System.out.println("===================================");
//		obj.setAge(28);
//		System.out.println(obj.getAge());
//		obj.setName("Quanstah");
//		System.out.println(obj.getName());
//		System.out.println("===================================");
//		obj.setAge(21);
//		obj.setName("Bieber");
//		System.out.println(obj.getAge());
//		System.out.println(obj.getName());
		

	}
	
//	public void setName(String name) {
//		this.name=name;
//	}
//	
//	public void setAge(int age) {
//		this.age=age;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public int getAge() {
//		return age;
//	}

}
