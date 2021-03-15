package interfaces;

public interface Z1 {
	
	public abstract void abcd();
	
	public abstract void bark();
	
	default void wazzup() {
		System.out.println("wazzup default void");
	}

}
