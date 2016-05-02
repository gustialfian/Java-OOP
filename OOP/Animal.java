// inheritance and polymorphism
public class Animal {
	// public can be access from any class
	public String name       = "zeno";
	// protected can be access from this class and sub class
	protected String favFood = "fruit";
	// private can be access just from this class
	private String gen       = "tall";
		
	public Animal() {
		
	}
	// overwriting Animal()
	public Animal(String name, String favFood, String gen) {
		super();
		this.name = name;
		this.favFood = favFood;
		this.gen = gen;
	}
	// this method will be override in Cats class 
	public void eatStuff() {
		System.out.println("yum "+ favFood);
	}
	// this method can not be override
	public final void walkAround() {
		System.out.println(this.name +" walk around");
	}	
	// This method can be called, without initializing objects
	public static void run() {
		System.out.println("wuuzzz");
	}
}


