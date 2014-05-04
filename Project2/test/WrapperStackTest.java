/**
 * "Stacks"
 * Copyright © 2014 Brianna Shade
 * bshade@pdx.edu
 *
 * WrapperStackTest.java
 * Tests the WrapperStack class
 */
package test;

import static org.junit.Assert.*;
import org.junit.Test;
import stacks.WrapperStack;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class WrapperStackTest {

	@Test
	public void testInitialization() {
		WrapperStack<Integer> ws = new WrapperStack<Integer>();
		LinkedList<Integer> ls = (LinkedList<Integer>)ws;
		
		assertTrue("Stack isn't empty upon initialization", ls.isEmpty());
		assertEquals("Stack size should be 0 upon initialization", 0, ls.size());
	}
	
	@Test
	public void testPush() {
		WrapperStack<Integer> ws = new WrapperStack<Integer>();
		int k = 5;
		
		for(int i = 0; i < k; i++){
			ws.Push(i);
			assertFalse("Stack should not be empty after " + (i+1) + " pushes", ws.isEmpty());
			assertEquals("After " + (i+1) + " pushes, size should be " + (i+1) + " (" + ws.Size() + ")", i+1, ws.Size());
		}
	}
	
	@Test
	public void testPeek() {
		WrapperStack<Integer> ws = new WrapperStack<Integer>();
		int x = 5;
		
		ws.Push(x);
		int s = ws.Size();
		int p = ws.Peek();
		
		assertEquals("Known value of " + x + " should be returned with a peek (" + p + ")", x, p);
		assertEquals("A peek should not have changed the size (" + s + " to " + ws.Size() + ")", s, ws.Size());
	}
	
	@Test
	public void testPop() {
		WrapperStack<Integer> ws = new WrapperStack<Integer>();
		int x = 5, k = 5;
		
		ws.Push(x);
		int p = ws.Pop();
		
		assertEquals("Known value of " + x + " should be returned with a pop (" + p + ")", x, p);
		
		assertTrue("After single push and pop, stack should be empty", ws.isEmpty());
		for(int i = 0; i < k; i++) ws.Push(i);
		for(int i = 0; i < k; i++) ws.Pop();
		
		assertTrue("After " + k + " pushes and pops, stack should be empty", ws.isEmpty());
		assertEquals("After " + k + " pushes and pops, size should be 0 (" + ws.Size() + ")", 0, ws.Size());
	}

	@Test (expected = NoSuchElementException.class)
	public void testEmptyStack() {
		WrapperStack<Integer> ws = new WrapperStack<Integer>();
		assertTrue("Freshly initialized stack should be empty", ws.isEmpty());
		
		assertNull("Peeking an empty stack should return a null value", ws.Peek());
		ws.Pop();
	}
	
}
