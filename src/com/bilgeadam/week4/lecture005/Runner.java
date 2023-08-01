package com.bilgeadam.week4.lecture005;

public class Runner {

	public static void main(String[] args) {
		/**
		 * S1. Hesap MAkinesi Program� t�m bile�enleri method haline gelecek �ekilde bir
		 * s�n�f i�inde toplan�y�n�z. Runner -> main i�inde �a��r�p �al��t�r�n�z.
		 * 
		 * S2. elimimizde bo� bir say� dizi olan bir s�n�f�m�z olsun. bu s�n�f�n i�inde;
		 * ekleme, ��kartma, listeleme gibi i�lemler i�in �zel methodlar tan�mlayal�m.
		 * sistem ��yle �al���yor olsun. OzelListe s�n�f� -> int[] dizi; OzelListe liste
		 * = new OzelListe(); *** listeye ekleme yapmak i�in liste.add(5);
		 * liste.add(124); liste.add(45); *** listeden bir say�y� silmek i�in
		 * liste.remove(0); -> index numaras� yeterli *** listeyi g�r�nt�lemek i�in *
		 * liste.list(); -> [124,45] �eklinde EK �ZELL�KLER ------- [2,34,63,12] ->
		 * 2,1111 -> [2,34,1111,63,12] liste.addIndex(index,value); ->
		 * liste.addIndex(3,546); bir dizinin istenilen indexine verilen de�eri eklemek.
		 * ------- liste.size(); -> dizinin eleman say�s�n� verir. liste.getList() ->
		 * dizinin kendisini d�ner -> return type -> int[]
		 * 
		 */

		OzelListe liste = new OzelListe();
		liste.add(10);
		liste.list();
		liste.add(9);
		liste.list();
		liste.add(7);
		liste.list();
		liste.add(986);
		liste.list();
		liste.add(453);
		liste.list();
		liste.remove(3);
		liste.list();
		liste.remove(1);
		liste.list();
		System.out.println("----------------------------------------------");
		for (int i = 0; i < liste.size(); i++)
			System.out.println("dizi eleman�....: " + liste.getList()[i]);
		System.out.println("----------------------------------------------");
		for (int i = 0; i < liste.size(); i++)
			System.out.println("dizi eleman�....: " + liste.getIndexOf(i));

		liste.addIndex(1, 980);
		liste.list();

	}

}
