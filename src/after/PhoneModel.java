package after;

import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel {
    public List<Integer> digits = new ArrayList<>();
    public List<Observer> observers = new ArrayList<>();
    public void addDigit(int newDigit) {
        digits.add(newDigit);
        notifyObservadores(newDigit);
    }

    public List<Integer> getDigits() {
        return digits;
    }
    
    public void addObservador(Observer o) {
    	if(!observers.contains(o)) {
    		observers.add(o);
    		}
    	
    }
   
    //Notificando observadores
    public void notifyObservadores(int numero) {
    	for(Observer o: observers) {
    		o.newNumber(numero);
    	}
    }
    
   
    
  
}
