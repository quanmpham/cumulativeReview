package superKeyword;

public class Car extends Vehicle {
	int maxSpeed = 200;
	
	Car(){
		System.out.println("Car constructor Maxspeed: "+ maxSpeed);
		System.out.println("Using super keyword to get Vehicle class Maxspeed: "+super.maxSpeed);
	}

}
