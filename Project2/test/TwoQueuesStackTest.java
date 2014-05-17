/**
 * "Stacks"
 * Copyright © 2014 Brianna Shade
 * bshade@pdx.edu
 *
 * TwoQueuesStackTest.java
 * Tests the TwoQueuesStack implementation
 */
package test;

import stacks.TwoQueuesStack;
import org.junit.Before;

public class TwoQueuesStackTest extends BaseStackTest{

	@Before
	public void testClassInit() {
		bs = new TwoQueuesStack<Integer>();
	}

}
