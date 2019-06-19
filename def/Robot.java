package def;

import java.util.ArrayList;
import java.util.Scanner;

public class Robot {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int t=s.nextInt();
			while(t!=0){
				ArrayList<Integer> list = new  ArrayList<Integer>();
				int N=s.nextInt();
			    String R=s.next();
			    int X=s.nextInt();
			    list.add(X);
			    for(int i=0; i<N; i++){
			        if(R.charAt(i)=='R'){
			            X=X+1;
			            list.add(X);
			        }else{
			            X=X-1;
			            list.add(X);
			        }
			        
			        for(int k=0; k<=list.size()-2; k++){
			        	if(X==list.get(k)){
			        		list.remove(k);
			        	}
			        }
			    }
			    
			    /*for(int i=0; i<list.size(); i++){
			        for(int j=i+1; j<list.size(); j++){
			            if(list.get(i)==list.get(j)){
			                list.remove(i);
			            }
			        }
			    }*/
			    
			    System.out.println(list.size());
			    t--;
			}
			s.close();
}

}
