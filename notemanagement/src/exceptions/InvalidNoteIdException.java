package exceptions;

public class InvalidNoteIdException extends RuntimeException{
	
	public InvalidNoteIdException() {
		super("NoteId doesnot exists");
	}

}
