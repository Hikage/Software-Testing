/**
 * "Stacks"
 * Copyright © 2014 Brianna Shade
 * bshade@pdx.edu
 *
 * Array.java
 * TODO details on this class
 */
package stacks;

import java.lang.reflect.Array;

public class ArrayStack<type> {

	private type[] astack;
	private int size, head;
	
	/** Constructor **/
	@SuppressWarnings("unchecked")
	public ArrayStack(int s){
		size = s;
		astack = (type[]) Array.newInstance(Object[].class, size);
		head = size;
	}
	
	/** Modifiers 
	 * @throws Exception **/
	public void Push(type o) throws Exception{
		if(head < 1) throw new Exception("Cannot push full stack");
		
		astack[head--] = o;
	}
	public type Pop() throws Exception{
		if(head > size-1) throw new Exception("Cannot pop empty stack");
		
		type element = astack[head];
		astack[head] = null;
		head++;
		return element;
	}
	
	/** Accessors **/
	public type Peek(){
		return astack[head];
	}
	public int Size(){
		return size - head;
	}
	public boolean isEmpty(){
		return head == size;
	}

}
