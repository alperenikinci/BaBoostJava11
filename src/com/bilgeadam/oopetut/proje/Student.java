package com.bilgeadam.oopetut.proje;

public class Student extends Person implements IDerseGirebilir {
	private String department;
	private int studentNumber;

	public Student(String name, int age, String department, int studentNumber) {
		super(name, age);
		this.department = department;
		this.studentNumber = studentNumber;

	}

	public void sayHi() {
		System.out.println("Hi!");
	}

	@Override
	public void derseGir() {
		System.out.println("Ogrenci dersi dinliyor.");
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	@Override
	public String toString() {
		return "Student [department=" + department + ", studentNumber=" + studentNumber + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + "]";
	}

}
