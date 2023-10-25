package com.bilgeadam.week10.lecture005.liskovsubstitution;

import com.bilgeadam.week10.lecture005.Utility.Bildirim;
import com.bilgeadam.week10.lecture005.Utility.Kullanici;

/*
 * 
 * liskov substitution ->> Bir sinif inherit edildigi sinif gibi davranmalidir.
 * 
 * 1- Bizim Email ve SMS gonder metotlarimiz vardi. Sonra Facebook bir gun cikti ve dedi ki;
 * "SMS Gonderme islemini desteklemeyi birakiyoruz."
 * buradaki sorun nedir? Nasil cozeriz?
 * 
 * 
 * 2-
 * WhatsApp -> video konferans yapabiliyor, sohbet edilebilir,resim paylasilabilir, hikaye paylasilabilir.
 * facebook -> post atabilir, resim paylasabilir,sohbet edilebilir,hikaye paylasilabilir.
 * instagram -> post atabilir, resim paylasabilir,sohbet edilebilir,hikaye paylasilabilir.
 * 
 * sosyalmedya sinifinda bu metotlari abstract olarak yazmistik. ama simdi yine bir ayristirma ihtiyaci bulunmakta. 
 * Bu durumu nasil yonetebiliriz?
 * 
 */

public class Instagram extends SosyalMedya implements IEmailSendable, ISmsSendable, IPostable {

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
