
public class Animal {
	public String name = "zeno";
	protected String favFood = "fruit";
	private String gen = "tall";
		
	public Animal() {
		
	}
	public Animal(String name, String favFood, String gen) {
		super();
		this.name = name;
		this.favFood = favFood;
		this.gen = gen;
	}

	public void eatStuff() {
		System.out.println("yum "+ favFood);
	}
	
	public final void walkAround() {
		System.out.println(this.name +" walk around");
	}	
	
	public static void run() {
		System.out.println("wuuzzz");
	}
}


