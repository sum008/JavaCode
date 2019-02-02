package contact;

public class Contact {
	
	private String name;
	private int number;
	
	public Contact(String name, int number) { //creating constructor to initialize the values of name and number
		
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public int getNumber() {
		
		return this.number;
	}
	
	public static Contact myContact(String name, int number) { //this method will be called just like String(no need of creating the oblect)
		                                                       //it will act as Contact datatype just like String class act as datatype
		return new Contact(name, number);
	}
	

}
