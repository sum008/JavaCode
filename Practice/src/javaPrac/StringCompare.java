package javaPrac;

public class StringCompare { //WIPRO AUTOMATA QUESTIONS

	public static void main(String[] args) {
		
		Stringcompare();
		PerfectNumber();
	}
	public static int Stringcompare() {	//LAST WORD OF STRING IN ARRAY MUST APPERAR AT FIRST POSITION IN ANOTHER STRING IN ARRAY AND VICE VERSA
		
		String arr[] = {"ijk", "abcd","fghi","def"};
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println("i is "+i);
			String a = arr[i];
			System.out.println(a);
			
			for(int j=i+1; j<arr.length; j++) {
				System.out.println("j is "+j);
				String b = arr[j];
				System.out.println(b);
				//System.out.println();
				 if(a.charAt(a.length()-1)==b.charAt(0)||a.charAt(0)==b.charAt(b.length()-1)) {
					 
					// return 1;
					 //System.out.println("True");
					 //System.out.println();
					 //break;
				 }else if(i==arr.length-1) {
					return 1;
					
				 }
				}
		}
		return 0;                 
		
				}
	
	public static void PerfectNumber() {
		
		int num = 28;
		int sum=0;
		for(int i=1; i<num; i++) {
			
			if(num%i==0) {
				sum=sum+i;
				System.out.println(sum);	
			}
			
		}if(sum==num) {
			System.out.println("sum of factors is : "+sum);
		}else {
			System.out.println("no sum");
		}
	}

}
