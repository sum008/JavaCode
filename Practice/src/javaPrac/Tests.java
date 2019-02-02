package javaPrac;

public class Tests {
	public static int pos =0;
	public static int pos1 =0;
	public static int pos2 =0;
	public static int x =0;
	
	public static void main(String[] args) {
		
		char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String a = "sololearn";
		String b = "web";
		outer:
		for(int i=0; i<a.length(); i++) {
			
			for(int j=0; j<arr.length; j++) {
				
				if(a.charAt(i)==arr[j]) {
					pos = j;
				}
			}
		
			if(x==b.length()-1) {
				x=0;
			}
			//int s=x;
			//inner:
			for(int k=x; k<b.length();k++) {
				
				for(int l=0; l<arr.length; l++) {
					
					if(b.charAt(k)==arr[l]) {
						pos1 = l;
					}
					x++;
					pos2 = pos+pos1;
					if((pos2-1)>26) {
						pos2 = (pos2-1)-26;
						System.out.println(arr[pos2-1]);
					}
					else {
						System.out.println(arr[pos2-1]);
					}
					//continue outer;
					
		}
			/*pos2 = pos+pos1;
			if((pos2-1)>26) {
				pos2 = (pos2-1)-26;
				System.out.println(arr[pos2-1]);
			}
			else {
				System.out.println(arr[pos2-1]);
			}*/
			
	}
	

}
		}
}
