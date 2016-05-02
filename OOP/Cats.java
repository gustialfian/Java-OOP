
public class Cats extends Animal{
	public String favToy = "Yarn";
		
	public Cats(String name, String favFood, String gen, String favToy) {
		super(name, favFood, gen);
		this.favToy = favToy;
	}

	public void playWith() {
		System.out.println("Yeah "+ this.favToy);
	}

	public void eatStuff() {
		System.out.println("yumyyy "+ super.favFood);
	}
		
}


