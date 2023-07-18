package com.bilgeadam.week3.lecture001;

import java.util.Scanner;

public class Question29 {

	/*
	 * Menu
	 * 
	 * 1-Dışarıdan bir kelime ve bir harf girilsin eğer kelimemizin için de o harf
	 * varsa kaç tane olduğunu ve index numaralarını yazdırın. eğer harfi
	 * içermiyorsa bir çıktı aradağınız harf yok gibi
	 * 
	 * 
	 * 2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
	 * giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz
	 * içerisinde o harf varsa değiştirsin
	 * 
	 *
	 * 3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Palindrom olup
	 * olmadığını bulunuz(kek,iki,kabak,saippuakivikauppias)
	 * 
	 * 
	 * 4- Dışarıdan 5 adet kelime girelim her kelimede a, b veya c ile başlayıp
	 * başlamadığımızı kontrol etsin (a, b,c ile başlayanlar için ayrı ayrı sayfa
	 * açıldığını düşünün elimizde) a lar için bir sayfaya b ler bir sayfaya cler
	 * bir sayfaya yazılacak gibi düşünelim diğer harfle başlayanlar için ise ayrı
	 * bir sayfa düşünelim girilen 5 adet kelimeyi kontrol ettikten sonra elimizde
	 * kaç sayfa oluğunu ekrana yazdıralım *
	 * 
	 * 0 - Çıkış
	 */

	public static void main(String[] args) {

		boolean kontrol = true;
		int secim;
		Scanner scanner = new Scanner(System.in);

		while (kontrol) {

			System.out.println("---String İşlemleri---");
			System.out.println("1- Harf saydırma");
			System.out.println("2- Harf değiştirme");
			System.out.println("3- Palindrom kontrolü");
			System.out.println("4- Sayfa açma");
			System.out.println("0- Çıkış");
			System.out.print("Lütfen bir seçenek seçiniz : ");
			secim = scanner.nextInt();
			scanner.nextLine();

			switch (secim) {

			case 1: {
				System.out.println("\nHarf saydırma");
				System.out.print("Lütfen bir kelime giriniz : ");
				String kelime = scanner.nextLine();
				System.out.print("Lütfen bir harf giriniz : ");
				String harf = scanner.nextLine();
				int adet = 0;

				if (!kelime.contains(harf)) {
					System.out.println("\nGirdiğiniz kelimede aradığınız harf bulunmamaktadır");
					break;
				}
				for (int i = 0; i < kelime.length(); i++) {
					if (kelime.charAt(i) == harf.charAt(0)) {
						adet++;
						System.out.println(
								"Girdiğiniz kelimenin " + i + ". indeksinde " + harf + " harfi bulunmaktadır.");
					}
				}
				System.out.println("Girdiğiniz kelimede ; " + harf + " harfi " + adet + " adet bulunmaktadır.");
				scanner.close();
				break;
			}
//			
//			 * 2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
//			 * giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz
//			 * içerisinde o harf varsa değiştirsin
			case 2: {
				System.out.println("\nHarf değiştirme");
				System.out.print("Lütfen bir kelime giriniz : ");
				String kelime = scanner.nextLine();
				kelime = kelime.toLowerCase();
				System.out.print("Lütfen değiştirmek istediğiniz harfi giriniz : ");
				char eskiHarf = scanner.next().charAt(0);
				System.out.print("Lütfen yeni harfi giriniz : ");
				char yeniHarf = scanner.next().charAt(0);

				String yeniKelime = kelime.replace(eskiHarf, yeniHarf);
//				String yeniKelime = kelime.toLowerCase().replace(eskiHarf, yeniHarf);

				System.out.println("Girdiğiniz kelimenin eski hali : " + kelime + "\nGirdiğiniz kelimenin yeni hali : "
						+ yeniKelime);
				scanner.close();
				break;
			}
			case 3: {
				System.out.println("\nPalindrom kontrolü");
				System.out.print("Lütfen bir kelime giriniz : ");
				String kelime = scanner.nextLine();
				int right = kelime.length() - 1;
				int left = 0;

				boolean isPalindrome = true;
//				String tersKelime = "";

//				for (int i = kelime.length() - 1; i >= 0; i--) {
//					tersKelime += kelime.toLowerCase().charAt(i);
//				}
//				if (kelime.toLowerCase().equals(tersKelime)) {
//					System.out.println("Girdiğiniz kelime Palindromdur!");
//				} else {
//					System.out.println("Girdiğiniz kelime Palindrom değildir!");
//				}

				while (left < right) {
					if (kelime.charAt(left) != kelime.charAt(right)) {
						isPalindrome = false;
					}
					left++;
					right--;
				}
				if (isPalindrome) {
					System.out.println("Palindromdur!");
				} else {
					System.out.println("Palindrom değildir!");
				}
				scanner.close();
				break;
			}
			case 4: {
//				4- Dışarıdan 5 adet kelime girelim her kelimede a, b veya c ile başlayıp
//				 * başlamadığımızı kontrol etsin (a, b,c ile başlayanlar için ayrı ayrı sayfa
//				 * açıldığını düşünün elimizde) a lar için bir sayfaya b ler bir sayfaya cler
//				 * bir sayfaya yazılacak gibi düşünelim diğer harfle başlayanlar için ise ayrı
//				 * bir sayfa düşünelim girilen 5 adet kelimeyi kontrol ettikten sonra elimizde
//				 * kaç sayfa oluğunu ekrana yazdıralım *

				int a = 0, b = 0, c = 0, d = 0, toplam = 0;
				System.out.println("\nSayfa açma");
				System.out.print("Lütfen 5 adet kelime giriniz : ");
				for (int i = 0; i < 5; i++) {
					System.out.print((i + 1) + ". kelimeyi giriniz : ");
					String kelime = scanner.nextLine();

					if (kelime.charAt(0) == 'a') {
						a = 1;
					} else if (kelime.charAt(0) == 'b') {
						b = 1;
					} else if (kelime.charAt(0) == 'c') {
						c = 1;
					} else {
						d += 1;
					}

					toplam = a + b + c + d;
					System.out.println("Toplam dosya sayısı : " + toplam);

				}
				scanner.close();
				break;
			}
			case 0: {
				System.err.println("\nGörüşmek üzere!");
				scanner.close();
				kontrol = false;
				break;
			}
			default: {
				System.err.println("\nGeçerli bir seçim yapınız!!\n");
				break;
			}

			}

		}

	}

}
