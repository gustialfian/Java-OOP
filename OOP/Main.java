
public class Main {
	public static void main(String args[]) {
		Human tony = new Human();		
		System.out.println(tony.nama);		
		tony.thinking("OOP");
		
		System.out.println();
		
		Animal stave = new Cats("stave", "fish", "lazy", "yarn");
		stave.walkAround();
		stave.eatStuff();
		Animal.run();
		
		System.out.println();
		
		JetPlane exia = new JetPlane();
		exia.takeOff();
		exia.damaged();
		exia.landing();
		System.out.println(exia.AVGSPEED);
		
	}
}


