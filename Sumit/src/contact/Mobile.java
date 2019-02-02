package contact;

import java.util.ArrayList;

public class Mobile {
	
	private ArrayList<Contact> mycontact = null;
	public Mobile() {  //creaating constructor
		
		this.mycontact = new ArrayList<Contact>();
	}
	
	private int findContact(Contact contact) {
		
		if(this.mycontact.indexOf(contact)>=0) {
		return mycontact.indexOf(contact);
	}
		return -1;
	}
	private int findContact(String name) {
		
		for(int i=0; i<this.mycontact.size(); i++) {
			if(mycontact.get(i).getName().equals(name)) {
				
				return i;
			}
		}
		return -1;
	}
	
      public boolean checkAvailableContact(String name) {
		
		for(int i=0; i<this.mycontact.size(); i++) {
			if(mycontact.get(i).getName().equals(name)) {
				
				return true;
			}
		}
		return false;
	}  
	
	public boolean updateContact(Contact oldcontact, Contact newcontact) {
		
		int position = findContact(oldcontact);
		if(position<0) {
			System.out.println("This contact doesn't exist");
			return false;
		}
		this.mycontact.set(position, newcontact); //this is used here to indicate that arraylist of this particular class is being updated
		System.out.println(oldcontact.getName()+ " is replaced with " + newcontact.getName());
		return true;
	}
	
	
	public boolean getMobileNumber(String name) {
		
		int position = findContact(name);
		if(position<0) {
			System.out.println("This name doesn't exist");
			return false;
		}
		System.out.println("Your number is : " + this.mycontact.get(position).getNumber());
		return true;
	}
	
	public boolean removeContact(String name) {
		
		int position = findContact(name);
		if(position<0) {
			System.out.println("Sorry, this name doesn't exist");
			return false;
		}
		System.out.println("The contact " + this.mycontact.get(position).getName() + " and " + this.mycontact.get(position).getNumber()
				             + " hasbeen removed successfully");
		this.mycontact.remove(position);
		return true;
	}
	
	public void printcontact() {
		
		for(int i=0; i<this.mycontact.size(); i++) {
			
			System.out.println((i+1) + " . " + this.mycontact.get(i).getName()+ " --> "
					                         + this.mycontact.get(i).getNumber());
		}
	}
	
	public boolean addnewContact(Contact contact) {
		
		int position = findContact(contact);
		if(position<0) {
			this.mycontact.add(contact);
			return true;
		}
		return false;
	}
	
	public Contact findWholeContact(String name) {
		
		int position = findContact(name);
		if(position<0) {
			
			System.out.println("No such name available in contact list ");
		}
		return this.mycontact.get(position);
	}
	
	
	

}
