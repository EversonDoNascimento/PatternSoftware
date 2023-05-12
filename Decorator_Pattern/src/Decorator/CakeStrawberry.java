package Decorator;

public class CakeStrawberry extends Cake{

	
	public String getDescription() {
		
		return "Strawberry Cake";
	}
	
	public int getCost() {
		return super.getCost() * 2;
	};
	


}
