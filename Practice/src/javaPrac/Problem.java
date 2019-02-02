package javaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		
		for(int testcase=0; testcase<T; testcase++) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String[] a = {"monday", "tuesday", "wednesday" ,"thursday" , "friday","saturday", "sunday"};
			String[] b =reader.readLine().split(" ");
			String S = b[0].stripTrailing();
			String E = b[1].stripTrailing();
			int L = Integer.parseInt(b[2]);
			int R = Integer.parseInt(b[3]);
			int x=0;
			int y=0;
			int z=0;
			int count=0;
			int p=0;
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a.length; j++) {
					
					if(S.equals(a[i])&&E.equals(a[j])) {
						
						x=i+1;
						y=j+1;
					}
				}
				
			}
			z=y-x+1;
			for(int i=1; i<100; i++) {
				if(z>=L && z<=R) {
					count++;
					p=z;
				}
			z=z+7;
			}
			if(count>1) {
				System.out.println("Many");
			}else if(count==1) {
				System.out.println(p);
			}else {
				System.out.println("impossible");
			}
			
		}
		
		/*Scanner s = new Scanner(System.in);
        int x=2;
        System.out.println(x);
        int y = s.nextInt();
        if(x!=y) {
        	
        	if(x>y) {
        	System.out.println(x+y);
        	}else {
        	System.out.println(y-x);
        	}
        }
        s.close();*/

	}

}
