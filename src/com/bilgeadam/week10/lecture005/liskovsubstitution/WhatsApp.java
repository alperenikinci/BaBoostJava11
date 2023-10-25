package com.bilgeadam.week10.lecture005.liskovsubstitution;

import com.bilgeadam.week10.lecture005.Utility.Bildirim;
import com.bilgeadam.week10.lecture005.Utility.Kullanici;

public class WhatsApp extends SosyalMedya implements IEmailSendable, ISmsSendable, IVideoCallable {

	@Override
	public void boyutlandirma(String type) {
		if (type.equals("jpg")) {
			setKucultmeKatsayisi(28);
		} else if (type.equals("png")) {
			setKucultmeKatsayisi(32);
		} else {
			setKucultmeKatsayisi(36);
		}

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
	public void videoKonferansYap() {
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
