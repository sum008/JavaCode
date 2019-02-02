package javaPrac;

import java.util.ArrayList;

public class Typing {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Double> list1 = new ArrayList<Double>();
		double count = 0.2;
		String str = "fdjkd";
		int x=0;
		int y=0;
		for(int a=0; a<str.length(); a++) {
			for(int b=a+1; b<str.length(); b++) {
				
				if(str.charAt(a)==str.charAt(b)) {
					
					list.add(b);
					//x++;
					
					if(a!=0) {
						
						if(((str.charAt(a-1)=='j'||str.charAt(a-1)=='k')&&(str.charAt(a)=='d'||str.charAt(a)=='f'))
								||((str.charAt(a-1)=='d'||str.charAt(a-1)=='f')&&(str.charAt(a)=='j'||str.charAt(a)=='k'))) {
							
							list1.add(0.1);
						}else {
							
							list1.add(0.2);
							//y++;
						}
					}else {
						
						list1.add(0.1);
					}
				}
			}
		}
		char prev = str.charAt(0);
		
		for(int i=1; i<str.length(); i++) {
			
			if(x<list.size()) {
				
				if(i==list.get(x)) {
					count =count+list1.get(x);
					x++;
				}
			}else if(prev=='d'||prev=='f') {
			
				count=count+0.4;
				prev=str.charAt(i);
			}else {
				count =count+0.2;
				prev=str.charAt(i);
			}
		
		}
		System.out.println(count);
		System.out.println(list);
        System.out.println(list1);
        
	}

}
