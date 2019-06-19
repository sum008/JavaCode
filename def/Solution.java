package def;

public class Solution {
	
	public int[] sortOddValues(int a[]){
		int count=0;
		int count1=0;
		for(int i=0; i<a.length; i++){
			if(a[i]%2!=0){
				count++;
			}
		}
		int b[] = new int[count];
		
		for(int i=0; i<a.length; i++){
			if(a[i]%2!=0){
				b[count1]=a[i];
				count1++;
			}
		}
		for(int i=0; i<b.length; i++){
			for(int j=i+1; j<b.length; j++){
				if(b[i]>b[j]){
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		return b;
	}
       public static void main(String[] args) {
		
		Solution s = new Solution();
		int a[] = {111,77,88,44,32,11,13,25,44};
		
		int c[]=s.sortOddValues(a);
		
		for(int i=0; i<c.length; i++){
			System.out.print(c[i]+" ");
		}

	}

}
