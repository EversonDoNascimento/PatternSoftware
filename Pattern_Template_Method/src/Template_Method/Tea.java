package Template_Method;

public class Tea extends CoffeineBeverage{


	public void brew() {
		System.out.println("Steeping the tea");
	}
	
	
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
	

}
