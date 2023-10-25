package com.bilgeadam.week10.lecture005.singleresponsibility;

import com.bilgeadam.week10.lecture005.Utility.Bildirim;
import com.bilgeadam.week10.lecture005.Utility.Kullanici;

public class SosyalMedya {

	public void emailGonder(Kullanici kullanici) {
		if (kullanici.getEmail() != null) {
			Bildirim.emailGonder(kullanici.getEmail());
		}
	}

	public void smsGonder(Kullanici kullanici) {
		if (kullanici.getPhone() != null) {
			Bildirim.smsGonder(kullanici.getPhone());
		}
	}

}
