package javaPrac;

import java.util.Scanner;

public class ByteToBit {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		while(t!=0) {
			int count=1;
			long bit=0, nibble=0, Byte=0, x=1;
			int n = s.nextInt();
			for(int i=1; i<=n; i++) {
				
				if(count<=2) {
					bit=x;
					nibble=0;
					Byte=0;
					count++;
				}else if(count>2 && count <=10) {
					bit=0;
					nibble=x;
					Byte=0;
					count++;
				}else if(count>10 && count <=26) {
					bit=0;
					nibble=0;
					Byte=x;
					count++;
				}
				if((count-1)==26) {
					x=x*2;
					count=1;
				}
			}
			
			System.out.println(bit + " " + nibble + " "+ Byte);
			t--;
		}
		s.close();

	}

}
