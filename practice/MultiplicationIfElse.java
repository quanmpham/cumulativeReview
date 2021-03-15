package practice;

public class MultiplicationIfElse {

	public static void main(String[] args) {
		//Print 1 to N
		//If the number is multiple of 4 print out "dude" instead of the number
		//If the number is multiple of 6 print out "where's my car?" instead of the number 
		//If the number is multiple of 4 and 6 then print out "Dude, where's my car?"
		
		
		int N = 100;
		for(int i=1;i<=N;i++) {
			if(i%4==0 && i%6==0) {
				System.out.println("dude, where's my car?");
			}
			else if(i%6==0) {
				System.out.println("where's my car?");
			}
			else if(i%4==0) {
				System.out.println("dude");
			}
			else{
				System.out.println(i);
				}
		}
		

	}

}
