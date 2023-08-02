package com.bilgeadam.week5.lecture003;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.isim = "Alperen";
		student1.kayit();
		Student student2 = new Student();
		student2.isim = "Ugur";
		student2.kayit();
		Student student3 = new Student();
		student3.isim = "Sedat";
		student3.kayit();

		System.out.println(student1.isim);
		System.out.println(student1.numara);
		System.out.println(student2.numara);
		System.out.println(student3.numara);

	}

}
