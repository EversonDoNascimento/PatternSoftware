package Decorator;

/**
 * Create an order and print it
 */
public class Main {
	public static void main(String[] args) {
		 // Create the order
       Order order = new Order();
       Cake cake= new ChocolateCake();
       Cake cake2 = new VanillaCake();
       cake2 = new CakeSay(cake2, "PLAIN!");
       Cake cake3 = new VanillaCake();
       cake3 = new Granulado(cake3);
       cake3 = new CakeSay(cake3, "FANCY!");
       Cake cake4 = new CakeStrawberry();
       cake4 = new CakeMultLayered(cake4);
       cake4 = new Granulado(cake4);
       cake4  = new Granulado(cake4);
       cake4 = new CakeSay(cake4, "One of");
       cake4 = new CakeSay(cake4, "EVERYTHING");
       //Adding orders
       order.addCake(cake);
       order.addCake(cake2);
       order.addCake(cake3);
       order.addCake(cake4);
       // Print the order
       order.printOrder();
	}
}
