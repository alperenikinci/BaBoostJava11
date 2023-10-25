package com.bilgeadam.week10.lecture005.openclosed;

public class Facebook extends SosyalMedya {

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

}
