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

public class WrapperStack<type> implements BaseStack<type> {
	
	private LinkedList<type> wstack;
	
	/** Constructor **/
	public WrapperStack(){
		wstack = new LinkedList<type>();
	}
	
	/** Modifiers **/
	public void Push(type o){
		wstack.addFirst(o);
	}
	public type Pop(){
		return wstack.pop();
	}
	
	/** Accessors **/
	public type Peek(){
		return wstack.peekFirst();
	}
	public int Size(){
		return wstack.size();
	}
	public boolean isEmpty(){
		return wstack.isEmpty();
	}

}
