package com.bilgeadam.week10.lecture002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOrnek2 {

	public static void main(String[] args) {
		// Buffer, Buffering...

		String path = "C:/Users/busin/Desktop/BoostJava11/Eclipse Workspace/BilgeAdamBoostJava11/deneme3.txt";
		File file = new File(path);
		try {
//			file.createNewFile();
//			FileWriter FileWriter = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, false));
			BufferedReader reader = new BufferedReader(new FileReader(file));

			writer.write("satir1\n");
			writer.write("satir2\n");
			writer.flush();

//			String deger1 = reader.readLine();
//			System.out.println(deger1);
//			String deger2 = reader.readLine();
//			System.out.println(deger2);
//			String deger3 = reader.readLine();
//			System.out.println(deger3);

			String deger;
			while ((deger = reader.readLine()) != null) {
				System.out.println(deger);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
