package loops;

public class ListOfLoops {

	public static void main(String[] args) {
//		//FOR EACH
//		//Any time you have an array of data and you want to perform action on each and every item
//		String[] names = {"Quan", "Khoa", "Vy", "Linh"};
//		for(String x:names) {
//			System.out.println(x);
//		}
		
		//WHILE LOOP-check action first then do the work until it is false
		//Whenever you change X =80, you wont have any output
		int x = 80;
		
		while(x<50) {
			x=x*2;
			System.out.println(x);
		}
		System.out.println("==================================================================");
		//DO WHILE LOOP
		//Difference between While Loop is when you change X=80 you get 160;
		//This loop will perform action first then check if its true/false; 
		//if false then this loop will stop executing
		int y=80;
		do {
			y=y*2;
			System.out.println(y);
		} while(y<50);
		
		//FOR LOOP: it works with range(start and end)
		//FOR EACH: action is performed in each and every item
		//WHILE   : while something is true then perform the action
		//DO WHILE: do while do the work first then look at the condition

	}

}
