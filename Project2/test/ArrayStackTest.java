/**
 * "Stacks"
 * Copyright © 2014 Brianna Shade
 * bshade@pdx.edu
 *
 * ArrayStackTest.java
 * TODO details on this class
 */
package test;

import stacks.ArrayStack;
import org.junit.Before;
import org.junit.Test;

public class ArrayStackTest extends BaseStackTest{

	int bound = 10;
	
	@Before
	public void testClassInit() {
		bs = new ArrayStack<Integer>(bound);
	}
	
	@Test (expected = Exception.class)
	public void testFullStackPush() throws Exception {
		for(int i = 0; i <= bound; i++) bs.Push(i);
	}

}
