package model;

public class Note {
	private String noteId;
	private String title;
	private String author;
	private String description;
	public Note(String noteId, String title, String author, String description) {
		super();
		this.noteId = noteId;
		this.title = title;
		this.author = author;
		this.description = description;
	}

	public Note() {
		
	}
	
	
	public String getNoteId() {
		return noteId;
	}
	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
