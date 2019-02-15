package javaPrac;

import java.util.ArrayList;
import java.util.Arrays;

public class cutTheStick {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		int[] arr = {1 ,13 ,3 ,8 ,14 ,9 ,4 ,4};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		list1.add(list.size());
		while(list.size()>1) {
			int a = list.get(0);
			for(int i=0;i<list.size(); i++) {
				int b=list.get(i)-a;
				list.set(i, b);
			}
			System.out.println("hhh "+list);
			
			for(int i=list.size()-1; i>=0; i--) {
				if(list.get(i)==0) {
					list.remove(i);
				}
				System.out.println("sdddg "+list);
			}
			
			if(list.size()==0) {
				break;
			}
			list1.add(list.size());
			System.out.println(list1);
		}
		
		int arr1[]=new int[list1.size()];
		for(int i=0; i<list1.size(); i++) {
			arr1[i]=list1.get(i);
		}
		
		System.out.println(Arrays.toString(arr1));
		
	}

}
