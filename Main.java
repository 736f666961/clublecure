package b3;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// Create book object and list
		Book bookObj = new Book();
		ArrayList<Book> books = new ArrayList<Book>();
		
		// Create benefoactor object and list
		Benefactor benObj = new Benefactor();
		ArrayList<Benefactor> benefactors = new ArrayList<Benefactor>();
		
		// Create Reader object and list
		Reader redObj = new Reader();
		ArrayList<Reader> readers = new ArrayList<Reader>();

		// scanner
		Scanner scan = new Scanner(System.in);
		
		// Show menu
		menu();
		
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("Choose a number from the list ?");
			int num = scan.nextInt();
			
			switch (num) {
				case 1: {
					// creating a book
					bookObj.add(books);
					
					// show menu
					menu();
					
					break;
				}
				case 2: {
					// editing a book
					bookObj.edit(books);
					
					// show menu
					menu();
					
					break;
				}
				case 3: {
					// deleting a book
					bookObj.delete(books);
					
					
					// show menu
					menu();
					
					break;
				}
				case 4: {
					// searching a book
					bookObj.search(books);
					
					// show menu
					menu();
					
					break;
				}
				case 5: {
					// show all books
					bookObj.show(books);
					
					// show menu
					menu();
					
					break;
				}
				
				case 6: {
					// creating a benefactor
					benObj.add(benefactors);
					
					// show menu
					menu();
					
					break;
				}
				case 7: {
					// editing a benefactor
					benObj.edit(benefactors);
					
					// show menu
					menu();
					
					break;
				}
				case 8: {
					// deleting a benefactor
					benObj.delete(benefactors);
					
					// show menu
					menu();
					
					break;
				}
				case 9: {
					// searching a benefactor
					benObj.search(benefactors);
					
					// show menu
					menu();
					
					break;
				}
				case 10: {
					// show all benefactors
					benObj.show(benefactors);
					
					// show menu
					menu();
					
					break;
				}
				
				case 11: {
					// creating a reader
					redObj.add(readers);
					
					// show menu
					menu();
					
					break;
				}
				case 12: {
					// editing a readers
					redObj.edit(readers);
					
					// show menu
					menu();
					
					break;
				}
				case 13: {
					// deleting a readers
					redObj.delete(readers);
					
					// show menu
					menu();
					
					break;
				}
				case 14: {
					// searching a readers
					redObj.search(readers);
					
					// show menu
					menu();
					
					break;
				}
				case 15: {
					// show all readers
					redObj.show(readers);
					
					// show menu
					menu();
					
					break;
				}
				case 16: {
					isRunning = false;
					System.out.println("Quiting program...");
					break;
				}
				default:
					System.out.println("Unexpected value: " + num);
				}
		}
		
		scan.close();
	}
	
	// Menu
	public static void menu() {
		System.out.println("1 - Add a book");
		System.out.println("2 - Edit a book");
		System.out.println("3 - Delete a book");
		System.out.println("4 - Search a book");
		System.out.println("5 - Show all books");
		
		System.out.println("6 - Add a benefactor");
		System.out.println("7 - Edit a benefactor");
		System.out.println("8 - Delete a benefactor");
		System.out.println("9 - Search a benefactor");
		System.out.println("10 - Show all benefactors");
		
		System.out.println("11 - Add a reader");
		System.out.println("12 - Edit a reader");
		System.out.println("13 - Delete a reader");
		System.out.println("14 - Search a reader");
		System.out.println("15 - Show all readers");
		
		System.out.println("16 - Quit progarm");
	}
}
