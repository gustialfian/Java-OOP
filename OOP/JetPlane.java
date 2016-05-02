
public class JetPlane extends Crashable implements Driveable, Flyable{
	@Override
	public void takeOff() {
		System.out.println("takeOff");
	}
	@Override
	public void landing() {
		System.out.println("landing");	
	}
	@Override
	public void getSpeed() {
		System.out.println("250");
	}
	@Override
	public void getMaxSpeed() {
		System.out.println("500");	
	}
	@Override
	public void getVechicel() {
		System.out.println("Exia");
	}
}


