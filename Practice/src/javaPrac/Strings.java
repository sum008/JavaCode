package javaPrac;

public class Strings {
	
	public static void main(String []args){
		
		int n=100;
		int x=0;
        for(int i=2; i<=n; i++){
            int count=0;
            for(int j=2; j<=i; j++){
                
                if(i%j==0){
                    count++;
              
                }}
            if(count==1) {
            	System.out.println("|prime : "+i);
            	
            }
        }
	       
		/*Scanner s = new Scanner(System.in);
		
		String a = s.nextLine();
	String b = 	a.substring(0, 1).toUpperCase();
	String c = a.substring(1, a.length()).toLowerCase();
	String d = b+c;
	System.out.println(d);*/
	
	      /* char[] arr1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	       int x=0;
	       String[] arr2 = {"zebra","is","black","and","white"};
	       
	       //USE LIST TO TAKE STRING FROM USER
	       
	       String arr2[] = new String();
	       while(s.nextLine() != "\n") {
	    	   arr2[x] = s.nextLine();;
	    	   x++;
	       }
	       String[] arr3 = new String[arr2.length];
	       
	       String temp = "";
	       for(int i=0; i<arr2.length; i++){
	           temp = arr2[i];
	           StringBuilder myName = new StringBuilder(temp);
	           for(int j=0; j<temp.length(); j++){
	               
	               if(temp.charAt(j)=='z'){
	                   
	                   myName.setCharAt(j, 'a');
	               }else{
	                   
	                   for(int k=0; k<arr1.length; k++){
	                       
	                       if(temp.charAt(j) == arr1[k]){
	                           
	                           myName.setCharAt(j, arr1[k+1]);
	                       }
	                   }
	               }
	           }
	           arr3[i] = myName.toString();
	        }
	       System.out.print(Arrays.toString(arr3));*/
	     }
}
