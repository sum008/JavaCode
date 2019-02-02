package javaPrac;

public class StringPermutation {

	public static void main(String[] args) {
		
		String s = "abcd";
		char arr[] = new char[s.length()];
		char temp;
		for(int i=0; i<arr.length; i++) {
			
			arr[i]=s.charAt(i);
		}
             for(int i=0; i<6; i++) {
            	 
            	 if(i<2) {
			   for(int j=i+1; j<arr.length;) {
				   temp = arr[j];
				   arr[j]=arr[i];
				   arr[i]=temp;
				   System.out.println(arr);
				   
				   break;
			   }}else if(i>1 && i<=3) {
				   for(int k=i-1; k<arr.length;) {
				   temp = arr[k];
				   arr[k]=arr[i-2];
				   arr[i-2]=temp;
				   System.out.println(arr);
				   break;
				   
			   }
				   //System.out.println(arr);
			   }else if(i>3 && i<6) {
				   
				   for(int l=i-3; l<arr.length;) {
					   temp = arr[l];
					   arr[l]=arr[i-4];
					   arr[i-4]=temp;
					   System.out.println(arr);
					   break;
			   }
			   //System.out.println(arr);
		}
	}

}
}
