
public class Main {
	public static void main(String args[]) {
		// make an instance/object from class Human
		// Human() is Constructor method
		Human tony = new Human();
		// calling attribute
		System.out.println(tony.nama);		
		// calling method
		tony.thinking("OOP");
		
		System.out.println();
		
		// inheritance and polymorphism
		Animal stave = new Cats("stave", "fish", "lazy", "yarn");
		// final method can not be override
		stave.walkAround();
		// override methode for polymorphism
		stave.eatStuff();
		// static method
		Animal.run();
		
		System.out.println();
		// make an instance/object from class that extend abstract class and implement 2 interface
		JetPlane exia = new JetPlane();
		exia.takeOff();
		exia.damaged();
		exia.landing();
		System.out.println(exia.AVGSPEED);
		
	}
}


