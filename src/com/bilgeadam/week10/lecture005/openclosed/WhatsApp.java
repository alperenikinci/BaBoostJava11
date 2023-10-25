package com.bilgeadam.week10.lecture005.openclosed;

public class WhatsApp extends SosyalMedya {

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

}
