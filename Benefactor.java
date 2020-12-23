package b3;

import java.util.ArrayList;
import java.util.Scanner;

public class Benefactor {
	// Benefactor Attributes
	private int numberOfDonation = 0;
	private int benefactorId;
	private String benefactorName;
	private String benefactorEmail;
	
	public Benefactor(int benefactorId, String benefactorName, String benefactorEmail) {
		super();
		this.benefactorId = benefactorId;
		this.benefactorName = benefactorName;
		this.benefactorEmail = benefactorEmail;
	}

	// Benefactor Constructor
	public Benefactor() {
		super();
	}
	
	// For getting benefactor id
	public int getBenefactorId() {
		return benefactorId;
	}

	// For setting benefactor id
	public void setBenefactorId(int benefactorId) {
		this.benefactorId = benefactorId;
	}

	// For getting benefactor name
	public String getBenefactorName() {
		return benefactorName;
	}

	// For setting benefactor name
	public void setBenefactorName(String benefactorName) {
		this.benefactorName = benefactorName;
	}

	// For getting benefactor email
	public String getBenefactorEmail() {
		return benefactorEmail;
	}

	// For getting benefactor email
	public void setBenefactorEmail(String benefactorEmail) {
		this.benefactorEmail = benefactorEmail;
	}

	public void add(ArrayList<Benefactor> array) {		
		Benefactor benObj = new Benefactor();
		
		// ask user to enter Benefactor id
		Scanner scanBenefactorId = new Scanner(System.in);
		System.out.println("Enter a benefactor id ?");
		int BenefactorId = scanBenefactorId.nextInt();
		benObj.setBenefactorId(BenefactorId);
		
		// ask user to enter Benefactor title
		Scanner scanBenefactorTitle = new Scanner(System.in);
		System.out.println("Enter a benefacto name ?");
		String BenefactorName = scanBenefactorTitle.nextLine();
		benObj.setBenefactorName(BenefactorName);
		
		// ask user to enter Benefactor email
		Scanner scanBenefactorEmail = new Scanner(System.in);
		System.out.println("Enter a benefactor email ?");
		String benefactorEmail = scanBenefactorEmail.nextLine();
		benObj.setBenefactorEmail(benefactorEmail);
		
		// for adding 
		if (numberOfDonation > 3) {
			System.out.println("You are super faithful");
			array.add(benObj);
			numberOfDonation++;
		}else {
			array.add(benObj);
			numberOfDonation++;
		}
	}

	public void edit(ArrayList<Benefactor> array) {
		Benefactor benObj = new Benefactor();
		
		// ask user to enter index
		Scanner scanIndex = new Scanner(System.in);
		System.out.println("Enter the index ?");
		int in = scanIndex.nextInt();
		
		// ask user to enter Benefactor id
		Scanner scanBenefactorId = new Scanner(System.in);
		System.out.println("Enter the new benefactor id ?");
		int BenefactorId = scanBenefactorId.nextInt();
		benObj.setBenefactorId(BenefactorId);
		
		// ask user to enter Benefactor title
		Scanner scanBenefactorTitle = new Scanner(System.in);
		System.out.println("Enter the new benefacto name ?");
		String BenefactorName = scanBenefactorTitle.nextLine();
		benObj.setBenefactorName(BenefactorName);
		
		// ask user to enter Benefactor email
		Scanner scanBenefactorEmail = new Scanner(System.in);
		System.out.println("Enter the new benefactor email ?");
		String benefactorEmail = scanBenefactorEmail.nextLine();
		benObj.setBenefactorEmail(benefactorEmail);
		
		array.set(in, benObj);
	}
	
	public void search(ArrayList<Benefactor> array) {
		Scanner sacnBenefactorName = new Scanner(System.in);
		System.out.println("enter the benefactor email ?");
		String email = sacnBenefactorName.next();
		
		String isFound = "";
		for (Benefactor b : array) {
			if (b.getBenefactorEmail().equals(email)) {
				isFound = "found";
			}else {
				isFound = "not found";
			}
		}
		
		System.out.println("Element " + isFound);
	}

	public void delete(ArrayList<Benefactor> array) {
		// ask user to enter index
		Scanner scanIndex = new Scanner(System.in);
		System.out.println("Enter the benefactor index ?");
		int i = scanIndex.nextInt();
		
		// remove object
		array.remove(i);
	}

	public void show(ArrayList<Benefactor> array) {
		for (Benefactor benefactor : array) {
			System.out.println("Benefactor: " + "BenefactorId: " + benefactor.getBenefactorId() + ", BenefactorName: " + benefactor.getBenefactorName() + ", BenefactorEmail: " + benefactor.getBenefactorEmail());
		}
	}
}
