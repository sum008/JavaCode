import java.util.Arrays;
import java.util.Random;

public class Recursion {
	
	double x=Math.random();
	
	public static double fact(double n){
		//System.out.println("## "+n);
		if(n==1){
			return 1;
		}else{ //return at this line is also correct
			return n*fact(n-1); //n stores the value and the value of n will be eliminated from stack when all recursive calls are
			                // made and n reaches 1, then stack starts to remove the values of n i.e 5*4, 5*4*3......
		}
		//System.out.println("-- "+n);
		//return n;  //Will return at the end because it is last statement and there are multiple stacks loaded and each stack 
		           //will end first and then it will return the end statement. So it will return final value of n at the end of stack
		           //which will be n!. This line also shows that this is the end of this current piece of code i.e current stack and
		           // now stack has to remove current value and go to next value(We know that return means end of statement, so stack know
		           // end of code i.e current value of n should be now removed and get to next value.....Debug to understand )
	}
	
	public static int factorial(int n){
		int x=1;
		for(int i=1; i<=n; i++){
			x=x*i;
		}
		return x;
	}
	
	
	public static int GCD(int num1, int num2){
		
		while(num2!=0){
			int temp=num2;
			num2=num1%num2;
			num1=temp;
		}
		return num1; //same return for both(recursive and iterative)
	}
	
	public static int GCDrecursion(int num1, int num2){
		if(num2<=1){
			System.out.println("^^^^^^^ "+num1);
			return num1;
		}else{
			System.out.println(num1 +" "+num2);
			int temp=num2;
			num2=num1%num2; //This is also correct
			System.out.println("--- "+ num2);
			//GCDrecursion(temp,num1%num2);  //This is also correct
			return  GCDrecursion(temp,num2);//This is also correct
			//System.out.println("---##### "+ num2);
			//num1=temp;
			//return num2;
		}
	}
	
	public static int sum(int n){
		if(n<=0){
			return n;
		}else{
			return n+sum(n-1);
			
		}
	}
	
