package Implementation;

public class Main {

	public static void main(String[] args) {
		
		StackImplementation s = new StackImplementation();
		s.push(5);
		s.push(10);
		s.push("kumar");
		s.push(50);
		s.push("yoy");
		s.show();
		for(int i=0; i<5; i++) {
		System.out.println("deleted data is "+s.pop());
		//s.show();
		}
	}

}
