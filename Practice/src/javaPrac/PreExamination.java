package javaPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class PreExamination {

	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
		int Testcase = s.nextInt();
		
		for(int i=0; i<Testcase; i++) {
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String[] arr=reader.readLine().split(" ");//take the input in string array separated by whitespaces" "
			int[] intarr=new int[arr.length];
			int count=0;
			for(int k=0;k<arr.length;k++) {
			 intarr[k]=Integer.parseInt(arr[k]);
			}
			int N=intarr[0];
			int K=intarr[1];
			int[] arr1=new int[N];
			for(int j=0; j<N; j++) {
				
				arr1[j] = s.nextInt();
			}
			
			for(int k=0; k<N; k++) {
				for(int m=k+1; m<N; m++) {
					
					if(arr1[k]<arr1[m]) {
						
						int temp =arr1[k];
						arr1[k]=arr1[m];
						arr1[m]=temp;
					}
				}
			}
			int x=arr1[K-1];
			for(int n=0; n<arr1.length; n++) {
				
				if(arr1[n]>=x) {
					count++;
				}
			}
			System.out.println(count);
		}
		s.close();
	}

}
