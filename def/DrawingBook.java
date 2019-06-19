package def;

import java.util.Arrays;

public class DrawingBook {
	
	public static void book(int n, int p){
		
		int a=0,count=0,count1=0;
		
		if(n%2!=0 && n-1==p){
			//System.out.println("sdfsdfsdf");
			
				System.out.println("0 flips");
			
		}else if(n%2==0 && n+1==p){
			
				System.out.println("0 flips");
			
		}else if(n-p<=p-1 && n%2==0){
			System.out.println("sdfsdfsdf");
			
				for(int i=n; i>=1; i=i-2){
					if(i==p){
						System.out.println(count);
						return;
					}else if(i+1==p){
						System.out.println(count);
						return;
					}else{
						count++;
					}
				}
			}else if(n-p<=p-1 && n%2!=0){
				//System.out.println("sdfsdfsdf");
				for(int i=n; i>=1; i=i-2){
					//System.out.println("sdfsdfsdf");
					if(i==p){
						System.out.println(count);
						return;
					}else if(i-1==p){
						System.out.println(count);
						return;
					}else{
						count++;
					}
				}
			}
		else if(n-p>p-1){
			//System.out.println("sdfsdfsdf");
			for(int i=1; i<=n; i=i+2){
				//System.out.println("sdfsdfsdf");
				if(i==p){
					System.out.println(count);
					return;
				}else if(i-1==p){
					System.out.println(count);
					return;
				}else{
					count++;
				}
			}
		}
				
	
	}
//##############################################################################################################################	
	
	public static void biggerIsGreater(String w){
		
		char[] a = w.toCharArray();
		int count=0;
		l1:
		for(int i=a.length-1; i>=0; i--){
			int j=i-1;
			                                                    //dkhc
			if(j>=0 && a[j]<a[i]){
				if(i!=a.length-1){
				//System.out.println(i);
				for(int m=i; m<a.length; m++){
					for(int n=m+1; n<a.length; n++){
						if(a[m]>a[n]){
							char temp=a[m];
							a[m]=a[n];
							a[n]=temp;
						}
					}
				}
			}
				//System.out.println(Arrays.toString(a));
				//System.out.println(i);
				l2:
				for(int k=i; k<a.length; k++){
					
					if(a[k]>a[j]){
						char temp=a[k];
						a[k]=a[j];
						a[j]=temp;
						break l2;
					}
				}
				//System.out.println(Arrays.toString(a));
				//System.out.println(i+" length "+a.length);
				for(int m=i; m<a.length; m++){
					//System.out.println("sfsdf");
					for(int n=m+1; n<a.length; n++){
						//System.out.println("llllllllllllllllllllll");
						if(a[m]>a[n]){
							char temp=a[m];
							a[m]=a[n];
							a[n]=temp;
						}
					}
				}
				
				break l1;
			}else{
				count++;
				//break;
			}
		}
		
		String b="";
		for(int v=0; v<a.length; v++){
			b=b+a[v];
		}
		if(count==a.length){
			System.out.println("No Answer");
		}else{
		System.out.println(b);
		}
	}

	public static void main(String[] args) {
		
		//book(5,4);
		String a = "abcd";    //f, e, d, c, b, a, b, d, c]
		biggerIsGreater(a);        //f,e,d,c,b,a,b,d,c

	}

}
