package javaPrac;

import java.util.ArrayList;
import java.util.Scanner;

public class Noname {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0) {
			int count=0;
			int n=s.nextInt();
			int a=s.nextInt();
			int b=s.nextInt();
			int k=s.nextInt();
			
			for(int i=1; i<=n; i++) {
				if((i%a==0)&&(i%b!=0)) {
					count++;
				}else if((i%b==0)&&(i%a!=0)) {
					count++;
				}
			}
			if(count>=k) {
				System.out.println("Win");
			}else {
				System.out.println("lose");
			}
			t--;
		}
		s.close();
		

	}

}
