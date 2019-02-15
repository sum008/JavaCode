package javaPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringPrograms {

	public static void main(String[] args) {
		
		/*Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b= s.nextInt();
		int count=0;
		int mega=0;
		int sum=0;
		if(a==1) {
			
			for(int i=2; i<=b; i++) {
				count=0;
				for(int j=2; j<=i; j++) {
					
					if(i%j==0) {
						count++;
					}
				}
				
				if(count==1) {
					if(i<10) {
						sum=sum+i;
						mega++;
					}else {
						
						int n=0;
						int r=0; //53
						r=i%10;  //3
						n=i/10;  //5
						if((r==2||r==3||r==5||r==7 )&& (n==2||n==3||n==5||n==7)) {
							sum = sum+i;
							mega++;
						}
					}
					
				}
			}
			System.out.println(sum);
			System.out.println(mega);
		}
		
		
		int t = s.nextInt();
		for(int u=0; u<t; u++) {
		int count =0;
		String a = s.next();
		int b = a.length();
		if(b%2==0) {
		
		for(int i=0; i<(b/2); i++) {
			String x=null;
			int j=b-1-i;
				x=String.valueOf(a.charAt(i))+String.valueOf(a.charAt(j));
				if(x.equals("{}")||x.equals("[]")||x.equals("()")) {
				count++;
			}
		}
		if(count==b/2) {
			
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		}else {
			System.out.println("no");
		}
		}
		s.close();
		*//*String a=String.valueOf(2.4);
		System.out.println(a);
		String a = " ";
		String s = "my name is sumit kumar";
		String[] y = s.split(" ");
		for(int i=y.length-1; i>=0; i--) {
			
			a=a+y[i]+" ";
		}
		System.out.println(a);
		
	    String[] x = {"sumit", "kumar", "my", "name"};
	    
	    for(int i=0; i<x.length; i++) {
	    	
	    	for(int j=i+1; j<x.length; j++) {
	    		
	    		if(x[i].charAt(0)>x[j].charAt(0)) {
	    			
	    			String temp=x[i];
	    			x[i]=x[j];
	    			x[j]=temp;
	    		}
	    	}
	    }
	   for(int i=0; i<x.length; i++) {
		   
		   System.out.print(" "+x[i]);
	   }
		
		
		String str = "A3B4C3D4E6d9";
		int x=0;
		for(int i=1; i<str.length(); i=i+2) {
			
			String p=String.valueOf(str.charAt(i));
			x=Integer.parseInt(p);
			for(int j=0; j<x; j++) {
				System.out.print(str.charAt(i-1));
			}}
		*/
		
		
		   int n=3;
		int count2=0;
		int count1=0;
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n-i; j++) {
				
				System.out.print(" ");
				count2=j;
			}
			System.out.print("*");
			for(int k=count2; k<n-1; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=0; i<n-1;i++) {
			
			for(int j=0; j<=i; j++) {
				
				System.out.print(" ");
				count1=j;
			}
			System.out.print(" *");
			for(int k=count1+1; k<n-1; k++) {
				
				System.out.print(" *");
			}
			System.out.println();
		}
		
		System.out.println("#############################################################################################");
	
		/*String str1 = "2.3.1.4";
		String str2= "3.2.0.9";
		String[] str3 = str1.split("\\.");
		String[] str4 = str2.split("\\.");
		int x=0;
		int y=0;
		for(int i=0; i<str3.length; i++) {
			
			x = x+Integer.parseInt(str3[i]);
			y = y+Integer.parseInt(str4[i]);
		}
        if(x>y) {
			System.out.println(str1);
		}else {
			System.out.println(str2);
		}
		System.out.println("#############################################################################################");
		ArrayList<Integer> list = new ArrayList<Integer>();
		int arr[] = {2,3,5,8,10,11};
		int count3=0;
		for(int j=0; j<arr.length; j++) {
			count3=0;
		for(int i=2; i<=arr[j]; i++) {
			
			if(arr[j]%i==0) {
				
				count3++;
				
			}
		}
		if(count3==1) {
			System.out.println(arr[j]);
			list.add(arr[j]);
		}

	}
		System.out.println(list);*/
}}
