package javaPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public  class Sorting {

	public static void main(String[] args) {
		
		shorting();

	}
	
public static void shorting() {
		
	ArrayList<String> emp = new ArrayList<String>();
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter values");
		for(int a=0; a<n; a++) {
			
			emp.add(a, s.nextLine().);
		}*/
emp.add("sumit");
emp.add("rahul");
emp.add("amit");
emp.add("drona");
emp.add("chetan");

		for(int i=0; i<emp.size(); i++) { //Same sorting algo can be used for integer sorting
			
			for(int j=i+1; j<emp.size(); j++) {
				
				if(emp.get(i).charAt(0) > emp.get(j).charAt(0)) { //just remove .chatAt()
					
					String temp = emp.get(i); 
					emp.set(i, emp.get(j));
					emp.set(j, temp);
				}
			}
		}
		
		System.out.println(emp);
		
	}

}
