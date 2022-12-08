package gitDemo;

public class Car extends Vehicle {
	static int wheels=4;
public static void main(String[] args) {
	Car c= new Car();
	System.out.println("Car has "+wheels +" wheels");
	c.car();
}
}
