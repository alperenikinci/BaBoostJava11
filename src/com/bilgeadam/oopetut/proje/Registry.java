package com.bilgeadam.oopetut.proje;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Registry {

	private List<Person> people;

	public Registry() {
		people = new ArrayList<>();

	}

	public void addPerson(Person person) {
		people.add(person);
	}

	public List<Person> getPeople() {
		return people;
	}

	public List<Student> getStudents() {
		return people.stream().filter(person -> person instanceof Student).map(person -> (Student) person)
				.collect(Collectors.toList());
	}

	public List<Teacher> getTeachers() {
		return people.stream().filter(person -> person instanceof Teacher).map(person -> (Teacher) person)
				.collect(Collectors.toList());
	}

}
