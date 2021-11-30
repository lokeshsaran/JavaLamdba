package com.modernjava.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class SumOfNumberUsingCallableLambda {

	public static int[] array = IntStream.range(0, 5000).toArray();
	public static int total = IntStream.range(0, 5000).sum();

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Callable<Integer> callable1 = () -> {
			int sum = 0;
			for (int index = 0; index < array.length / 2; index++) {
				sum = sum + array[index];
			}
			return sum;
		};

		Callable<Integer> callable2 = () -> {
			int sum = 0;
			for (int index = array.length / 2; index < array.length; index++) {
				sum = sum + array[index];
			}
			return sum;
		};

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		List<Callable<Integer>> taskList = Arrays.asList(callable1, callable2);
		List<Future<Integer>> results = executorService.invokeAll(taskList);
		int i = 0;
		int sum = 0;
		for (Future<Integer> future : results) {
			sum = sum + future.get();
			System.out.println("Sum of " + ++i + " is: " + future.get());
		}
		System.out.println("Sum from the callable is:" + sum);
		System.out.println("Sum from the IntStream is " + total);
	}

}
