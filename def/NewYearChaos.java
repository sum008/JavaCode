package def;

import java.util.ArrayList;
import java.util.Arrays;

public class NewYearChaos {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int q[]={1 ,2 ,5 ,3 ,4, 7 ,8 ,6};
		int count=0,count1=1,count2=0;
       
            for(int i=0; i<q.length; i++){
                for(int j=i+1; j<q.length; j++){
                    if(q[i]>q[j]){
                    	
                    	
                        int temp=q[i];
                        q[i]=q[j];
                        q[j]=temp;
                        count2++;
                        System.out.println(q[i]);
                        System.out.println(q[j]);
                        if(q[i]!=i+1){
                    		list.add(q[i]);
                    		System.out.println("q[i] "+q[i]);
                    	}
                    	if(q[j]!=j+1){
                    		list.add(q[j]);
                    		System.out.println("q[j] "+q[j]);
                    	}
                    	
                    }
                }
            }
            list.add(q[q.length-1]);
            l1:
            for(int i=0; i<list.size(); i++){
            	count1=1;
            	for(int j=i+1; j<list.size(); j++){
            		if(list.get(i)==list.get(j)){
            			count1++;
            		}
            		if(count1>2){
            			System.out.println("Too chaotic");
            			break l1;
            		}
            	}
            	count++;
            }
            if(count==list.size()){
            	System.out.println(count2);
            }
           /*System.out.println(count);
            System.out.println(list.size());*/
            System.out.println(list);
            System.out.println(Arrays.toString(q));
            System.out.println(count1);
        }

	}


