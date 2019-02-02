package javaPrac;

import java.util.Scanner;

public class DisariumNumbers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String b ="";
		int sum;
		String d="";
		int x=1;
		int y=0;
		int z=0;
		for(int j=1; j<=a; j++) {
			sum=0;
			 b = Integer.toString(j);
			z=j;
		for(int i=0; i<b.length(); i++) {
			
	          d = Character.toString(b.charAt(i));
	          y= Integer.parseInt(d);
	          sum = (int) (sum + Math.pow(y, x));
	          x++;
	          
		}
	          if(sum==j) {
	  			System.out.println(z +" is a Disarium Number");
	  			x=1;
	  			
	  		}else {
	  			System.out.println(z+" false");
	  			x=1;
	  		}
		}
		s.close();
}
}
