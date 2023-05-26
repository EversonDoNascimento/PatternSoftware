package Template_Method;

public class Coffee extends CoffeineBeverage{
	
	

	
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}
	

	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

}
