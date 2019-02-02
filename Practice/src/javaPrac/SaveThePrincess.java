package javaPrac;

import java.util.Scanner;

public class SaveThePrincess {
	
	public static void displayPathtoPrincess(int n, char arr[][]) {
		
		int w=0;
		int x=0;
		int y=0;
		int z=0;
		String move=null;
		String move1=null;
        for(int i=0; i<n; i++) {
 			
 			for(int j=0; j<n; j++) {
 				
 				if(arr[i][j]=='m') {
 					w=i;
 					x=j;
 				}else if(arr[i][j]=='p') {
 					y=i;
 					z=j;
 				}
 			}
 			
 		}
         if(w>y) {
        	 move = "up";
        	 }else {
        		 move="down";
         }
         for(int i=0; i<Math.abs(w-y); i++) {
    		 System.out.println(move);
         }
         if(x>z) {
        	 move1="left";
         }else {
        	 move1="right";
         }
         for(int i=0; i<Math.abs(x-z); i++) {
    		 System.out.println(move1);
         }
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		
		char arr[][] = new char[n][n];
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
				
				String x = s.next();
				arr[i][j] = x.charAt(0);
			}
		}
		displayPathtoPrincess( n, arr);

	}

}
