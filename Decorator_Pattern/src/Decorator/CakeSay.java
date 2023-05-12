package Decorator;

public class CakeSay extends CakeDecorator{
	
	private String say;
	public CakeSay(Cake cake, String say) {
		super(cake);
		this.say = say;
	}

	
	public String getDescription() {
		// TODO Auto-generated method stub
		return cakeDecorado.getDescription()+" with saying "+ say;
	}
	
	
	public int getCost()
	{
		return cakeDecorado.getCost()+0;
	}

}
