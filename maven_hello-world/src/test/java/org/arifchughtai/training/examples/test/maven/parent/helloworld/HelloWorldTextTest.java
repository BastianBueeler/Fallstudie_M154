package org.arifchughtai.training.examples.test.maven.parent.helloworld;

import org.arifchughtai.training.examples.maven.parent.helloworld.*;

import junit.framework.TestCase;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */

/**
 * Constructor for the test class.
 * 
 * @param inName The name of the test.
 */

public class HelloWorldTextTest extends TestCase{
	
public HelloWorldTextTest(String inName) {
  super(inName);
}
 
/**
 * Here you can specify all data that you need for your tests
 * like e.g. initiating a connection to a DB e.g. to read test data.
 */
protected void setUp() {
}
 
/**
 * Removes all states that were changed by the setUp method. Thus
 * you might close a DB that you needed to read test data.
 */
protected void tearDown() {
}

public void testGetText()
{
	HelloWorldText helloText = new HelloWorldText();
	
	if(!helloText.getText().equals("Hello World!"))
	{
		fail("Wrong text!");
	}
}

}
