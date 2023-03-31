package controller;

import java.util.Scanner;

import service.NoteServiceImpl;

public class NoteController {
	
	public static void displayMenu() {
		System.out.println("Note Operations");
		System.out.println("1. Create Note");
		System.out.println("2. display notes");
		System.out.println("3. update notes");
		System.out.println("4. delete notes");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NoteServiceImpl service = new NoteServiceImpl();
		
		displayMenu();
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1: service.createNote(null); break;
		case 2: service.readNote();break;
		case 3: service.updateNote(null);break;
		case 4: service.deleteNotes(null);break;
		default: System.out.println("wrong choice");
		}

	}

}
