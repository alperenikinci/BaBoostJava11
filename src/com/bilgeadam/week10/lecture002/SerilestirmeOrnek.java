package com.bilgeadam.week10.lecture002;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerilestirmeOrnek {

	public static void main(String[] args) {

		Ogrenci ogrenci = new Ogrenci("Alperen", 27);
		Ogrenci ogrenci3 = new Ogrenci("Muhammet", 50);
		Ogrenci ogrenci5 = new Ogrenci("Furkan", 30);
		List<Ogrenci> ogrenciList = new ArrayList<>();

		ObjectOutputStream oos = null;

		// Serialization islemi
		try {
			FileOutputStream fos = new FileOutputStream(
					"C:/Users/busin/Desktop/BoostJava11/Eclipse Workspace/BilgeAdamBoostJava11/seri.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(ogrenci);
			oos.writeObject(ogrenci3);
			oos.writeObject(ogrenci5);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// DeSerialization islemi
		try {
			FileInputStream fis = new FileInputStream(
					"C:/Users/busin/Desktop/BoostJava11/Eclipse Workspace/BilgeAdamBoostJava11/seri.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			try {
//				Ogrenci ogrenci2 = (Ogrenci) ois.readObject();
//				Ogrenci ogrenci4 = (Ogrenci) ois.readObject();
//				Ogrenci ogrenci6 = (Ogrenci) ois.readObject();
//				System.out.println(ogrenci2);
//				System.out.println(ogrenci4);
//				System.out.println(ogrenci6);

				System.out.println((Ogrenci) ois.readObject());
				System.out.println((Ogrenci) ois.readObject());
				System.out.println((Ogrenci) ois.readObject());

//				for (int i = 0; i < 3; i++) {
//					Ogrenci ogrenci10 = (Ogrenci) ois.readObject();
//					if (ogrenci10.getYas() < 40) {
//						ogrenciList.add(ogrenci10);
//					}
//				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();

		}
		System.out.println(ogrenciList);

	}

}