	public static void check(){
		int arr[]={2,3,2,2,3,2};
		int x=0,y=(arr.length-1), z=0;
		for(int i=0; i<=arr.length/2; i++){
			if(arr[x]==arr[y]){
				System.out.println(arr[x] + " " + arr[y]);
				z++;
			}
			x++;
			y--;
		}
		System.out.println(z);
		if(z==arr.length/2+1){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
	
	public static boolean checkRecursion(int x,int n, int[] arr){
		
		if(x>=n){
			return true;
		}
		if(arr[x]!=arr[n]){
			return false;
		}
		return checkRecursion(x+1, n-1 ,arr);//returning at this line will return the value from stack of each frame(i.e..rech recursive call)
	}
	
	public static int recursiontail(int n){ //This is tail recursion
		if(n==1){
			return n; //in descending order
		}else if(n%2!=0){
			System.out.println("upper "+ n);
			return recursiontail(3*n+1);
		}else{
			System.out.println("lower "+ n);
			return recursiontail(n/2);
		}
	}
	
	public static int recursionhead(int n){ 
		if(n==1){
			System.out.println("n is "+n); //in ascending order
			return n;
		}else if(n%2!=0){
			 recursionhead(3*n+1);
			 System.out.println("upper "+ n);
		}else{
			recursionhead(n/2);
			System.out.println("lower "+ n);
		}
		return n;
	}
	
	public static boolean binasySearchWithRecursion(int l, int r, int[] arr, int element){
		int mid=(l+r)/2;
		System.out.println(l+" "+r);
		if(l>=r-1){
			return false;
		}else if(arr[mid]>element){
			return binasySearchWithRecursion(l,mid,arr,element);
		}else if(arr[mid]<element){
			return binasySearchWithRecursion(mid,r,arr,element);
		}else{
			return true;
		}
	}
	public static int fib(int n){
		int sum=0;
		if(n<=1){
			//System.out.println(n);
			return n;
		}else{
			//System.out.println(sum);
			return fib(n-1)+fib(n-2);
			//return n;
		}
	}
	
	public static void StringRev(int size, String a, String x){
		
		if(size<0){
			System.out.println("---- "+x);
			return;
		}else{
			x=x+a.charAt(size);
			//System.out.println(x);
			StringRev(size-1,a,x);
			//System.out.println(x);
			return;
		}
	}
	
	/*public static int countConsonant(int size, String a,int count){
		String vovels = "aeiou";
		if(size<0){
			return count;
		}else{
			if(vovels.contains(String.valueOf(a.charAt(size)))){
				count++;
				System.out.println(count);
			}
			countConsonant(size-1,a,count);
			return count;
		}
	}*/
	
	public static void countConsonant(int size, String a,int count){
		String vovels = "aeiou";
		if(size<0){
			System.out.println(a.length()-count);
			return ;
		}else{
			if(vovels.contains(String.valueOf(a.charAt(size)))){
				count++;
			}
			countConsonant(size-1,a,count);
			return ;
		}
	}
	
	public static void stringPalidrome(int size, String a, String b){
		if(size<0){
			if(a.equals(b)){
				System.out.println("Yes");
				System.out.println(b);
			}else{
				System.out.println("No");
				System.out.println(b);
			}
		}else{
			b=b+a.charAt(size);
			stringPalidrome(size-1,a,b);
			return;
		}
	}
	
	public static boolean stringPalidrome2(int size, String a, String b,int l){
		if(size<0){
			return true;
		}else{
			if(a.charAt(l)!=b.charAt(size)){
				return false;
			}
		}
		return stringPalidrome2(size-1, a, b,l+1);
		
	}
//-----------------------------------------------------------------------------------------------------------------------	
//----------------------------------------HOARE ALGORITHM----------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------	
	
	public static int select(int first, int last, int position, int[] arr){
		
		System.out.println(first +" "+last);
		System.out.println(Arrays.toString(arr));
		int pivot= partition(first, last,arr);
		
		if(pivot>position){
			System.out.println(Arrays.toString(arr));
			return select(first, pivot-1,position,arr);//first will remain first i.e 0
		}else if(pivot<position){
			System.out.println(Arrays.toString(arr));
			return select(pivot+1,last,position,arr);//last will remain last i.e arr.length-1
		}else{
		  return arr[position];
			//return Arrays.toString(arr);
		}
		
	}
	
	public static int partition(int firstindex, int lastindex,int[] arr){
		
		Random r=new Random();
		int pivot = r.nextInt(lastindex-firstindex+1)+firstindex;
		System.out.println("Random-- "+pivot);
		swap(arr,pivot,lastindex);
		
		for(int i=firstindex; i<=lastindex; i++){
			if(arr[i]>arr[lastindex]){
				swap(arr,i,firstindex);
				firstindex++;
			}
		}
		swap(arr,firstindex,lastindex);
		
		return firstindex;
		
	
	}
	
	public static void swap(int[] arr,int from,int to){
		
		int temp = arr[from];
		arr[from]=arr[to];
		arr[to]=temp;
	}
//-------------------------------------------------------------------------------------------------------------------------'
//-------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------	
	public static void main(String[] args) {

	//	System.out.println(fact(5));
		//System.out.println(factorial(20));
		//System.out.println(GCDrecursion(10,45));
		//System.out.println(sum(9999));
		//System.out.println(3/2);
	//	check();
		//int[] a = {3,2,2,3,2,2,1};//with this, the code will execute only once hence, function cant call itself so only one frame is added to stack and temination of that frame will be done at first return statement itself(run to see)
		//System.out.println(checkRecursion(0,6, a));
		//System.out.println(recursiontail(17));
		//System.out.println(recursionhead(17));
		//int[] arr = {2,4,6,8,10,12,14};
		//System.out.println(binasySearchWithRecursion(0,arr.length,arr,14));
		//System.out.println(fib(7));
		//String a="sumit is not good with programming";
		//String b="";
		//StringRev(a.length()-1,a,b);
		//System.out.println(StringRev(4,a,b));
		//String a = "abcuuuu";
		//int count=0;
		//countConsonant(a.length()-1,a,count);
		
		//String c="ABCDCBAe";
		//String d="";
		//stringPalidrome(c.length()-1,c,d);
		//System.out.println(stringPalidrome2(c.length()-1,c,c,0));
		
		int[] arr = {1,-2,5,8,7,6};
		int osition = 1;
		int pos=osition-1;
		System.out.println(select(0, arr.length-1, pos, arr));
		
	}

}
