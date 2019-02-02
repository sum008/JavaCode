package javaPrac;

public class EqualStack {

	public static void main(String[] args) {
		
		int h1[] = {1 ,1 ,1 ,1 ,2};
		int h2[] = {3 ,7};
		int h3[] = {1 ,3 ,1};
		int large=0;
		int count4=0;
		int count1=h1[h1.length-1];
        int count2=h2[h2.length-1];
        int count3=h3[h3.length-1];
        int x=h1.length-1;
        int y=h2.length-1;
        int z=h3.length-1;
        int m=h1.length-1;
        int n=h2.length-1;
        int o=h3.length-1;
        
        while((count1!=count2)||(count2!=count3)||(count1!=count3)){
        	if(count1<count2) {
        		if(x!=0) {
        			count1=count1+h1[x-1];
        			x--;
        		}
        	} if(count1<count3) {
        		if(m!=0) {
        			count1=count1+h1[m-1];
        			m--;
        		}
        } if(count2<count1) {
        	if(y!=0) {
    			count2=count2+h2[y-1];
    			y--;
    		}
	} if(count2<count3) {
		if(n!=0) {
			count2=count2+h2[n-1];
			n--;
		}
} if(count3<count1) {
	if(z!=0) {
		count3=count3+h2[z-1];
		z--;
	}
} if(count3<count2) {
	if(o!=0) {
		count3=count3+h2[o-1];
		o--;
	}
}
count4++;
if((h1.length>h2.length) && (h1.length>h3.length)) {
	large=h1.length;
}else if((h2.length>h1.length)&&(h2.length>h3.length)) {
	large=h2.length;
}else {
	large=h3.length;
}
if(count4>large) {
	break;
}
	}
 if((count1==count2)&&(count2==count3)&&(count1==count3)) {
       	 System.out.println(count2);
        }else {
       	 System.out.println(0);
       	
        }
	}
}
