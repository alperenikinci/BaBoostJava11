package com.bilgeadam.week3.lecture005;

import java.util.Scanner;

//Bir metot olsun, metodun içine 2 tane sayı alalım. Bu sayıları çarpıp çarpım değerini döndürelim.
//main metodumda bir sayı değeri olacak sayi=15, bir de sonuc değeri olacak sonuc=0; aşağıda oluşturduğum metotlardan dönen değerleri     //sonuc = sayi/"metot" işleminde kullanmak istiyorum.
//yeni bir carpim metodu oluşturalım, iki adet sayıyı dışarıdan alan bir metot oluşturalım. Bu metot 2 sayıyı geri dönsün. 
//Sonra yeni oluşturduğumuz çarpım metodunda iki adet sayı alan metodumuzu kullanarak aynı işlemleri gerçekleştirelim.

public class Question44 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int result = multiplyTwoNumbers();
		System.out.println("Result = " + result);

		int result2 = multiplyTwoNumbers(15, 10);
		System.out.println("Result = " + result2);

		int number = 15;
		double result3 = 0;
		int total = 0;
		total = multiplyTwoNumbers();
		if (total == 0) {
			System.out.println(number + "/" + total + " işleminin sonucu tanımsızdır.");
		} else {
			result3 = (double) number / total;
			System.out.println(number + "/" + total + " = " + result3);
		}

		if (multiplyTwoNumbers(1, 15) == 0) {
			System.out.println(number + "/" + multiplyTwoNumbers(1, 15) + " işleminin sonucu tanımsızdır.");
		} else {
			result3 = (double) number / multiplyTwoNumbers(1, 15);
			System.out.println(number + "/" + multiplyTwoNumbers(1, 15) + " = " + result3);
		}

		total = multiplyTwoNumbers2(getTwoNumbers());

		if (total == 0) {
			System.out.println(number + "/" + total + " işleminin sonucu tanımsızdır.");
		} else {
			result3 = (double) number / total;
			System.out.println(number + "/" + multiplyTwoNumbers(1, 15) + " = " + result3);
		}
		System.out.println(15 / 0);

	}

//	public static ... bolmeKontrol(){
//		
//	}

	public static int[] getTwoNumbers() {
		int[] numberArray = new int[2];

		System.out.print("Please enter the 1st number : ");
		numberArray[0] = scanner.nextInt();
		System.out.print("Please enter the 2nd number : ");
		numberArray[1] = scanner.nextInt();

		return numberArray;

	}

	public static int multiplyTwoNumbers2(int[] numbers) {
		return numbers[0] * numbers[1];
	}

	public static int multiplyTwoNumbers() {
		System.out.print("Please enter the 1st number : ");
		int number1 = scanner.nextInt();
		System.out.print("Please enter the 2nd number : ");
		int number2 = scanner.nextInt();
		return number1 * number2;
	}

	public static int multiplyTwoNumbers(int num1, int num2) {
		return num1 * num2;
	}

}
