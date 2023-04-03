package model;

public class Note {
	@Override
	public String toString() {
		return "Note [noteId=" + noteId + ", title=" + title + ", author=" + author + ", description=" + description
				+ "]";
	}
	private int noteId;
	private String title;
	private String author;
	private String description;
	public Note(int noteId, String title, String author, String description) {
		super();
		this.noteId = noteId;
		this.title = title;
		this.author = author;
		this.description = description;
	}

	public Note() {
		
	}
	
	
	public int getNoteId() {
		return noteId;
	}
	public void setNoteId(int noteId) {
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
