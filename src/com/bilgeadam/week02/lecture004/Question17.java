package com.bilgeadam.week02.lecture004;

import java.util.Scanner;

public class Question17 {

	/*
	 * telefon kodu ve e-mail kodu tanımlayacağız. Kullanıcıdan e-mail ve telefon
	 * kodu girmesini isteyeceğiz.
	 * 
	 * girilen e-mail kodu hatalı ise ; "Girdiğiniz e-mail kodu hatalıdır". girilen
	 * sms kodu hatalı ise; "Girdiğiniz sms kodu hatalıdır".
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int smsCode = 444;
		int smsInput;
		int emailCode = 555;
		int emailInput;

		System.out.print("Lutfen sms kodunuzu giriniz : ");
		smsInput = scanner.nextInt();
		System.out.print("Lutfen email kodunuzu giriniz : ");
		emailInput = scanner.nextInt();

		if (smsCode != smsInput) {
			System.out.println("Sms kodunuz yanlış! ");
		}
		if (emailCode != emailInput) {
			System.out.println("Email kodunuz yanlış");
		}
		if (smsCode == smsInput && emailCode == emailInput) {
			System.out.println("Başarıyla giriş yaptınız!");
		}
		scanner.close();
	}

}
