package Implementation;

import java.util.ArrayList;

public class StackImplementation {
	
	private ArrayList<Object> stack;
    private int top =0;
    
    public StackImplementation() {
    	stack = new ArrayList<Object>();
    }
    
    public void push(Object data) {
    	
        stack.add(top, data);
    	top++;
    }
    
    public Object pop() {
    	
    	Object data = stack.get(top-1);
        stack.set(top-1, 0);
        top--;
        return data;
    }
    
    public void show() {
    	
    	for(Object i : stack) {
    		
    		System.out.print(i+ " ");
    	}
    }
    	
    	public Object peek() {
    		
    		Object data = stack.get(top-1);
    		return data;
    	}
    }


