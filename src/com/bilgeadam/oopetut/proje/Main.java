package com.bilgeadam.oopetut.proje;

public class Main {

	public static void main(String[] args) {

		Registry registry = new Registry();

		Student student1 = new Student("Alperen", 27, "Yazilim", 12345);
		Student student2 = new Student("Ahmet", 22, "Insaat", 34561);
		Teacher teacher1 = new Teacher("Muhammet", 50, "Yazilim", "Professor");
		Teacher teacher2 = new Teacher("Ibrahim", 45, "Insaat", "Asst.Professor");

		registry.addPerson(student1);
		registry.addPerson(student2);
		registry.addPerson(teacher1);
		registry.addPerson(teacher2);

		registry.getPeople().forEach(System.out::println);
		System.out.println();
		registry.getStudents().forEach(System.out::println);
		System.out.println();
		registry.getTeachers().forEach(System.out::println);
		System.out.println("####");
		ogrencileriBolumeGoreFiltrele(registry, "insaat");
		ogretmenleriBolumeGoreFiltrele(registry, "insaat");
	}

	public static void ogrencileriBolumeGoreFiltrele(Registry registry, String bolum) {
		registry.getStudents().stream().filter(x -> x.getDepartment().equalsIgnoreCase(bolum))
				.forEach(x -> System.out.println(x.getName() + " " + x.getDepartment()));
	}

	public static void ogretmenleriBolumeGoreFiltrele(Registry registry, String bolum) {
		registry.getTeachers().stream().filter(x -> x.getDepartment().equalsIgnoreCase(bolum))
				.forEach(x -> System.out.println(x.getName() + " " + x.getDepartment()));
	}

}
