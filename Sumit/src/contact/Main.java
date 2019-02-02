package contact;

import java.util.Scanner;

public class Main {
	

	private static Scanner s = new Scanner(System.in);
	private static Mobile mobile = new Mobile();

	public static void main(String[] args) {
		
		
		boolean quit = false;
		
		while(!quit) {
			
			System.out.println("Enter action");
			
			int action = s.nextInt();
			s.nextLine();
			
			switch(action) {
			case 0:
				System.out.println("Shutting down phone");
				quit=true;
				break;
				
			case 1:
				printcontact();
				break;
			case 2:
				addContact();
				break;
			case 3:
				updatecontact();
				break;
			case 4:
				removecontact();
				break;
			case 5:
				startphone();
				break;
			}
			
		}
	}

	private static void removecontact() {
		
		System.out.println("Enter name of the contact to be removed : ");
		String name = s.nextLine();
		if(mobile.checkAvailableContact(name)==true) {
			mobile.removeContact(name);
			System.out.println(" Removing done successfully");
		}else
			System.out.println(" Error : Name not present in contact list");
		
	}

	
	private static void addContact() {
		
		System.out.println("enter name : ");
		String name = s.nextLine();
		System.out.println("enter phone number : ");
		int number = s.nextInt();
		
		Contact contact = Contact.myContact(name, number); //BY CALLING THE METHOD OF CONTACT CLASS AND PASSING THE VALUE
		//Contact contact = new Contact(name, number); 
		if(mobile.addnewContact(contact)==true) {
			System.out.println("Contact with name " + contact.getName() + " hasbeen added successfully");
		}
		
	}

	
	private static void updatecontact() {
		
		System.out.println("enter contact name to be updated : ");
		String name = s.nextLine();
		if(mobile.checkAvailableContact(name)==true) {
			
		System.out.println("enter new contact name : ");
		String nameNew = s.nextLine();
		System.out.println("enter contact new phone number : ");
		int phone = s.nextInt();
		Contact oldcontact = mobile.findWholeContact(name);
		Contact newcontact = Contact.myContact(nameNew, phone);
		mobile.updateContact(oldcontact, newcontact);

		
	}else
		System.out.println("Entered name : "+ name + " is not present in contact list");
	}

	
	private static void startphone() {
		System.out.println("Starting phone");
	}
	
	
	private static void printcontact() {
		
		mobile.printcontact();
	}

}
