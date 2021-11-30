package com.modernjava.streams;

import java.util.Arrays;
import java.util.List;

public class Instructors {

	public static List<Instructor> getAll() {

		Instructor instructor1 = new Instructor("Mike", 10, "software developer", "M", true,
				Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));

		Instructor instructor2 = new Instructor("Jenny", 5, "software developer", "F", false,
				Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));

		Instructor instructor3 = new Instructor("Gene", 6, "software developer", "M", false,
				Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));

		Instructor instructor4 = new Instructor("Anthony", 15, "software developer", "M", true,
				Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));

		Instructor instructor5 = new Instructor("Syed", 15, "software developer", "M", true,
				Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));

		List<Instructor> list = Arrays.asList(instructor1, instructor2, instructor3, instructor4, instructor5);
		return list;
	}

}
