package adapter;

public class DuckTestDrive {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		
		Turkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...");
		testDuck(duck);
		
		System.out.println("\nThe Turkey");
		testDuck(turkeyAdapter);
		
	}
	
	public static void testDuck(Duck duck) {
		duck.fly();
		duck.quack();
	}

}
