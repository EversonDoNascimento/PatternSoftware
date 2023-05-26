package Template_Method;

public abstract class CoffeineBeverage {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
    final void boilWater() {
		System.out.println("Building Water");
	}
	
	final void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
