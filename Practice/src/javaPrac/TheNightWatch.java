package javaPrac;

import java.util.Scanner;

public class TheNightWatch {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t!=0) {
		int count=0;	
		int n = s.nextInt();
		int x=0;
		int y=0;
		String arr[] = new String[n];
		String a = "";
		for(int i=0; i<n; i++) {
			arr[i]=s.next();
		}
		for(int i=0; i<n; i++) {
			a=a+arr[i];
		}
		a.trim();
		if(n%2==0) {
			
			for(int i=0; i<n; i++) {
				if(String.valueOf(a.charAt(i)).equals("1")) {
					count++;
				}
			}
			count = (n/2)-count;
		}else {
			
			for(int i=0; i<n; i++) {
				if(String.valueOf(a.charAt(i)).equals("1")) {
					count++;
					y=i;
				}
			}
			if(y%2==0) {
				x=(n+1)/2;
			}else {
				x=(n-1)/2;
			}
			
			count=x-count;
		}
		System.out.println(count);
		t--;
		}
		
	}

}
