package def;

import java.util.ArrayList;

public class Tes {
	
	public static void main(String[] s){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(4);
		int i=0;
		int temp=0;
		l1:
		while(true){
			int count=0;
			int j=i+1;
			if(list.get(i)>list.get(j)){
				temp=list.get(i)/list.get(j);
				list.add(temp);
			}else{
				temp=list.get(j)/list.get(i);
				list.add(temp);
			}
			System.out.println(list);
			for(int k=0; k<list.size()-1; k++){
				if(list.get(k)==temp){
					System.out.println(count+1);
					break l1;
				}else{
					count++;
				}
			}
		}
	}
	/*public void sum(){
		System.out.println("parent");
	}
}

class tes1 extends Tes{
	
	public void sum(){
		System.out.println("child");
	}
	
	public void add(){
		System.out.println("add");
	}
}

class run{
	public static void main(String[] args){
		Tes t=new tes1();
			t.sum();
		    //t.add(); //showing error : The method add() is undefined for the type Tes
	}*/
}
