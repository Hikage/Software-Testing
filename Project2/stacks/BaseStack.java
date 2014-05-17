/**
 * "Stacks"
 * Copyright © 2014 Brianna Shade
 * bshade@pdx.edu
 *
 * BaseStack.java
 * Interface that ensures all inheriting classes implement the required methods
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
