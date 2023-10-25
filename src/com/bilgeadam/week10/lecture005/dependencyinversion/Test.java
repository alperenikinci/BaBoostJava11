package com.bilgeadam.week10.lecture005.dependencyinversion;

import com.bilgeadam.week10.lecture005.Utility.Kullanici;

public class Test {

	public static void main(String[] args) {
		Facebook facebook = new Facebook();
		Instagram instagram = new Instagram();
		Kullanici kullanici = new Kullanici("Alperen", "alperen@gmail.com", "12345");
		ResimBoyutlandirma resimBoyutlandirma = new ResimBoyutlandirma();
		resimBoyutlandirma.boyutlandirma2(instagram, "png");
		resimBoyutlandirma.boyutlandirma2(facebook, "png");

		facebook.emailGonder(kullanici);
		instagram.smsGonder(kullanici);
		instagram.emailGonder(kullanici);
//		System.out.println("instagram ->>" + instagram.getKucultmeKatsayisi());
//		System.out.println("facebook->>" + facebook.getKucultmeKatsayisi());

		// Polymorphism

//		Instagram sosyalMedya1 = new Instagram();
//		Facebook sosyalMedya2 = new Facebook();
//		WhatsApp sosyalMedya3 = new WhatsApp();
//
//		resimBoyutlandirma.boyutlandirma3(sosyalMedya1, "jpg");
//		resimBoyutlandirma.boyutlandirma3(sosyalMedya2, "jpg");
//		resimBoyutlandirma.boyutlandirma3(sosyalMedya3, "jpg");
//
//		System.out.println("instagram ->>" + sosyalMedya1.getKucultmeKatsayisi());
//		System.out.println("facebook->>" + sosyalMedya2.getKucultmeKatsayisi());
//		System.out.println("whatsapp->>" + sosyalMedya3.getKucultmeKatsayisi());
	}

}
