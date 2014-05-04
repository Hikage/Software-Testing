/**
 * "Stacks"
 * Copyright © 2014 Brianna Shade
 * bshade@pdx.edu
 *
 * Wrapper.java
 * Simple wrapper to implement a stack using LinkedList methods
 */
package stacks;

import java.util.LinkedList;

public class WrapperStack<type> extends LinkedList<type>{
	private static final long serialVersionUID = 1L;

	private LinkedList<type> lstack;
	
	/** Constructor **/
	public WrapperStack(){
		lstack = new LinkedList<type>();
	}
	
	/** Modifiers **/
	public void Push(type o){
		lstack.addFirst(o);
	}
	public type Pop(){
		return lstack.pop();
	}
	
	/** Accessors **/
	public type Peek(){
		return lstack.peekFirst();
	}
	public int Size(){
		return lstack.size();
	}
	public boolean isEmpty(){
		return lstack.isEmpty();
	}

}
