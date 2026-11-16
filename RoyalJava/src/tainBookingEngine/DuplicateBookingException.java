package tainBookingEngine;

public class DuplicateBookingException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2235372574971627750L;

	public DuplicateBookingException(String message) {

		super(message);
		
	}
	
}
