package com.modernjava.streams;

import java.util.List;

public class Instructor {

	private String name;
	private int yearsOfExperience;
	private String title;
	private String gender;
	private boolean onlineCourses;
	private List<String> courses;

	public Instructor(String name, int yearOfExpirence, String title, String gender, boolean onlineCourses,
			List<String> courses) {
		super();
		this.name = name;
		this.yearsOfExperience = yearOfExpirence;
		this.title = title;
		this.gender = gender;
		this.onlineCourses = onlineCourses;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearOfExpirence) {
		this.yearsOfExperience = yearOfExpirence;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isOnlineCourses() {
		return onlineCourses;
	}

	public void setOnlineCourses(boolean onlineCourses) {
		this.onlineCourses = onlineCourses;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", yearsOfExperience=" + yearsOfExperience + ", title=" + title
				+ ", gender=" + gender + ", onlineCourses=" + onlineCourses + ", courses=" + courses + "]";
	}

}
