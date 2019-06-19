package def;

import java.util.Arrays;

public class Integer_with_even_odd {
	
	public static void int_with_even_odd(int[] a){
		int count=1;
		Arrays.sort(a);
		for(int i=0; i<a.length;i++){
			
			for(int j=i+1; j<=a.length; j++){
			    if(j<a.length && a[i]==a[j]){
					count++;
				}else if(j<a.length && count%2!=0){
					count=1;
					System.out.println(a[i]);
					i=j;
				}else if(count%2==0){
					i=j;
					count=1;
				}else if( j==a.length && count%2!=0){
					System.out.println(a[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int[] a= {3,1,1,3,4,0,4,5,5,0,5,5,4,4,4};
		int_with_even_odd(a);

	}

}
