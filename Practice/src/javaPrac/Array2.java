package javaPrac;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		
		int arr1[] = {1,9,1,4,3};
		int arr2[] = {5,6,2,8,0};
		int x=0;
		int y=1;
		int z=0;
		int w=0;
		
		int arr3[] = new int[(arr1.length)+(arr2.length)];
		
		for(int i=0; i<arr3.length; i++) {
			
			if(i<5) {
				
				if(arr1[i]%2==0) {
					w=arr1[i];
					arr3[x]=w*w;
					x=x+2;
				}else {
					
					arr3[y]=arr1[i];
					y=y+2;
				}
			}
			else if(i>=5) {
				
				if(arr2[z]%2==0) {
					w=arr2[z];
					arr3[x]=w*w;
					x=x+2;
					z++;
				}else {
					
					arr3[y]=arr2[z];
					y=y+2;
					z++;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(arr3));

	}

}
