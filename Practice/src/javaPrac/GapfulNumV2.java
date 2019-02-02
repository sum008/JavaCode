package javaPrac;

import java.util.Scanner;

public class GapfulNumV2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter you number");
		int a = s.nextInt();
		if(a>99) {
			
		String c = "";
		String d = "";
		int x=0;
		int y=0;
		System.out.println("From 1 to 99 all the numbers are gapful numbers");
		for(int i=100; i<=a; i++) {
			
				x = i;
				c = Integer.toString(x);
				d = ""+ c.charAt(0)+c.charAt(c.length()-1);
				y = Integer.parseInt(d);
				if(x%y==0) {
					System.out.println(x+ " is a gapful number");
				}else {
					System.out.println(x+" not a gapful number");
				}
			}
		s.close();
		}else {
			System.out.println("From 1 to 99 all the numbers are gapful numbers and number you entered is " + a);
	}
	}
	}


