package org.arifchughtai.training.examples.maven.parent.helloworld;

/**
 * @author Arif Chughtai
 * 
 * Simple hello world. 
 */
public class HelloWorldText {

	/**
	 * Attribute <code>text</code> holds current hello world string.
	 */
	private String text;
	
	public HelloWorldText() {
		// text = "Hello Moon!";
		text = "Hello World!";
	}

	/**
	 * Delivers current hello world string.	 * 
	 * @return Current hello world string.
	 */
	public String getText() {
		return text;
		//return null;
	}	
}