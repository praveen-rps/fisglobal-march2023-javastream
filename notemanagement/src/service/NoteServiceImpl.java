package service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.Note;

public class NoteServiceImpl implements NoteService{
	
	List<Note> notes;
	public NoteServiceImpl() {
		notes = new ArrayList<>();
	}

	@Override
	public void createNote(Note note) {
		// TODO Auto-generated method stub
		notes.add(note);
		System.out.println("Note is created and added to list");
	}

	@Override
	public void readNote() {
		// TODO Auto-generated method stub
		System.out.println("Notes Available Collection");
		notes.forEach(System.out::println);
		
	}

	@Override
	public void updateNote(Note note) {
		// TODO Auto-generated method stub
		System.out.println("Note is updated in the list");
		
	}

	@Override
	public void deleteNotes(int noteId) {
		// TODO Auto-generated method stub
		Predicate<Note> p = note-> note.getNoteId()==noteId;
		notes.removeIf(p);
		System.out.println("Note with given noteId is deleted from list");
		
	}

}
