package com.bilgeadam.week10.lecture005.dependencyinversion;

import com.bilgeadam.week10.lecture005.Utility.Kullanici;

public interface IEmailSendable {

	void emailGonder(Kullanici kullanici);

}
