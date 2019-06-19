package def;

import java.util.Arrays;

public class Tedts {

	public static void main(String[] args) {
		
		String a="My name is Sumit";
		System.out.println(a);
		int size=0;
		
        for(int i=0; i<a.length(); i++){
			if(a.charAt(i)!=' '){
			size++;
			}
		}
         
        int[] arr = new int[size];
 		char[] arr1 = new char[size];
 		int count=0;
 		
		for(int i=0; i<a.length(); i++){
			
			if(a.charAt(i)!=' '){
			arr[count]=(int)a.charAt(i);  // Type Casting
			arr1[count]=a.charAt(i);
			count++;
			}
		}
		
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				if(arr1[i]>arr1[j]){
					char temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
	}

}
