package com.bilgeadam.week10.lecture002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileIslemler {
	/*
	 * 
	 * 0- Cikis 1- Dosya Yarat 2- Ekle 3- Okuma 4- Harf Degistir 5- Dosya silme
	 * Lutfen islem seciniz :
	 * 
	 * 
	 * 1- FileSabitler sinifinda static bir file yaratalim. Bu file'i butun
	 * metotlarimizda kullanacagiz.
	 * 
	 * 2- Dosya yaratmak icin bir metot yazalim. Eğer dosyamiz dizinde yoksa bu
	 * dosyayi yaratsin, eger dizinde bu dosya var ise
	 * "Bu dosya daha once yaratilmistir" gibi bir cikti versin.
	 * 
	 * 3- Dosyamiza disaridan aldigimiz bir veriyi ekleyelim. (Scanner ile aldigimiz
	 * veriyi) ve her ekleme yapildiktan sonra bir sonraki ekleme icin alt satira
	 * gecis yapilsin.
	 * 
	 * 4- Dosyadan veri okumak icin bir metot yazalim.
	 * 
	 * 5- HarfDegistir metodunu yazalim. Bu metot bir string parametre alsin,
	 * icerisindeki harfi istenilen harf ile degistirip dosyaya kaydetsin.
	 * 
	 * 6- Dosya silmek icin bir metot yazalim.
	 */

	public static void main(String[] args) {
		FileIslemler fileIslemler = new FileIslemler();
		fileIslemler.dosyaYarat();
//		fileIslemler.dosyayaVeriEkle("Merhaba Dunya!");
//		String tumMetin = fileIslemler.dosyadanVeriOkuma();
//		fileIslemler.harfDegistir(tumMetin);
//		fileIslemler.dosyadanVeriOkuma();
//		fileIslemler.dosyaSil(FileSabitler.file);
		fileIslemler.dosyaSil2(FileSabitler.path);
//		fileIslemler.dosyaYarat();

	}

	public void dosyaYarat() {
		try {
			if (!FileSabitler.file.exists()) {
				FileSabitler.file.createNewFile();
				System.out.println(FileSabitler.file.getName() + " basariyla olusturulmustur.");
			} else {
				System.out.println(FileSabitler.file.getAbsolutePath() + " Dosya daha once yaratilmistir.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void dosyaYarat2() {
		try {
			if (FileSabitler.file.createNewFile()) {
				System.out.println(FileSabitler.file.getName() + " basariyla olusturulmustur.");
			} else {
				System.out.println(FileSabitler.file.getAbsolutePath() + " Dosya daha once yaratilmistir.");
			}

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public void dosyayaVeriEkle(String metin) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Metin dosyaya eklenerek mi yazilsin? (E/H) : ");
		boolean kontrol = false;
		if (scanner.nextLine().equalsIgnoreCase("e")) {
			kontrol = true;
		}
		try {
			FileWriter fileWriter = new FileWriter(FileSabitler.file, kontrol);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(metin + "\n");
			bufferedWriter.flush();

			System.out.println("Veri eklendi ->>" + FileSabitler.file.getName());

			// @Override -> EZMEK onceki dosyayi ezip, yerine yeni bir dosya olusturmak. ->>
			// Dosyayi override etmek.

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String dosyadanVeriOkuma() {
		String tumMetin = "";
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(FileSabitler.file));
			String deger = "";
			while ((deger = bufferedReader.readLine()) != null) {
				tumMetin += deger + "\n";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(tumMetin);
		return tumMetin;
	}

	public void harfDegistir(String metin) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen degistirmek istediginiz harfi giriniz : ");
		char eskiHarf = scanner.nextLine().charAt(0);
		System.out.print("Lutfen yeni harfi giriniz : ");
		char yeniHarf = scanner.nextLine().charAt(0);
		metin = metin.replace(eskiHarf, yeniHarf);
		dosyayaVeriEkle(metin);
	}

	public void dosyaSil(File file) {

		if (file.exists()) {
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			file.delete();
			System.out.println(file.getName() + " isimli dosya silindi...");
		} else {
			System.out.println("Boyle bir dosya bulunmamaktadir.");
		}

	}

	public void dosyaSil2(Path path) {
		try {
			if (Files.deleteIfExists(path)) {
				System.out.println("Dosyaniz siliniyor...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Boyle bir dosya bulunamadi...");
			}
		} catch (IOException e) {

		}
	}
}
