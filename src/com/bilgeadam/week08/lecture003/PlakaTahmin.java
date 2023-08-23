package com.bilgeadam.week08.lecture003;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PlakaTahmin {

	/*
	 * 
	 * -bu arrayden bir map olusturan metodu yazalim key degerleri plaka degerleri
	 * olsun value sehir olsun. 1,2,3
	 * 
	 * oyun sayisi hakkımız olsun () --> bir oyunda 3 kere tahminde bulunabiliriz
	 * 
	 * menumuz olacak
	 * 
	 * Sehir tahmin oyununa hosgeldiniz Her oyun icin 3 tahmin hakkiniz
	 * bulunmaktadir.
	 * 
	 * 1-oyuna basla
	 * 
	 * 1.oyun (kacinci oyundaysak) 3 tahmin hakkimiz var(herdefasinda azalacak)
	 * 
	 * Random bir plaka uretecegiz (utility sinifinda yapalim) ve kullaniciya soru
	 * soracagiz bu plaka hangi ile aittir? kullanicidan gelen degere gore islem
	 * yapacagiz dogruysa bildiniz, yanlissa tekrar deneyin ciktisini verip basa
	 * donecegiz (toplamda 3 tahmin hakkimiz bulunmaktadir.) basarili tahminde
	 * bulundugumuz zaman ve tahmin hakkimiz kalmadigi zaman ana menuye donsun
	 * 
	 * 
	 * 2-Eski Tahminlerim=> 1den fazla oyun oynayabilirim her oyunun tahminlerini
	 * bir yerde tutacagım sonra burayı cagirdigim zaman her oyunun tahminleri ayri
	 * ayri yazilsin
	 * 
	 * 3- cikis
	 * 
	 * 
	 * 
	 */

	String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			"Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			"Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };

	Map<Integer, String> plakalarVeIller = new TreeMap<>();
	Map<Integer, List<String>> eskiTahminler = new LinkedHashMap<>();
	int oyunSayisi = 0;
	int hak = 3;

	public PlakaTahmin() {
		mapOlustur();
	}

	public void mapOlustur() {
		for (int i = 0; i < iller.length; i++) {
			plakalarVeIller.put(i + 1, iller[i]);
		}
	}

	public void menu() {
		int secim = 3;
		do {
			System.out.println("Sehir tahmin oyununa hosgeldiniz!");
			System.out.println("Her oyun icin 3 adet tahmin hakkiniz bulunmaktadir!");
			System.out.println("1- Oyuna Basla");
			System.out.println("2- Eski Tahminlerim");
			System.out.println("3- Cikis");
			secim = Utility.intDegerAlma("Lutfen bir secim yapiniz : ");
			switch (secim) {

			case 1:
				oyunOyna();
				break;
			case 2:
				tahminleriYazdir();
				break;
			case 3:
				System.out.println("Oyundan cikis yapiliyor...");
				secim = 3;
				break;
			default:
				System.out.println("Lutfen gecerli bir secim yapiniz!!!");
			}

		} while (secim != 3);
	}

	private void tahminleriYazdir() {
		eskiTahminler.forEach((x, y) -> System.out.println(x + ". oyun tahminleri " + y));

	}

	private void oyunOyna() {
		int plaka = Utility.randomSayiUret(1, 82);
		oyunSayisi++;
		System.out.println(oyunSayisi + ". oyun");
		tahminEt(plaka);

	}

	private void tahminEt(int plaka) {

		List<String> tahminler = new ArrayList<>();

		for (int i = 0; i < hak; i++) {
			System.out.println("Kalan hakkiniz :" + (hak - i));
			String tahmin = Utility.stringDegerAlma(plaka + " plaka kodu hangi sehre aittir? : ");
			tahminler.add(tahmin);

			if (plakalarVeIller.get(plaka).equalsIgnoreCase(tahmin)) {
				System.out.println("Tebrikler bildiniz!!!");
				break;
			} else {
				System.out.println("Yanlis tahmin... ");
			}
		}

		eskiTahminler.put(oyunSayisi, tahminler);

	}

}
