package com.bilgeadam.week10.lecture002;

import java.io.Serializable;

public class Ogrenci implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9144385977764378679L;

	private String isim;
	private int yas;

	public Ogrenci(String isim, int yas) {
		super();
		this.isim = isim;
		this.yas = yas;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", yas=" + yas + "]";
	}

}
