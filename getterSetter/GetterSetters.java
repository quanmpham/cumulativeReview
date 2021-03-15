package getterSetter;

public class GetterSetters {
	
	private int num=10;
	private String word="hello!";
	
	public static void main(String[] args) {

		GetterSetters gs = new GetterSetters();
		
		System.out.println(gs.getWord());
		System.out.println(gs.getInt());
		gs.setWord("hi");
		System.out.println(gs.getWord());
		gs.setInt(20);
		System.out.println(gs.getInt());
		System.out.println("======================================================");
		GetterSetters obj = new GetterSetters();
		System.out.println(obj.getInt());
		System.out.println(obj.getWord());
		obj.setWord("hellow");
		obj.setInt(20);
		System.out.println(obj.getWord());
		System.out.println(obj.getInt());
	}
	
	public int getInt() {
		return num;
	}
	public void setInt(int num) {
		this.num=num;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word=word;
	}
}
