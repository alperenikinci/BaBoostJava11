package com.bilgeadam.week03.lecture003;

public class Question39 {
	// String'i parçalara ayıralım, bir array'e kaydedelim. Sonra aşağıdaki örnek
	// çıktıyı almaya çalışalım;
	// Adananın plaka kodu = 01

	public static void main(String[] args) {
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";

		String[] sehirArray = sehirler.split(";");

		for (int i = 0; i < sehirArray.length; i++) {
			int index = sehirArray[i].indexOf("-");
			System.out.println(
					sehirArray[i].substring(index + 1) + " şehrinin plaka kodu = " + sehirArray[i].substring(0, index));
		}
	}

}
