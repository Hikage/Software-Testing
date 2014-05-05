/**
 * "Stacks"
 * Copyright © 2014 Brianna Shade
 * bshade@pdx.edu
 *
 * BaseStack.java
 * TODO details on this class
 */
package stacks;

public interface BaseStack<type> {
	
	/** Modifiers 
	 * @throws Exception **/
	public void Push(type o) throws Exception;
	public type Pop() throws Exception;
	
	/** Accessors **/
	public type Peek();
	public int Size();
	public boolean isEmpty();
}
