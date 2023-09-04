package com.bilgeadam.week10.lecture001;

public class Liman {

	private Yuk[] yukler;
//	private String isim;

	public Liman() {
		super();
		this.yukler = new Yuk[10];
	}

//	public Liman(String isim) {
//		this();
//		this.isim = isim;
//	}

	public Yuk[] getYukler() {
		return yukler;
	}

	public void setYukler(Yuk[] yukler) {
		this.yukler = yukler;
	}

}
