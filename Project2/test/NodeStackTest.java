/**
 * "Stacks"
 * Copyright © 2014 Brianna Shade
 * bshade@pdx.edu
 *
 * NodeStackTest.java
 * Tests NodeStack implementation
 */
package test;

import stacks.NodeStack;
import org.junit.Before;


public class NodeStackTest extends BaseStackTest{

	@Before
	public void testClassInit() {
		bs = new NodeStack<Integer>();
	}

}
