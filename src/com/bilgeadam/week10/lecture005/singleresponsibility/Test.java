package com.bilgeadam.week10.lecture005.singleresponsibility;

import com.bilgeadam.week10.lecture005.Utility.Kullanici;

public class Test {

	public static void main(String[] args) {
		Facebook facebook = new Facebook();
		Instagram instagram = new Instagram();
		Kullanici kullanici = new Kullanici("Alperen", "alperen@gmail.com");

		facebook.emailGonder(kullanici);
		instagram.emailGonder(kullanici);
	}

}
