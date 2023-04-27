package SingletonPattern;


public class Main {

	public static void main(String[] args){

		Singleton test = Singleton.getInstance();
		Singleton test2 = Singleton.getInstance();
		
		
		System.out.println(test);
		
		

	}

}
