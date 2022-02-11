package exception;

public class NegativeNumberException extends Exception {
	public NegativeNumberException(){
		super("No pueden haber numeros negativos");
		
	}
}
