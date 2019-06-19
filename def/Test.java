package def;

import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(5);
		list.add(51);
		list.add(52);
		list.add(53);
		list.add(54);
		
		list.add(1, 7);
		
		System.out.println(list);

	}

}
