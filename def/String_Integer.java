package def;

public class String_Integer {
	
	public static String string_Integer(String a){
		
		String b = "1234567890";
		int sum=0,count=0,check=0;
		String c="", d="";
		
		if(!(a.contains("1") || a.contains("2") ||a.contains("3") 
				||a.contains("4") ||a.contains("5") ||a.contains("6") ||a.contains("7") 
				||a.contains("8") ||a.contains("9") ||a.contains("0"))){
			
			return "0";
		}else{
		for(int i=0; i<=a.length(); i++){
			
			if(i<a.length() && b.contains(String.valueOf(a.charAt(i)))){
				c=c+String.valueOf(a.charAt(i));
				check=1;
			}else if(check==1 && i<a.length()){
				count=Integer.parseInt(c);
				sum=sum+count;
				d=d+c+"+";
				check=2;
				c="";
			}else if(i==a.length() && b.contains(String.valueOf(a.charAt(i-1)))){
				count=Integer.parseInt(c);
				sum=sum+count;
				d=d+c+"+";
			}
		}
		}
		String x = sum+"("+d+")";
		String y = x.substring(0, x.length()-2) +")";
		return y;
	}

	public static void main(String[] args) {
		
		System.out.println(string_Integer("abxjs45fssjf8"));//123ab!45c
		}

}
