package com.bilgeadam.week10.lecture004.taksiapp;

public class Test {

	public static void main(String[] args) {
		Durak durak = new Durak();

		durak.taksiler.forEach(taksi -> {
			Thread thread = new Thread(taksi);
			thread.start();
		});
	}

}
