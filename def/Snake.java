package def;

public class Snake {
	
	//##.#..
	//.###..

	public static void main(String[] args) {
		
		char[][] a={ {'#','#','.','#','.','.'} ,   
				
				     {'.','#','#','#','.','.'} };     
		int n=6;
		int count=1;
		int count1=0;
		int count4=0;
		int total=0;
		int x=0,y=0,count2=0;
		/*for(int i=0; i<2; i++){
			for(int j=0; j<7; j++){
				if(a[i][j]=='#'){
					n++;
				}
			}
		}
		System.out.println(n);*/
		l1:
		while(count<=n && total<=n ){ 
			total++;
			int p=0,q=0;
			if(count2==0){
			if(a[x][y]=='#'){
				System.out.println("aaa");
				//count++;
				count2++;
				if(count1==1){
					while(a[x-1][y]!='#'){
						if(a[x][y+1]=='#'){
							y=y+1;
							System.out.println("y is  "+y);
						}else{
							break l1;
						}
					}
					count1=0;
					x=x-1;
				}else if(x+1<=1  && y<6  && a[x+1][y]=='#'){
					
				     x=x+1;
				 	count++;
				
			   }
				else if(x<=1  && y+1<6  && a[x][y+1]=='#'){
					
					y=y+1;
					System.out.println("y isssssss "+y);
					//count1=1; //for going upward
					count++;
			
			    } else{
					break;
				}
				
			}}else{
				System.out.println("bbb");
				System.out.println("x "+x);
				if(a[x][y]=='#'){  //%%%%
					System.out.println("y "+y);
					System.out.println(count);
					//count2=0;   //For alternate up forward and down
					if(count1==1){
						if(x-1<0 && (y+2)<6){ //when x=0
						System.out.println("p "+y);
						while(a[x+1][y]!='#'){
							if(a[x][y+1]=='#'){
								y=y+1;
								p=1;
								//x=x+1;
								System.out.println("y is  "+y);
						}
						}
					}else if(x-1<0 && (y+2)<6){
						System.out.println("p "+y);
						while(a[x-1][y]!='#'){  //when x=1
							if(a[x][y+1]=='#'){
								y=y+1;
								q=1;
								System.out.println("y is  "+y);
						}
						}
					}
						if(p==1){
							System.out.println(" x cbc    "+x);
							x=x+1;
							p=0;
						}else{
							x=Math.abs(x-1);
							System.out.println(" x cbcmmmmmmmmmmmmmmm"+x);
							q=0;
						}
						count1=0;
						
					}else if(y+1<=6 && x<=1){ 
						if(a[x][y+1]=='#'){
						
							System.out.println("q");
						y=y+1;
						count1=1;//for going up
						count++;
						System.out.println(count);
						count4=1;
					}}else if(x+1<=1  && y<6){ 
						if(a[x+1][y]=='#'){
						
							System.out.println("r");
							x=x+1;
							System.out.println("xxxxxxxxxxxxx "+x);
						 	count++;
						 	System.out.println(count);
						 	count4=0;
						
					}}
					else{
						System.out.println("tttttttttttttttttttttttttttttttttttt");
						break;
					}
			
				}

	}

}
		System.out.println(count);
		if(count==n){
			System.out.println("snake");
		}else{
			System.out.println("no");
		}
}
}
