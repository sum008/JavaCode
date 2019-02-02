package javaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exor {

	public static void main(String[] args) throws IOException {
  
		    Scanner s = new Scanner(System.in);
			long Testcase = s.nextLong();
			for(int i=0; i<Testcase; i++) {
				/*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				String[] arr=reader.readLine().split(" ");//take the input in string array separated by whitespaces" "
				long[] intarr=new long[arr.length];
				 
				for(int k=0;k<arr.length;k++) {
				 intarr[k]=Integer.parseInt(arr[k]);
				}
				long L=intarr[0];
				long R=intarr[1];*/
				long L = s.nextLong();
				long R = s.nextLong();
				long result=0;
				long count =L;
				for(long j=L; j<=R; j++) {
					result = result^count;
					count++;
				}
				if((result)%2==0) {
					System.out.println("Even");
				}else {
					System.out.println("Odd");
				}
			}
			s.close();
		}

}

