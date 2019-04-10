package com.popiang;

public class Greeter {

	public static void main(String[] args) {
		
//		Greeting greeting = new HelloWorldGreeting();
//		greeting.greet();
		
		Greeting lambdaGreeting = () -> System.out.println("Hello World Lambda!!");

		lambdaGreeting.greet();
		
	}

}
