package controller;

import java.util.Scanner;

import model.Note;
import service.NoteServiceImpl;

public class NoteController {

	public static void displayMenu() {
		System.out.println("Note Operations");
		System.out.println("1. Create Note");
		System.out.println("2. display notes");
		System.out.println("3. update notes");
		System.out.println("4. delete notes");
		System.out.println("5. Exit Menu");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NoteServiceImpl service = new NoteServiceImpl();

		displayMenu();
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		while (choice != 5) {
			switch (choice) {
			case 1:
				System.out.println("Enter Note id");
				int noteId = sc.nextInt();
				System.out.println("Enter title");
				String title = sc.nextLine();
				System.out.println("Enter Author");
				String author = sc.nextLine();
				System.out.println("Enter Description");
				String description = sc.nextLine();
				Note note = new Note(noteId,title,author,description);
				service.createNote(note);
				break;
			case 2:
				service.readNote();
				break;
			case 3:
				service.updateNote(null);
				break;
			case 4:
				System.out.println("Enter Note id");
				int id = sc.nextInt();
				service.deleteNotes(id);
				break;
			default:
				System.out.println("wrong choice");
			}
			System.out.println("Enter your choice");
			sc = new Scanner(System.in);
			choice = sc.nextInt();

		}

	}

}
