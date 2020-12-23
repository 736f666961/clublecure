package b3;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
	// Book Attributes
	private int bookId;
	private String bookTitle;
	private String bookRelease;
	private String benefactorName;
	private String bookPostedDate;
	
	// Book Constructor
	public Book() {
		super();
	}

	// Book Constructor
	public Book(int bookId, String bookTitle, String bookRelease, String benefactorName, String bookPostedDate) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookRelease = bookRelease;
		this.benefactorName = benefactorName;
		this.bookPostedDate = bookPostedDate;
	}
	
	// For getting book id
	public int getBookId() {
		return this.bookId;
	}

	// For setting book id
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	// For getting book title
	public String getBookTitle() {
		return this.bookTitle;
	}

	// For setting book title
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	// For getting book title
	public String getBookRelease() {
		return bookRelease;
	}

	// For setting book release
	public void setBookRelease(String bookRelease) {
		this.bookRelease = bookRelease;
	}

	// For getting Benefactor Name
	public String getBenefactorName() {
		return this.benefactorName;
	}

	// For getting Benefactor Name
	public void setBenefactorName(String benefactorName) {
		this.benefactorName = benefactorName;
	}

	// For getting Book Posted Date
	public String getBookPostedDate() {
		return this.bookPostedDate;
	}

	// For setting Book Posted Date
	public void setBookPostedDate(String bookPostedDate) {
		this.bookPostedDate = bookPostedDate;
	}

	public void add(ArrayList<Book> array) {
		Book bookObj = new Book();
		
		// ask user to enter book id
		Scanner scanBookId = new Scanner(System.in);
		System.out.println("Enter a book id ?");
		int bookId = scanBookId.nextInt();
		bookObj.setBookId(bookId);
		
		// ask user to enter book title
		Scanner scanBookTitle = new Scanner(System.in);
		System.out.println("Enter a book title ?");
		String bookTitle = scanBookTitle.nextLine();
		bookObj.setBookTitle(bookTitle);
		
		// ask user to enter book release
		Scanner scanBookRelease = new Scanner(System.in);
		System.out.println("Enter a book release ?");
		String bookRelease = scanBookRelease.nextLine();
		bookObj.setBookRelease(bookRelease);
		
		// ask user to enter book benefactor name
		Scanner scanBookBenefactorName = new Scanner(System.in);
		System.out.println("Enter a book benefactor name ?");
		String bookBenefactorName = scanBookBenefactorName.nextLine();
		bookObj.setBenefactorName(bookBenefactorName);
		
		// ask user to enter book poosted date
		Scanner scanBookPoostedDate = new Scanner(System.in);
		System.out.println("Enter a book posted date ?");
		String bookPostedDate = scanBookPoostedDate.nextLine();
		bookObj.setBookPostedDate(bookPostedDate);
		
		
		array.add(bookObj);

	}

	public void edit(ArrayList<Book> array) {
		Book bookObj = new Book();
		
		// ask user to enter index
		Scanner scanIndex = new Scanner(System.in);
		System.out.println("Enter the index ?");
		int in = scanIndex.nextInt();
		
		// ask user to enter book id
		Scanner scanBookId = new Scanner(System.in);
		System.out.println("Enter the new book id ?");
		int bookId = scanBookId.nextInt();
		bookObj.setBookId(bookId);
		
		// ask user to enter book title
		Scanner scanBookTitle = new Scanner(System.in);
		System.out.println("Enter the new book title ?");
		String bookTitle = scanBookTitle.nextLine();
		bookObj.setBookTitle(bookTitle);
		
		// ask user to enter book release
		Scanner scanBookRelease = new Scanner(System.in);
		System.out.println("Enter the new book release ?");
		String bookRelease = scanBookRelease.nextLine();
		bookObj.setBookRelease(bookRelease);
		
		// ask user to enter book benefactor name
		Scanner scanBookBenefactorName = new Scanner(System.in);
		System.out.println("Enter the new book benefactor name ?");
		String bookBenefactorName = scanBookBenefactorName.nextLine();
		bookObj.setBenefactorName(bookBenefactorName);
		
		// ask user to enter book poosted date
		Scanner scanBookPoostedDate = new Scanner(System.in);
		System.out.println("Enter the new book posted date ?");
		String bookPostedDate = scanBookPoostedDate.nextLine();
		bookObj.setBookPostedDate(bookPostedDate);
		
		array.set(in, bookObj);
	}

	public void delete(ArrayList<Book> array) {
		// ask user to enter index
		Scanner scanIndex = new Scanner(System.in);
		System.out.println("Enter the index ?");
		int i = scanIndex.nextInt();
		
		// remove object
		array.remove(i);
	}
	
	public void search(ArrayList<Book> array) {
		// ask user to enter index
		Scanner sacnBenefactorName = new Scanner(System.in);
		System.out.println("enter the benefactor name of the book ?");
		String name = sacnBenefactorName.next();
		
		String isFound = "";
		for (Book b : array) {
			if (b.getBenefactorName().equals(name)) {
				isFound = "found";
			}else {
				isFound = "not found";
			}
		}
		
		System.out.println("Element " + isFound);
	}

	public void show(ArrayList<Book> array) {
		for (Book book : array) {
			System.out.println("Book: " + "BookId: " + book.getBookId() + ", BookTitle: " + book.getBookTitle() + ", BookRelease: " + book.getBookRelease() + ", BookBenefactorName: " + book.getBenefactorName() + ", BookPostedDate: " + book.getBookPostedDate());
		}
	}
}
