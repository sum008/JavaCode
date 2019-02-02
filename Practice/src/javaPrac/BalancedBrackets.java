package javaPrac;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BalancedBrackets {
	
	public static String bracket() throws Throwable {
		ArrayList<Object> list = new ArrayList<Object>();
		Scanner c = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = c.nextInt();
		for(int e=0; e<t; e++) {
			
		String s = br.readLine();
		for(int i=0; i<s.length(); i++) {
			
			list.add(s.charAt(i));
		}
		int q=list.size();
		int p=0;
		while(list.size()!=0) {
			for(int i=0; i<list.size()-1; i++) {
				String  x=null;
				int j=i+1;
				x = String.valueOf(list.get(i))+String.valueOf(list.get(j));
				if(x.equals("{}")||x.equals("[]")||x.equals("()")) {
					list.remove(i);
					list.remove(j-1);
					i=i+2;
				}
			}
			p=list.size();
			if(p==q) {
				list.clear();
				return "No";
			}else {
				q=p;
			}
			if(list.size()==0) {
				list.clear();
				return "Yes";
		}
		}
		}
		return null;
	}
	public static void main(String[] args) throws Throwable {

		System.out.println(bracket());

	}

}
