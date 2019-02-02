package javaPrac;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		pigLatin();
	}
	
	public static int pigLatin() {
		Scanner s = new Scanner(System.in);
		System.out.println("ENter your string");
		String a = s.nextLine();
		StringBuilder d = new StringBuilder(a);
		String b = "";
		String e="";
		String f = "";
		String g = "";
		int c = 0;
		
		for(int i=0; i<a.length(); i++) {
			
			if(i==0 && a.charAt(0)=='a'||a.charAt(0)=='A'||a.charAt(0)=='e'||a.charAt(0)=='E'||a.charAt(0)=='i'
					||a.charAt(0)=='I'||a.charAt(0)=='o'||a.charAt(0)=='O'||a.charAt(0)=='u'||a.charAt(0)=='U') {
				
					d.append("yay");
					System.out.println(d);
					String p = d.substring(0,a.length());
					System.out.println("Original string was :"+p);
					s.close();
					return 1;
				
			}else if(a.charAt(i)=='a'||a.charAt(i)=='A'||a.charAt(i)=='e'||a.charAt(i)=='E'||a.charAt(i)=='i'
					||a.charAt(i)=='I'||a.charAt(i)=='o'||a.charAt(i)=='O'||a.charAt(i)=='u'||a.charAt(i)=='U') {
				
				c = a.length()-i-1;
				for(int j=0; j<c; j++) {
					b = b+a.charAt(j)+"";
				}
				for(int k=c; k<a.length(); k++) {
					e = e+a.charAt(k)+"";
				}
				f = e+b+"ay";
				System.out.println(f);
				g = b+e+"";
				System.out.println("The original string was : "+g);
				s.close();
				return 1;
			}
		}
		s.close();
		return 0;

	}

}
