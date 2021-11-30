package com.modernjava.streams;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class DoubleStreamExample {

	public static void main(String[] args) {
		DoubleStream numbers = DoubleStream.of(1, 2, 3, 4, 5);
		numbers.forEach(System.out::println);

		System.out.println("-------------------------");
		numbers = DoubleStream.iterate(0, i -> i + 2).limit(5);
		numbers.forEach(System.out::println);

		System.out.println("-------------------------");
		numbers = DoubleStream.generate(new Random()::nextInt).limit(5);
		numbers.forEach(System.out::println);

		System.out.println("-------------------------");
		numbers = LongStream.range(1, 5).asDoubleStream();
		numbers.forEach(System.out::println);

		System.out.println("-------------------------");
		numbers = LongStream.rangeClosed(1, 5).asDoubleStream();
		numbers.forEach(System.out::println);

	}

}
