package com.bilgeadam.week10.lecture005.singleresponsibility;

import com.bilgeadam.week10.lecture005.Utility.Bildirim;
import com.bilgeadam.week10.lecture005.Utility.Kullanici;

public class Instagram extends SosyalMedya {

	/*
	 * 
	 * bildirimGonder metodu kullanicinin bir emaili var ise email, telefonu var ise
	 * sms, ikisi de var ise hem email hem sms gondersin.
	 * 
	 */

	// Bu yapi single responsibility'e uygun degil. Email ve Sms bildirimleri ayri
	// birer bildirim. Bunlarin kendilerine ozgun metotlari olmasi gerekiyor. Bu
	// yuzden bildirimGonder metodu icerisindeki 2 islevi 2 ayri metot olarak
	// yazmaliyiz.
	public void bildirimGonder(Kullanici kullanici) {
		if (kullanici.getEmail() != null) {
			Bildirim.emailGonder(kullanici.getEmail());
		}

		if (kullanici.getPhone() != null) {
			Bildirim.smsGonder(kullanici.getPhone());
		}
	}

	// Iki ayri metoda ayirarak single responsibility prensibini gerceklestirdik.
//	public void emailGonder(Kullanici kullanici) {
//		if (kullanici.getEmail() != null) {
//			Bildirim.emailGonder(kullanici.getEmail());
//		}
//	}
//
//	public void smsGonder(Kullanici kullanici) {
//		if (kullanici.getPhone() != null) {
//			Bildirim.smsGonder(kullanici.getPhone());
//		}
//	}

}
