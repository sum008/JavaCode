package def;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Pangram {
	
	public static String check(String s){
		String a="abcdefghijklmnopqrstuvwxyz";
	       // int count=0;
	        for(int i=0; i<a.length(); i++){
	            if(!s.toLowerCase().contains(String.valueOf(a.charAt(i)).toLowerCase())){
	                return "not pangrams";
	            }
	        }
	        return "pangrams";
}
	
	
	public static char[] sort(char[] a,String s){
		
		for(int i=0; i<s.length(); i++){
			for(int j=i+1; j<s.length(); j++){
				if(a[i]>a[j]){
                  char temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
				}
			}
		}
		return a;
	}
	
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------	
	public static void check1(String s){ //Not Perfect
		
		int count=1;
		s=s+"0";
		ArrayList<Character> list = new ArrayList<Character>();
		char[] a = new char[s.length()];
		
		a =s.toCharArray();

		for(int i=0; i<s.length(); i++){
			for(int j=i+1; j<s.length(); j++){
				if(a[i]>a[j]){
                  char temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
				}
			}
		}
		
		sort(a,s);
		
		System.out.println(Arrays.toString(a));
		
		for(int i=s.length()-1; i>=0; i--){
			int j=i-1;
			if(j>=0){
			if(a[i]==a[j]){
				count++;
			}else if(count%2==0){
				count=1;
				
			}else{
				list.add(a[i]);
				count=1;
			}
			
		}
		}
		
		Collections.sort(list);
		String x="";
		if(list.size()!=0){
			for(int i=0; i<list.size(); i++){
				x=x+list.get(i);
			}
			System.out.println(x);
		}else{
			System.out.println("list is empty");
		}
	}
//-------------------------------------------------------------------------------------------------------------------	
	public static void check2(String s){ //Perfect
		ArrayList<Character> list = new ArrayList<Character>();
		
		for(int i=0; i<s.length(); i++){
			list.add(s.charAt(i));
		}
		int x=0,y=0;
		while(list.size()!=0)
		{
			x=list.size();
		for(int i=0; i<list.size();i++)
		{
			int j=i+1;
              if(j<list.size())
              {	
				if(list.get(i)==list.get(j))
				{
					list.remove(j);
					list.remove(i);
					y=list.size();
					if(list.size()<=1){
						break;
					}
				}
              }
            }
		if(x==y){
			break;
		}
	}
		String z="";
		if(list.size()!=0){
			for(int i=0; i<list.size(); i++){
				z=z+list.get(i);
			}
			System.out.println(z);
		}else{
			System.out.println("empty");
		}
		
		
}
//-----------------------------------------------------------------------------------------------------------------------------	
	public static void main(String[] args) {
		
		String a= "e promptly judged antique ivory buckles for the next prize";
		int size=a.length()-1;
		//System.out.println(a.toLowerCase().conta);
		//System.out.println(check(a));
		String s = "zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh";
		//check1(s);
		check2(s);
		
	}

}
