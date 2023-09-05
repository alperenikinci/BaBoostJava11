package com.bilgeadam.week10.lecture001;

public enum ErrorType {
	DOLU_YER_SECIMI(1001, "Sectiginiz yer doludur!!!"),
	SINIRLAR_DISINDA(1002, "Yaptiginiz secim sinirlar disarisindadir!!!"),
	YETERSIZ_AGIRLIK(1003, "100 kilonun altinda yuk kabul edilmemektedir!!!"),
	GECERSIZ_KABUL_TARIHI(1004, "Gecmis bir gunun tarihini girdiniz!!!"),
	MESAI_GUNU_DISINDA(1005, "Cuma gunleri kabul yapilmiyor!!!");

	private String message;
	private int code;

	private ErrorType(int code, String message) {
		this.message = message;
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

}
