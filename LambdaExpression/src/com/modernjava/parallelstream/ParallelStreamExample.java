package com.modernjava.parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		System.out.println("Sum Sequential: " + sumSequentialStream());
		System.out.println(System.currentTimeMillis() - currentTimeMillis);
		currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		System.out.println("Sum Parallel: " + sumParallelStream());
		System.out.println(System.currentTimeMillis() - currentTimeMillis);
	}

	public static int sumSequentialStream() {
		return IntStream.rangeClosed(0, 500000000).sum();
	}

	public static int sumParallelStream() {
		return IntStream.rangeClosed(0, 500000000).parallel().sum();
	}

}
