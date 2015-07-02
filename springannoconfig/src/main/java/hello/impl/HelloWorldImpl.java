package hello.impl;

import helloI.*;

public class HelloWorldImpl implements HelloWorld {

	
	public void printHelloWorld(String msg) {

		System.out.println("Hello : " + msg);
	}

}