package org.arifchughtai.training.examples.maven.parent.helloworld;

/**
 * @author Arif Chughtai
 *
 * Client of the HelloWorldText class.
 */
public class HelloWorldApp {

	public static void main(String[] args) {

		HelloWorldText helloString = new HelloWorldText();
		System.out.println(helloString.getText());

	}
}