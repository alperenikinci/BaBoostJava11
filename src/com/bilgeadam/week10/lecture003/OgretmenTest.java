package com.bilgeadam.week10.lecture003;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class OgretmenTest {

	public static void main(String[] args) {
		File file = new File("C:/Users/busin/Desktop/BoostJava11/Eclipse Workspace/BilgeAdamBoostJava11/ogrenci.txt");
		BufferedReader bufferedReader;

		try {
			bufferedReader = new BufferedReader(new FileReader(file));
			Ogretmen ogretmen1 = new Ogretmen("Alperen", bufferedReader);
			Ogretmen ogretmen2 = new Ogretmen("Muhammet", bufferedReader);
			ogretmen1.start();
			ogretmen2.start();

			try {
				ogretmen1.join();
				ogretmen2.join();
			} catch (Exception e) {
				e.printStackTrace();
			}

//			try { =>> Ugurcan'in hatirasi....
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(ogretmen1.ogrenciler.size());
			System.out.println(ogretmen2.ogrenciler.size());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
