package SingletonPattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Arquivo {
	private static String conteudo;
	//private static ArrayList<String> conteudoArra;
	private static Arquivo uniqueInstance;
	
	private Arquivo() {
		File file = new File("/Padroes_de_Projeto/Observer/telephone/"
				+ "Singleton/src/SingletonPattern/arquivo.txt");

		Scanner scan;
		try {
			scan = new Scanner(file);
			while (scan.hasNextLine()) {
				conteudo += scan.nextLine() + "\n";
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static Arquivo getArquivo(){
		if(uniqueInstance == null) {
			uniqueInstance = new Arquivo();
			
			
			
		}
		
		return uniqueInstance;
		

	}
	
	
	public static String arquivo() {
		
		return conteudo;
		
	}
	
	
	

}
