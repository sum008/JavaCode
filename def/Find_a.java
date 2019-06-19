package def;

public class Find_a {

	public static void main(String[] args) {
		
		String a="aba";
		String x="";
		int count=0;
		long n=1000000000;
		long m=a.length();
		long p=0;
		long q=0;
		long r=0;
		if(n>m){
		p=n%m;	
		}else{
			p=m%n;
		}
		System.out.println(p);
		for(int i=0; i<a.length(); i++){
			if(a.charAt(i)=='a'){
				count++;
			}
		}
		q=n-p;
		r=(count*q)/m;
		r=r+p;
		System.out.println(r);
		/*int count=0;
		int y=0;
		if(a=="a"){
			System.out.println(n);
		}else{
		for(int i=0; i<n; i++){
			if(y<a.length()){
				x=x+a.charAt(y);
				y++;
				if(x.charAt(i)=='a'){
					count++;
				}
			}else{
				y=0;
				x=x+a.charAt(y);
				y++;
				if(x.charAt(i)=='a'){
					count++;
				}
			}
		}
		System.out.println(x);
		System.out.println(count);
		}*/
	}

}
