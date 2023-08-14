package com.bilgeadam.week07.lecture001.abstractionornek;

public abstract class Tasit {

	private String marka;
	private String model;
	private int hiz;
	private String vites;

	public Tasit() {
		super();
	}

	public Tasit(String marka, String model, int hiz, String vites) {
		super();
		this.marka = marka;
		this.model = model;
		this.hiz = hiz;
		this.vites = vites;
	}

	public void hizlan() { // concrete method
		hiz += 10;
	}

	public void frenYap() { // concrete method
		hiz -= 10;
	}

	public void vitesDegistir(String yeniVites) { // concrete method
		vites = yeniVites;
	}

	public abstract void akrobatikHareketYap(); // abstract method (Govdesi yok, miras alindigi siniflarda govdesini
												// kazanacak.)

	public void ozellikleriGoster() { // concrete method
		System.out.println("Marka : " + marka);
		System.out.println("Model : " + model);
		System.out.println("Hiz : " + hiz);
		System.out.println("Vites : " + vites);

	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVites() {
		return vites;
	}

	public void setVites(String vites) {
		this.vites = vites;
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

}
