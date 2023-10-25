package com.bilgeadam.oopetut.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Ogrenci> ogrenciler = new ArrayList<>();

		ogrenciler.add(new Ogrenci("Ahmet", 25, "Bilgisayar Muhendisligi", List.of(90, 85, 100)));
		ogrenciler.add(new Ogrenci("Ayse", 20, "Elektrik Muhendisligi", List.of(60, 70, 95)));
		ogrenciler.add(new Ogrenci("Ali", 18, "Bilgisayar Muhendisligi", List.of(83, 71, 97)));
		ogrenciler.add(new Ogrenci("Fatma", 23, "Makine Muhendisligi", List.of(71, 77, 91)));

		// Dosya yolu
		String dosyaYolu = "C:\\Users\\busin\\Desktop\\BoostJava11"
				+ "\\Eclipse Workspace\\BilgeAdamBoostJava11\\src\\com\\bilgeadam\\oopetut\\fileio\\ogrenci.txt";

		// Ogrenci nesnelerini bir dosyaya yazalım
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dosyaYolu));
			oos.writeObject(ogrenciler);
			System.out.println("Ogrenciler dosyaya yazildi.\n" + dosyaYolu);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Ogrenci nesnelerini dosyadan okuyalım
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dosyaYolu));
			List<Ogrenci> dosyadanOkunanOgrenciler = (List<Ogrenci>) ois.readObject();
			System.out.println("\nOgrenciler dosyadan okunup bir listeye alındı.\n" + dosyaYolu + "\n");

			dosyadanOkunanOgrenciler.forEach(System.out::println);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
