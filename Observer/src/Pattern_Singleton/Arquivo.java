import java.io.File;
import java.util.Scanner;
public static class Arquivo {
	private String conteudo;
	private static Arquivo;
	
	private static Arquivo() {
		File file = new File("./arquivo.txt");
		
		Scanner scan = new Scanner(file);
		
		while(scan.hasNextLine()) {
			this.conteudo += scan.nextLine();
		}
		
	}
	
	public static Singleton getArquivo() {
		if(uniqueInstance == null) {
			new Singleton();
		}
		
		return uniqueInstance;
	}
	
	

}
