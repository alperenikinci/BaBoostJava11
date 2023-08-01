package com.bilgeadam.week4.lecture005;

public class OzelListe {

	int[] sayiDizisi; // {1,658,25} -> dizi[2] = 555
	int boyut = 0;// 1,2,3

	/**
	 * dizinin i�ine eklenilecek say� bilgisini alarak diziye ekleme yapar.
	 * 
	 * @param sayi -> eklemek istedi�iniz say�y� giriniz.
	 */
	public void add(int sayi) {//
		int[] tmp;
		if (sayiDizisi == null) {
			sayiDizisi = new int[1]; //
			sayiDizisi[0] = sayi;
		} else {
			tmp = new int[boyut + 1]; // say�Dizisinden 1 eleman daha b�y�k olan bir dizi tan�mlad�m
			for (int i = 0; i < boyut; i++) { // say�Dizisinin t�m elemanlar�n� tmp ye aktard�m
				tmp[i] = sayiDizisi[i];
			}
			tmp[boyut] = sayi;
			sayiDizisi = tmp;
		}
		boyut++;// 2
	}

	// {1,2} dışarıdan 5 eklenecek. //sayiDizisi //Boyut = 2
	// {1,2,5} //tmp
	// {1,2,5}= {1,2,5}
	/**
	 * verilen index te bulunan say�s� diziden siler.
	 * 
	 * @param index -> silmek istedi�iniz say�n�n index numaras�n� giriniz.
	 */
	public void remove(int index) { // index = 3
		// sayiDizisi [1,3,66,32,35] ->5
		int[] tmp = new int[boyut - 1]; // [0,0,0,0]
		int j = 0;
		for (int i = 0; i < boyut; i++) {// i=4 boyut=5 , j=1
			if (i != index) { // i=4, index=3
				tmp[i - j] = sayiDizisi[i]; // [1,3,66,35]
			} else
				j = 1;
		}
		sayiDizisi = tmp;
		boyut--;
	}

	/*
	 * 
	 * sayiDizisi = {1,2,5} BOYUT = 3 index 2; tmp = {1,2}
	 * 
	 * {,,} =>>> {1,2} {1,2};
	 */

	/**
	 * diziyi consol ekran�na listeler
	 */
	public void list() {
		System.out.print("[");
		for (int i = 0; i < boyut; i++) {
			System.out.print(sayiDizisi[i]);
			if (i != boyut - 1)
				System.out.print(",");
		}
		System.out.println("]");
	}

	public int[] getList() {
		return sayiDizisi;
	}

	/**
	 * index numaras� verilen dizinin i�indeki elaman� d�ner �RN: int[] dizi = new
	 * int[3] // {23,3,22} getIndexOf(1) -> 3 // dizi[1]
	 * 
	 * @param i
	 * @return
	 */
	public int getIndexOf(int i) {
		return sayiDizisi[i];
	}

	public int size() {
		return boyut;
	}

	/**
	 * bir dizi i�ine istenilen index numaras�na eleman eklemek i�in kullan�l�r.
	 * �RN: {2,58,9,81,24} // boyut = 5 addIndex(3,980) -> {2,58,9,980,81,24}
	 * 
	 * @param index
	 * @param value
	 */
	// 3 980
	public void addIndex(int index, int value) {
		int[] tmp = new int[boyut + 1]; // {2,58,9,980,81,24}
		int j = 0;
		for (int i = 0; i < boyut + 1; i++) {
			if (index == i) {
				tmp[i] = value;
				j++;
			} else {
				tmp[i] = sayiDizisi[i - j];
			}
		}
		sayiDizisi = tmp;
		boyut++;
	}

	// {1,2,3,4,5} //index = 3, value = 10; j=1;
	// {1,2,3,10,4,5} tmp;

}
