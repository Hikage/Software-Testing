/**
 * "Stacks"
 * Copyright © 2014 Brianna Shade
 * bshade@pdx.edu
 *
 * NodeStack.java
 * Implements a stack through a series of singly-linked nodes; uses the Node.java object
 */
package stacks;

public class NodeStack<type> implements BaseStack<type> {

    private Node<type> head;
    private int size;

    /** Constructor **/
    public NodeStack(){
        head = new Node<type>();
        size = 0;
    }

    /** Modifiers **/
    public void Push(type o){
        Node<type> nextNode = head;
        head = new Node<type>(o);
        head.setNext(nextNode);
        size++;
    }
    public type Pop() throws Exception{
    	if(size < 1) throw new Exception("Cannot pop empty stack");
        type value = head.getValue();
        head = head.next();
        size--;
        return value;
    }

    /** Accessors **/
    public type Peek(){
        return head.getValue();
    }
    public int Size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }

}
