package javaPrac;

import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		int count=0;
		Scanner s = new Scanner(System.in);
		String[][] arr = new String[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				arr[i][j] = s.next();
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		l1:
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<2; j++) {
				
				if(arr[i][j].equals("l")) {
					
					if((arr[i+1][j].equals("l"))&&(arr[i+1][j+1].equals("l"))) {
						count++;
						break l1;
					}
			}
		} 

	}if(count>0) {
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}

}
}
