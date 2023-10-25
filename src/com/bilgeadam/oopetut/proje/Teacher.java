package com.bilgeadam.oopetut.proje;

public class Teacher extends Person implements IDerseGirebilir {
	private String department;
	private String title;

	public Teacher(String name, int age, String department, String title) {
		super(name, age);
		this.department = department;
		this.title = title;
	}

	@Override
	public void derseGir() {
		System.out.println("Ogretmen dersi anlatiyor...");
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Teacher [department=" + department + ", title=" + title + "]";
	}

}
