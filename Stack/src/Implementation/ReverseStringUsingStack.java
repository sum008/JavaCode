package Implementation;

public class ReverseStringUsingStack {
	
	static StackImplementation s = new StackImplementation();
	public void reverse(StringBuffer str) {
		
		int n= str.length();
		
		for(int i=0; i<n; i++) {
			
			s.push(str.charAt(i));
		}
		for(int i=0; i<str.length(); i++) {
			
			System.out.print(s.pop());
		}
	}
	
	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("sumit kumar");
		ReverseStringUsingStack r = new ReverseStringUsingStack();
		r.reverse(str);

	}

}
