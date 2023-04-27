import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class TesteString {

	public static void main(String[] args) {
		String valor = "DEVMEDIA - Java ORIGAMID - PYTHON"+ "\n" + " JavaStript";
        String[] valorComSplit = valor.split(";");
        
        for(String s : valorComSplit){
               System.out.print(s);
        }
        
        System.out.println(valor.indexOf("-"));
        
        
        System.out.println(valor.indexOf("\n"));
        System.out.println(valor.substring(valor.indexOf("-") + 2, valor.length()));
        boolean cond = true;
        ArrayList<String> array = new ArrayList<>();
        /*
        while(cond) {
        	
        }*/
        
        String texto = "DEVMEDIA - Java ORIGAMID - PYTHON"+ "\n" + " JavaStript";

        String frutas[] = texto.split("\n");
        System.out.println(frutas[0]); //imprime banana
        System.out.println(frutas[1]); //imprime maçã
        //System.out.println(frutas[2]); //imprime laranja[/code]
        
        File file = new File("./arquivo.txt");
		
		Scanner scan = new Scanner(file);
		String conteudo = "";
		while(scan.hasNextLine()) {
			conteudo += scan.nextLine();
		}
        System.out.println(conteudo);
	}

}
