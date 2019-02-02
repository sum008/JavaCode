package javaPrac;

import java.util.Arrays;

public class StringPermutation2 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		int x=0;
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			
			temp = arr[x];
			for(int j=1; j<arr.length; j++) {
				
				arr[j-1]=arr[j];
			}
			arr[arr.length-1]=temp;
			System.out.print(Arrays.toString(arr)+",");
		}
	}
}
