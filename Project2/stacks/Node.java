/**
 * "Stacks"
 * Copyright © 2014 Brianna Shade
 * bshade@pdx.edu
 *
 * Node.java
 * TODO details on this class
 */
package stacks;

public class Node<type> {

	private type value;
	private Node<type> next;
	
	/** Constructor **/
	public Node(){
		value = null;
		next = null;
	}
	public Node(type v){
		value = v;
		next = null;
	}
	
	/** Modifiers **/
	public void setValue(type v){
		value = v;
	}
	public void setNext(Node<type> n){
		next = n;
	}
	
	/** Accessors **/
	public type getValue(){
		return value;
	}	
	public Node<type> next(){
		return next;
	}
}
