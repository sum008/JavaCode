package javaPrac;

import java.util.ArrayList;

public class IsValidString {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<Character>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		String s = "aabbccddeefghi";
		int originalSize=0;
		int count=0;
		int count1=0;
		for(int i=0; i<s.length(); i++) {
			list.add(s.charAt(i));
		}
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i)>list.get(j)) {
					char temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i)==list.get(j)) {
					count++;
					i=j;
				}
				
			}
			list1.add(count+1);
			count=0;
		}
		System.out.println(list1);

		for(int i=0; i<list1.size(); i++) {
			for(int j=i+1; j<list1.size(); j++) {
				if(list1.get(i)>list1.get(j)) {
					int temp = list1.get(i);
					list1.set(i, list1.get(j));
					list1.set(j, temp);
				}
			}
		}
		
		for(int i=0; i<list1.size(); i++) {
			for(int j=i+1; j<list1.size(); j++) {
				if(list1.get(i)!=list1.get(j)) {
					count1++;
					i=j;
				}
				
			}
			}
		System.out.println(list1);
		System.out.println(count1);
		if(count1==1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		//System.out.println(list1);
		
	}

}
