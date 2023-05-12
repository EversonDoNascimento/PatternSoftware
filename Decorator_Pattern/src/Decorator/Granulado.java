package Decorator;

public class Granulado extends CakeDecorator {

	public Granulado(Cake cake) {
		super(cake);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return cakeDecorado.getDescription() + "with sprinkles";
	}
	

	public int getCost() {
		return cakeDecorado.getCost()+2;
	}

	
}
