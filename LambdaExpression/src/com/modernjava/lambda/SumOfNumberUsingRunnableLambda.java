package com.modernjava.lambda;

import java.util.concurrent.ExecutionException;
import java.util.stream.IntStream;

public class SumOfNumberUsingRunnableLambda {

	public static int[] array = IntStream.range(0, 5000).toArray();
	public static int total = IntStream.range(0, 5000).sum();
	public static int sum = 0;

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Runnable runnable1 = () -> {
			// int sum = 0;
			for (int index = 0; index < array.length / 2; index++) {
				// sum = sum + array[index];
				add(array[index]);
			}
			// add(sum);
		};

		Runnable runnable2 = () -> {
			// int sum = 0;
			for (int index = array.length / 2; index < array.length; index++) {
				// sum = sum + array[index];
				add(array[index]);
			}
			// add(sum);
		};

		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.out.println("Sum from the runnable is:" + sum);
		System.out.println("Sum from the IntStream is " + total);

	}

	public synchronized static void add(int toAdd) {
		sum = sum + toAdd;
	}

}
