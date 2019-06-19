package def;

public class LisaWorkbook {

	public static void main(String[] args) {
		
		int[] e = {4, 2 ,6 ,1 ,10}; 
		for(int a:e){
			System.out.println(e[a]);
		}
		
		
		int n=5,k=3;
		int arr[]={4, 2 ,6 ,1 ,10};
		int pageno=0;
		int count=0;
		int count1=0;
		for(int i=0; i<n; i++){
			
			System.out.println("chapterrrrrrrrrrrrrrrrrrrrrrrrrr : "+(i+1));
			for(int j=1; j<=arr[i]; j++){
				count1++;
				if(j==pageno){
					count++;
				}
				if(count1==k || j==arr[i]){
					pageno++;
					count1=0;
					System.out.println("page no : "+pageno);
				}
				System.out.println("ques "+j);
			}
		}
		System.out.println(count);

	}

}
