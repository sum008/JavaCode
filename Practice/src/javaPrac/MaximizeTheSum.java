package javaPrac;

import java.util.Arrays;
import java.util.Scanner;

public class MaximizeTheSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t!=0) {
			long sum=0;
			int n = s.nextInt();
			long[] arr = new long[n];
			for(int i=0; i<n; i++) {
				
				arr[i]=s.nextLong();
			}
            
            for(int i=0; i<n; i++) {
            	for(int j=i+1; j<n; j++) {
            		if(arr[i]<arr[j]) {
            			long temp = arr[i];
            			arr[i]=arr[j];
            			arr[j]=temp;
            		}
            	}
            }
           for(int i=0; i<n/2; i++) {
        	   int j=n-1-i;
        	   sum=sum+(arr[j]-arr[i]);
           }
             System.out.println(Math.abs(sum));
            t--;
		}
		s.close();

	}

}
