package com.bilgeadam.week08.lecture004;

public class Test {

	public static void main(String[] args) {
		SansliNumaralar sansliNumaralar = new SansliNumaralar();
		sansliNumaralar.mapOlustur();
		sansliNumaralar.listeOlustur();

		sansliNumaralar.sayilarMap.forEach((k, v) -> System.out.println(k + " = " + v));
//		sansliNumaralar.sayilarListesi.forEach(System.out::println);
		System.out.println(sansliNumaralar.listeKontrol());
		sansliNumaralar.sansliNumaralariBul();
		int i = 1;
		for (Integer sansliNumara : sansliNumaralar.sansliNumaralar) {
			System.out.println(i + ". Sansli numaramiz : " + sansliNumara);
			i++;
		}

		System.out.println("50'den buyuk olan sansli numaralar : "); // Stream ile getirin.
		sansliNumaralar.sansliNumaralar.stream().filter((number) -> number > 50).forEach(System.out::println);

		System.out.println("Sansli sayilarin toplami : "); // Stream ile getirin.
		System.out.println(sansliNumaralar.sansliNumaralar.stream().reduce((x, y) -> x + y));

		sansliNumaralar.sansliNumaralar.forEach(numara -> {
			numara += numara;
			System.out.println(numara);
		});
		;
	}

}
