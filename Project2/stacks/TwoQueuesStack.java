/**
 * "Stacks"
 * Copyright © 2014 Brianna Shade
 * bshade@pdx.edu
 *
 * TwoQueues.java
 * TODO details on this class
 */
package stacks;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class TwoQueuesStack<type> implements BaseStack<type>{

	private ArrayList<Queue<type>> twoqueues;
    private int activeQueue, inactiveQueue;

    /** Constructor **/
    public TwoQueuesStack(){
    	twoqueues = new ArrayList<Queue<type>>();
    	twoqueues.add(new LinkedList<type>());
    	twoqueues.add(new LinkedList<type>());
    	activeQueue = 0;
    	inactiveQueue = 1;
    }

    /** Modifiers **/
    public void Push(type o){
    	twoqueues.get(inactiveQueue).add(o);
    	twoqueues.get(inactiveQueue).addAll(twoqueues.get(activeQueue));
    	flipQueues();
    	twoqueues.get(inactiveQueue).clear();
    }
    public type Pop() throws Exception{
    	if(twoqueues.get(activeQueue).size() < 1) throw new Exception("Cannot pop empty stack");
    	    	
        return twoqueues.get(activeQueue).poll();
    }
    private void flipQueues(){
    	activeQueue = inactiveQueue;
    	inactiveQueue = (inactiveQueue + 1) % 2;
    }

    /** Accessors **/
    public type Peek(){
        return twoqueues.get(activeQueue).peek();
    }
    public int Size(){
        return twoqueues.get(activeQueue).size();
    }
    public boolean isEmpty(){
        return twoqueues.get(activeQueue).size() == 0;
    }

}
