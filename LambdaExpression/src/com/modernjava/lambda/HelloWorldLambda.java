package com.modernjava.lambda;

public class HelloWorldLambda {

	public static void main(String[] args) {
		HelloWorldInterface lambdaFunction = () -> {
			System.out.println("Hello World Lambda Example");
		};
		lambdaFunction.sayHelloWorld();

	}

}
