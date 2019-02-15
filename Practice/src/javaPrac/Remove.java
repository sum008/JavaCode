package javaPrac;

import java.util.Arrays;

public class Remove {

	public static void main(String[] args) {
		String a = "I,am,a,passionate,tester,and,doing,it,for,last,7,months.,I,am,extremely,dedicated,towards,my,work,and,finishes,my,work,before,deadline.,Hard-work,and,dedication,is,my,key,features.,It,will,be,a,great,opportunity,for,me,to,work,for,you,people,and,i'll,value,this,opportunity.,I'll,be,looking,forward,to,work,with,you.";
		String[] b = a.split(",");
		String c=" ";
		for(int i=0; i<b.length; i++) {
			c=c+" "+b[i];
		}
		System.out.println(c);

	}

}
