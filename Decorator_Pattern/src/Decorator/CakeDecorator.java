package Decorator;

public abstract class CakeDecorator extends Cake{
	
	Cake cakeDecorado;
	
	public CakeDecorator(Cake cake) {
		cakeDecorado = cake;
	}
	
	public abstract String getDescription();

	
}
