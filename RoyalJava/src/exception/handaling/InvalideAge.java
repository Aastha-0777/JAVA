package exception.handaling;

//1. Checked Exception
//public class InvalideAge extends Exception {

//1. UnChecked Exception
public class InvalideAge extends RuntimeException {

	public InvalideAge(String msg) {

		super(msg);
		
	}
	
}
