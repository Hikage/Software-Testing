/**
 * "Stacks"
 * Copyright © 2014 Brianna Shade
 * bshade@pdx.edu
 *
 * WrapperStackTest.java
 * Tests the WrapperStack implementation
 */
package test;

import stacks.WrapperStack;
import org.junit.Before;

public class WrapperStackTest extends BaseStackTest{
	
	@Before
	public void testClassInit() {
		bs = new WrapperStack<Integer>();
	}
	
}
