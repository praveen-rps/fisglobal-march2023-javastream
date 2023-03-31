package exceptions;

public class InvalidNoteException extends RuntimeException{
	
	public InvalidNoteException() {
		super("note object is incorrect");
	}

}
