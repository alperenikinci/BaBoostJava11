package com.bilgeadam.week09.lecture005;

// extends Exception =>>> checked
// extends RunTimeException =>>> unchecked 
public class NullKontrolException extends Exception {

	String mesaj;

	public NullKontrolException(String mesaj) {
		super();
		this.mesaj = mesaj;
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

	@Override
	public String toString() {
		return "NullKontrolException [mesaj=" + mesaj + "]";
	}

}
