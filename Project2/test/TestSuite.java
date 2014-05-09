/**
 * "Stacks"
 * Copyright © 2014 Brianna Shade
 * bshade@pdx.edu
 *
 * TestSuite.java
 * Runs entire test suite
 */
package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ WrapperStackTest.class, ArrayStackTest.class, NodeStackTest.class, TwoQueuesStackTest.class })

public class TestSuite {}
