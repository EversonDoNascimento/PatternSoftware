package Decorator;

public class CakeMultLayered extends CakeDecorator{

	public CakeMultLayered(Cake cake) {
		super(cake);
		
	}

	@Override
	public String getDescription() {
		return "Multi-layered " + cakeDecorado.getDescription();
	}
	
	public int getCost()
	{
		return cakeDecorado.getCost() + 5;
	}


}
