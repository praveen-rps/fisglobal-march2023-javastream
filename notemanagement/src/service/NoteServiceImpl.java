package service;

import model.Note;

public class NoteServiceImpl implements NoteService{

	@Override
	public void createNote(Note note) {
		// TODO Auto-generated method stub
		System.out.println("Note is created and added to list");
	}

	@Override
	public void readNote() {
		// TODO Auto-generated method stub
		System.out.println("Notes are displayed...");
		
	}

	@Override
	public void updateNote(Note note) {
		// TODO Auto-generated method stub
		System.out.println("Note is updated in the list");
		
	}

	@Override
	public void deleteNotes(String noteId) {
		// TODO Auto-generated method stub
		System.out.println("Note with given noteId is deleted from list");
		
	}

}
