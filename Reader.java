package b3;

import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
	// Reader Attributes
	private String readerFirstName;
	private String readerLastName;
	private String readerPhoneNumber;
	private String readerEmail;
	private int readerLoyaltyCard;
	
	// Reader Constructor
	public Reader() {
		super();
	}

	// Reader Constructor
	public Reader(String readerFirstName, String readerLastName, String readerPhoneNumber, String readerEmail) {
		super();
		this.readerFirstName = readerFirstName;
		this.readerLastName = readerLastName;
		this.readerPhoneNumber = readerPhoneNumber;
		this.readerEmail = readerEmail;
	}
	
	// For getting reader first name
	public String getReaderFirstName() {
		return readerFirstName;
	}

	// For setting reader first name
	public void setReaderFirstName(String readerFirstName) {
		this.readerFirstName = readerFirstName;
	}

	// For getting reader last name
	public String getReaderLastName() {
		return readerLastName;
	}

	// For setting reader first name
	public void setReaderLastName(String readerLastName) {
		this.readerLastName = readerLastName;
	}

	// For getting reader phone number
	public String getReaderPhoneNumber() {
		return readerPhoneNumber;
	}

	// For setting reader phone number
	public void setReaderPhoneNumber(String readerPhoneNumber) {
		this.readerPhoneNumber = readerPhoneNumber;
	}

	// For getting reader email
	public String getReaderEmail() {
		return readerEmail;
	}

	// For setting reader email
	public void setReaderEmail(String readerEmail) {
		this.readerEmail = readerEmail;
	}

	public void add(ArrayList<Reader> array) {
		Reader benObj = new Reader();
		
		// ask user to enter reader first name
		Scanner scanBenefactorId = new Scanner(System.in);
		System.out.println("Enter a reader firstname ?");
		String BenefactorId = scanBenefactorId.nextLine();
		benObj.setReaderFirstName(BenefactorId);
		
		//  ask user to enter reader last name
		Scanner scanBenefactorTitle = new Scanner(System.in);
		System.out.println("Enter a reader last name ?");
		String BenefactorName = scanBenefactorTitle.nextLine();
		benObj.setReaderLastName(BenefactorName);
		
		//  ask user to enter reader phone number
		Scanner scanBenefactorEmail = new Scanner(System.in);
		System.out.println("Enter a reader phone number ?");
		String benefactorEmail2 = scanBenefactorEmail.nextLine();
		benObj.setReaderPhoneNumber(benefactorEmail2);
		
		//  ask user to enter reader email
		Scanner scanBenefactorEmail1 = new Scanner(System.in);
		System.out.println("Enter a reader email ?");
		String benefactorEmail1 = scanBenefactorEmail1.nextLine();
		benObj.setReaderEmail(benefactorEmail1);
		
		// for adding 
		array.add(benObj);
	}

	public void edit(ArrayList<Reader> array) {
		
		Reader benObj = new Reader();
		
		// ask user to enter reader id
		Scanner scanBookId = new Scanner(System.in);
		System.out.println("Enter an index ?");
		int in = scanBookId.nextInt();
		
		// ask user to enter reader first name
		Scanner scanBenefactorId = new Scanner(System.in);
		System.out.println("Enter the new reader firstname ?");
		String BenefactorId = scanBenefactorId.nextLine();
		benObj.setReaderFirstName(BenefactorId);
		
		//  ask user to enter reader last name
		Scanner scanBenefactorTitle = new Scanner(System.in);
		System.out.println("Enter the new reader last name ?");
		String BenefactorName = scanBenefactorTitle.nextLine();
		benObj.setReaderLastName(BenefactorName);
		
		//  ask user to enter reader phone number
		Scanner scanBenefactorEmail = new Scanner(System.in);
		System.out.println("Enter the new reader phone number ?");
		String benefactorEmail2 = scanBenefactorEmail.nextLine();
		benObj.setReaderPhoneNumber(benefactorEmail2);
		
		//  ask user to enter reader email
		Scanner scanBenefactorEmail1 = new Scanner(System.in);
		System.out.println("Enter the new reader email ?");
		String benefactorEmail1 = scanBenefactorEmail1.nextLine();
		benObj.setReaderEmail(benefactorEmail1);
		
		array.set(in, benObj);
	}

	public void delete(ArrayList<Reader> array) {
		// ask user to enter index
		Scanner scanIndex = new Scanner(System.in);
		System.out.println("Enter the reader index ?");
		int i = scanIndex.nextInt();
		
		// remove object
		array.remove(i);
	}
	
	public void search(ArrayList<Reader> array) {
		Scanner sacnBenefactorName = new Scanner(System.in);
		System.out.println("enter the rader email ?");
		String email = sacnBenefactorName.next();
		
		String isFound = "";
		for (Reader b : array) {
			if (b.getReaderEmail().equals(email)) {
				isFound = "found";
			}else {
				isFound = "not found";
			}
		}
		
		System.out.println("Element " + isFound);
	}

	public void show(ArrayList<Reader> array) {
		for (Reader reader : array) {
			System.out.println("Reader: " + "ReaderFisrtName: " + reader.getReaderFirstName() + ", ReaderLastName: " + reader.getReaderLastName() + ", ReaderPhoneNumber: " + reader.getReaderPhoneNumber() + ", Readeremail: " + reader.getReaderEmail());
		}
	}
	
	public void reading() {
		if (readerLoyaltyCard >= 4) {
			System.out.println("You are super faithful");
			readerLoyaltyCard++;
		}else {
			readerLoyaltyCard++;
		}
	}
}
