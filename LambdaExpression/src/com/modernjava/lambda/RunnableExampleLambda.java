package com.modernjava.lambda;

public class RunnableExampleLambda {
	public static void main(String[] args) {

		Runnable runnable = () -> {
			System.out.println("Thread Running");
			System.out.println("Thread Running Sleep");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread Running Again");
		};

		Thread thread = new Thread(runnable);
		Thread thread2 = new Thread(() -> {
			System.out.println("Thread2 Running");
			System.out.println("Thread2 Running Sleep");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread2 Running Again");
		});
		thread.start();
		thread2.start();

		System.out.println("Thread Start Called");
	}
}
