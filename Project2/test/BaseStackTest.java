/**
 * "Stacks"
 * Copyright © 2014 Brianna Shade
 * bshade@pdx.edu
 *
 * BaseStackTest.java
 * Base test class that includes all common test modules
 */
package test;


import stacks.BaseStack;
import java.util.Stack;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BaseStackTest {

	protected static BaseStack<Integer> bs;
	protected static Stack<Integer> st;
	
	@Before
	public void stackInit() {
		st = new Stack<Integer>();
	}
	
	@Test
	public void testInitialization() {		
		assertTrue("Stack isn't empty upon initialization", bs.isEmpty());
		assertEquals("Stack size should be 0 upon initialization", 0, bs.Size());
	}
	
	@Test
	public void testPush() throws Exception {
		int k = 5;
		
		for(int i = 0; i < k; i++){
			bs.Push(i);
			st.push(i);
			assertFalse("Stack should not be empty after " + (i+1) + " pushes", bs.isEmpty());
			assertEquals("After " + (i+1) + " pushes, size should be " + st.size() + " (" + bs.Size() + ")", st.size(), bs.Size());
		}
	}
	
	@Test
	public void testPeek() throws Exception {
		int x = 5;
		
		bs.Push(x);
		int s = bs.Size();
		int p = bs.Peek();
		
		assertEquals("Known value of " + x + " should be returned with a peek (" + p + ")", x, p);
		assertEquals("A peek should not have changed the size (" + s + " to " + bs.Size() + ")", s, bs.Size());
	}
	
	@Test
	public void testPop() throws Exception {
		int x = 5, k = 5;
		
		bs.Push(x);
		st.push(x);
		int p = bs.Pop();
		int sp = st.pop();
		
		assertEquals("Known value of " + sp + " should be returned with a pop (" + p + ")", sp, p);		
		assertTrue("After single push and pop, stack should be empty", bs.isEmpty());
		
		for(int i = 0; i < k; i++) bs.Push(i);
		for(int i = 0; i < k; i++) bs.Pop();
		
		assertTrue("After " + k + " pushes and pops, stack should be empty", bs.isEmpty());
		assertEquals("After " + k + " pushes and pops, size should be 0 (" + bs.Size() + ")", 0, bs.Size());
	}

	@Test (expected = Exception.class)
	public void testEmptyStack() throws Exception {
		assertTrue("Freshly initialized stack should be empty", bs.isEmpty());
		
		assertNull("Peeking an empty stack should return a null value", bs.Peek());
		bs.Pop();
	}

}
