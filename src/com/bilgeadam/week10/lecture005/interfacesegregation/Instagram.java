package com.bilgeadam.week10.lecture005.interfacesegregation;

import com.bilgeadam.week10.lecture005.Utility.Bildirim;
import com.bilgeadam.week10.lecture005.Utility.Kullanici;

/*
 * 
 * interface segregation ->>> Sorumluluklarin hepsini tek bir interface'e yuklememeliyiz. (Interfaceleri ayristirma sanati)
 * 
 * 
 * twitter ekleyelim, sosyal medya interface'ini kullansin. Ama twitterda hikaye ozelligi bulunmamakta.
 * Bu durumu nasil yonetebiliriz?
 * 
 */
public class Instagram extends SosyalMedya implements IEmailSendable, ISmsSendable, IPostable, ISocialMedia, IStory {

	@Override
	public void boyutlandirma(String type) {
		if (type.equals("jpg")) {
			setKucultmeKatsayisi(38);
		} else if (type.equals("png")) {
			setKucultmeKatsayisi(30);
		} else {
			setKucultmeKatsayisi(40);
		}

	}

	@Override
	public void postGonder() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sohbetEt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resimPaylas() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hikayePaylas() {
		// TODO Auto-generated method stub

	}

	@Override
	public void smsGonder(Kullanici kullanici) {
		if (kullanici.getPhone() != null) {
			Bildirim.smsGonder(kullanici.getPhone());
		}
	}

	@Override
	public void emailGonder(Kullanici kullanici) {
		if (kullanici.getEmail() != null) {
			Bildirim.emailGonder(kullanici.getEmail());
		}
	}

}
