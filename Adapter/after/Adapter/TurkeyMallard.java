package adapter;

public class TurkeyMallard implements Turkey{

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
		
	}

	@Override
	public void fly() {
		System.out.println("I'm Flying");
		
	}

}
