package com.bilgeadam.week10.lecture002;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOrnek {

	public static void main(String[] args) {
		// C:\Users\busin\Desktop\BoostJava11\Eclipse Workspace

		// String kelime = "C:\\Users\\busin\\Desktop\\BoostJava11\\Eclipse Workspace";

		// Output ->> Yazma islemi
		// Input ->> Okuma islemi

		try {
			FileOutputStream fos = new FileOutputStream(
					"C:/Users/busin/Desktop/BoostJava11/Eclipse Workspace/BilgeAdamBoostJava11/deneme2.txt");
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\busin\\Desktop\\BoostJava11\\Eclipse Workspace\\BilgeAdamBoostJava11\\deneme2.txt");
//			byte[] array = { 101, 80, 88 };
			String kelime = "Merhaba Dunya!";

			try {
//				fos.write(65);
//				fos.write(array);
				fos.write(kelime.getBytes());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println(fis.read());
				int deger;
				while ((deger = fis.read()) != -1) {
					System.out.println((char) deger);
				}

				// M
				// deger = 77;
				// e
				// r

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
