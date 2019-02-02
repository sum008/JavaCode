package javaPrac;

import java.util.Scanner;

public class GapfulNum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter you number");
		int a = s.nextInt();
		
		String b = Integer.toString(a);
		
		String c =""+ b.charAt(0)+b.charAt(b.length()-1); //""+--> will add in form of string
		
		int d = Integer.parseInt(c);
		
		if(a%d==0) {
			
			System.out.println(a+" is a gapful number because it is divisible by "+d);
		}else {
			
			System.out.println(a+" is not a gapful number");
		}
		s.close();
	}
}
