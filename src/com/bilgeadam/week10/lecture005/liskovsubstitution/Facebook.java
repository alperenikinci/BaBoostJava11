package com.bilgeadam.week10.lecture005.liskovsubstitution;

import com.bilgeadam.week10.lecture005.Utility.Bildirim;
import com.bilgeadam.week10.lecture005.Utility.Kullanici;

public class Facebook extends SosyalMedya implements IEmailSendable, IPostable {

	@Override
	public void boyutlandirma(String type) {
		if (type.equals("jpg")) {
			setKucultmeKatsayisi(34);
		} else if (type.equals("png")) {
			setKucultmeKatsayisi(37);
		} else {
			setKucultmeKatsayisi(45);
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
	public void emailGonder(Kullanici kullanici) {
		if (kullanici.getEmail() != null) {
			Bildirim.emailGonder(kullanici.getEmail());
		}
	}

}
