package javaPrac;

import java.util.ArrayList;
import java.util.Scanner;
public class JosephusProblem {
	public static int c=0;
	public static int d=0;
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of persons : ");
		int n = s.nextInt();
		int t = n;
		int v = 0;
		while(t>=1) {
			t=t/2;
			v=v+1;
			//System.out.println(v);
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		int b = 1;
		
		for(int i=0; i<n; i++) {
			
			list.add(b);
			b=b+1;
		}
         for(int j=c; j<n;) {
			System.out.println("person alive : "+list.get(j));
			list1.add(list.get(j));
			j=j+2;
		}
         
        if(n%2!=0) {
        	System.out.println("------------------------------------------------------------------------------------");
    		fun(1,list1);
        	for(int g=1; g<v-1; g++) {
		        System.out.println("----------------------------------------------------------------------------------------");
		       fun(c,list1);
		
        	} }else {
            	System.out.println("------------------------------------------------------------------------------------");
        		funeven(0,list1);
        		for(int g=1; g<v-1; g++) {
        	     System.out.println("----------------------------------------------------------------------------------------");
    		     funeven(d,list1);
    	}
         }
        s.close();
		
	}
	         public static void fun(int p,ArrayList<Integer> list) {
			
			  int m = list.get(list.size()-1);
			//System.out.println("list is "+m);
			ArrayList<Integer> list1 = new ArrayList<Integer>();
		    for(int j=p; j<list.size();) {
		    	
			System.out.println("person alive : "+list.get(j));
			list1.add(list.get(j));
			
			j=j+2;
		
		}
		  
		    int n=list1.get((list1.size()-1));
		   // System.out.println("list1 is   "+n);
		    if(m!=n) {
		    	c=0;
		    }else {
		    	 c=1;
		    }
		   // System.out.println("value of c is   "+c);
		    list.clear();
		    for(int j=0; j<list1.size();j++) {
			
				list.add(list1.get(j)); //added in original list by deleting the values of original list so that new list could be used in function call ie (list) wil be act as (list1) in function call with updated values
				
			}
		}
		
		public static void funeven(int b ,ArrayList<Integer> list) {
			
			int m = list.get(list.size()-1);
			//System.out.println("list is "+m);
			ArrayList<Integer> list1 = new ArrayList<Integer>();
		    for(int j=b; j<list.size();) {
		    	
			System.out.println("person alive : "+list.get(j));
			list1.add(list.get(j));
			j=j+2;
		
		}
		  
		    int n=list1.get((list1.size()-1));
		   // System.out.println("list1 is   "+n);
		    if(m!=n) {
		    	d=0;
		    }else {
		    	 d=1;
		    }
           // System.out.println("value of d is   "+d);
		    list.clear();
		    for(int j=0; j<list1.size();j++) {
			
				list.add(list1.get(j)); //added in original list by deleting the values of original list so that new list could be used in function call ie (list) wil be act as (list1) in function call with updated values
		}
}
		
}
