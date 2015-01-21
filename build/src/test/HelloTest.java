package test;

import static org.junit.Assert.*;
import hello.Hello;

import org.junit.Test;
/**
 * 
 * @author Simon Wortha
 * @version 2015014
 *
 */
public class HelloTest {
	/**
	 *
	 */
	@Test
	public void testgetString() {
		assertEquals("nuqneH qo'", Hello.getString());
	}

}
