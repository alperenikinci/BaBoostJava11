package com.bilgeadam.week10.lecture003;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 
 * 1- Ogrenci sinifinda 2 adet field; isim, notlar; getter/setter ... 
 * Sonrasinda 2 tane constructor olusturalim. Biri sadece isim. Digeri isim ve notlar alsin.
 * 1.1- Dosyamizi okuyalim, dosyadan okudugumuz verilere gore once 
 * sadece isim olan constructor'i kullanarak ogrenciler listesi olusturalim. Sonra da bu listeyi yazdiralim.
 * 
 * 2- ogrenci listesinden bir serialization islemi yaparak ogrencileri bir dosyaya yazalim. //ODEV
 * 3- serilestirip yazdigimiz dosyadan gelen ogrenci verilerini okuyup konsola yazdiralim. //ODEV
 * 
 * 
 */

public class Manager {

	File file = new File("C:/Users/busin/Desktop/BoostJava11/Eclipse Workspace/BilgeAdamBoostJava11/ogrenci.txt");
	List<Ogrenci> ogrenciler = new ArrayList<>();

	public static void main(String[] args) {

		Manager manager = new Manager();
		manager.dosyadanVeriOkuma2();
		manager.dosyayaOgrenciYaz();
		manager.dosyadanOgrenciOku();
//		manager.dosyayaOgrenciYaz2();
//		manager.dosyadanOgrenciOku2();
	}

	public void dosyadanVeriOkuma() {

		// String isim = "";
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String deger = "";

			while ((deger = bufferedReader.readLine()) != null) {
//				isim += deger + "\n";
				Ogrenci ogrenci = new Ogrenci(deger.substring(0, deger.indexOf(",")));
				ogrenciler.add(ogrenci);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		ogrenciler.stream().forEach(ogrenci -> System.out.println(ogrenci));
//		ogrenciler.forEach(System.out::println);
	}

	public void dosyadanVeriOkuma2() {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String deger = "";
			while ((deger = bufferedReader.readLine()) != null) {
				String[] array = deger.split(","); // {Mustafa,87,76,60}
				double ortalama = ortHesapla2(Arrays.asList(array));
				Ogrenci ogrenci = new Ogrenci(array[0], ortalama);
				ogrenciler.add(ogrenci);

//				for (String string : array) {
//					System.out.print(string + ",");
//				}
//				System.out.println();	
			}
			ogrenciler.stream().forEach(x -> System.out.println(x));

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private double ortHesapla(List<String> asList) {
		double toplam = 0;
		for (int i = 1; i < asList.size(); i++) {
			toplam = toplam + Double.parseDouble(asList.get(i));
		}
		return toplam / (asList.size() - 1);
	}

	private double ortHesapla2(List<String> asList) {
		return asList.subList(1, asList.size()).stream()
				.collect(Collectors.averagingDouble(x -> Double.parseDouble(x)));
	}

	private void dosyayaOgrenciYaz() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
					"C:/Users/busin/Desktop/BoostJava11/Eclipse Workspace/BilgeAdamBoostJava11/ogrenciseri.txt"));
			ogrenciler.forEach((ogrenci) -> {
				try {
					oos.writeObject(ogrenci);
					System.out.println(ogrenci.getName() + " isimli ogrenci ogrenciseri.txt'ye kaydedildi...");
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void dosyayaOgrenciYaz2() {
		File file = new File(
				"C:/Users/busin/Desktop/BoostJava11/Eclipse Workspace/BilgeAdamBoostJava11/ogrenciseri.txt");
//		file.createNewFile();
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			try {
				oos.writeObject(ogrenciler);
				System.out.println("Ogrenciler " + file.getName() + " dosyasina kaydedildi. " + file.getAbsolutePath());
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void dosyadanOgrenciOku() {
		File file = new File(
				"C:/Users/busin/Desktop/BoostJava11/Eclipse Workspace/BilgeAdamBoostJava11/ogrenciseri.txt");
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			Ogrenci ogrenci;

			while ((ogrenci = (Ogrenci) ois.readObject()) != null) {
				System.out.println(ogrenci);
			}

		} catch (Exception e) {
			System.out.println("Dosya sonuna ulasildi...");
		}
	}

	private void dosyadanOgrenciOku2() {
		File file = new File(
				"C:/Users/busin/Desktop/BoostJava11/Eclipse Workspace/BilgeAdamBoostJava11/ogrenciseri.txt");
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			List<Ogrenci> ogrencilerOis = (List<Ogrenci>) ois.readObject();
			ogrencilerOis.forEach(ogrenci -> System.out.println(ogrenci));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
