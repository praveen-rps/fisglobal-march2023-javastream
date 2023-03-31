package service;

import model.Note;

public interface NoteService {
	
	public void createNote(Note note);
	public void readNote();
	public void updateNote(Note note);
	public void deleteNotes(String noteId);

}
