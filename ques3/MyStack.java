package ques3;

import java.util.ArrayList;

public class MyStack<T extends Comparable<T>> {
	public ArrayList<T> stack;
	public int top=-1;
	public T min=null;
	
	
	public MyStack() {
		stack = new ArrayList<T>();
	}
	
	public boolean push(T obj) {
		top++;
		
		if((boolean) stack.set(top,obj)) {
			
			if(top == 0) {
				min=obj;
			}
			else if( (min.compareTo(obj))< 0) {
				min = obj;
			}
			
			return true;
		}else {
			return false;
		}
		
	}
	
	public T pop() {
		
		if(top>-1) {
			T temp = stack.get(top);
			top--;
			return temp;
		}else {
			return null;
		}
		
	}
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		return false;
	}
	
	public T getMin() {
		return min;
	}

}
