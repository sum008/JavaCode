package javaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FancyQuote {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i=0; i<t; i++) {
			int count=0;
			String a = null;
		    a =br.readLine();
			String[] b = a.split(" ");
			for(int j=0; j<b.length; j++) {
				
				if(b[j].toLowerCase().equals("not")) {
					count++;
				}
			}if(count==1) {
				System.out.println("real fancy");
			}else {
				System.out.println("regular fancy");
			}
		}
		s.close();

	}

}
