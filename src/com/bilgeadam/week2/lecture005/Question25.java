package com.bilgeadam.week2.lecture005;

public class Question25 {

	public static void main(String[] args) {
		String value = " Merhaba Dünya ";
		String value2 = "Merhaba Dünya";
		String value3 = "Merhaba Dünya";

		System.out.println(value.charAt(2));
		System.out.println(value.trim());
		System.out.println(value.length());
		System.out.println(value.indexOf("a"));
		System.out.println(value.lastIndexOf("a"));
		System.out.println(value.substring(5));
		System.out.println(value.substring(0, 5));
		System.out.println(value.equals(value2));//
		System.out.println(value == " Merhaba Dünya ");
		System.out.println(value.trim() == value2); // " == " referans değerine bakarak karşılaştırır.
		System.out.println("##########");
		System.out.println(value.trim().equals(value2));
		System.out.println(value2 == value3);

	}
}