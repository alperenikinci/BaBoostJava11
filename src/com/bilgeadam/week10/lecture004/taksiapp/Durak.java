package com.bilgeadam.week10.lecture004.taksiapp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Durak {
	List<Taksi> taksiler;
	static Queue<Integer> musteriKuyrugu;

	public Durak() {
		super();
		this.taksiler = new ArrayList<>();
		this.musteriKuyrugu = new LinkedList<Integer>();
		musteriOlustur();
		taksiOlustur();
	}

	public void musteriOlustur() {
		for (int i = 1; i < 101; i++) {
			musteriKuyrugu.add(i);
		}
	}

	public void taksiOlustur() {
		for (int i = 1; i < 14; i++) {
			taksiler.add(new Taksi(i));
		}
	}

}
