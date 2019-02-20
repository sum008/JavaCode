package def;

public class Solution1 {
	
	public static int[] swapValues(int[] a){
		
		int count=0;
		if(a.length%2!=0){
			count=a.length-1;
		}else{
			count=a.length;
		}
		for(int i=0; i<count; i=i+2){
			for(int j=i+1; j<count;){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				break;
			}
		}
		return a;
		
	}

	public static void main(String[] args) {
		
        int a[] = {111,77,88,44,32,11,13,25,44};
		
		int c[]=swapValues(a);
		
		for(int i=0; i<c.length; i++){
			System.out.print(c[i]+" ");
		}

	}

}
