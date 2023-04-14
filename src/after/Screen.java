package after;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 *  System.out.println("hello");
 */
public class Screen implements Observer{
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
    }
    
    public void unicoDigito(int numero) {
    	System.out.println(numero);
    	
    }
    
    public void discandoDigitos() {
    	
    	//Adicionando os numeros numa String
        
        String numeros = "Agora discando ";
        for(int i = 0; i <= model.digits.size() - 1; i++) {
        	    numeros += model.digits.get(i);
        }
      	System.out.println(numeros + "...");
    	
    }

	@Override
	public void newNumber(int numero) {
		if(model.digits.size() <= 11) {
			unicoDigito(numero);
			
		}else {
			unicoDigito(numero);
			discandoDigitos();
			
		}
		
	}
}
