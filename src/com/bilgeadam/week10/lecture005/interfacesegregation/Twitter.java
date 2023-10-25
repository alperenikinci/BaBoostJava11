package com.bilgeadam.week10.lecture005.interfacesegregation;

import com.bilgeadam.week10.lecture005.Utility.Kullanici;

public class Twitter extends SosyalMedya implements IEmailSendable, ISmsSendable, IPostable, ISocialMedia {

	@Override
	public void boyutlandirma(String type) {
		// TODO Auto-generated method stub
	}

	@Override
	public void resimPaylas() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sohbetEt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void postGonder() {
		// TODO Auto-generated method stub

	}

	@Override
	public void smsGonder(Kullanici kullanici) {
		// TODO Auto-generated method stub

	}

	@Override
	public void emailGonder(Kullanici kullanici) {
		// TODO Auto-generated method stub

	}

}
