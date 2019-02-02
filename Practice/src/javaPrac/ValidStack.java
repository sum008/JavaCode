package javaPrac;

import java.util.Scanner;

public class ValidStack {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t!=0) {
			int count=0;
			int n = s.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=s.nextInt();
			}
			
			for(int i=0; i<n; i++) {
				if(arr[i]==1) {
					count=count+1;
				}else {
					count=count-1;
				}
				if(count==-1) {
					System.out.println("Invalid");
					break;
				}
			}
			if(count>=1) {
				System.out.println("Valid");
			}
			t--;
		}
		s.close();

	}

}
