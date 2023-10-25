package com.bilgeadam.week10.lecture005.dependencyinversion;

import com.bilgeadam.week10.lecture005.dependencyinversion.databaselogger.cozum.DatabaseLogger2;
import com.bilgeadam.week10.lecture005.dependencyinversion.databaselogger.cozum.MongoLogger;
import com.bilgeadam.week10.lecture005.dependencyinversion.databaselogger.cozum.PostgreLogger;
import com.bilgeadam.week10.lecture005.dependencyinversion.databaselogger.exception.StoryException;
import com.bilgeadam.week10.lecture005.dependencyinversion.databaselogger.exception.VideoException;

public class DbTest2 {
	public static void main(String[] args) {

		WhatsApp whatsapp = new WhatsApp();

		try {
			whatsapp.videoKonferansYap();
			whatsapp.hikayePaylas();
		} catch (StoryException e) {
			new DatabaseLogger2(new PostgreLogger()).logToDatabase(e.getMessage());

		} catch (VideoException e) {
			new DatabaseLogger2(new MongoLogger()).logToDatabase(e.getMessage());
		}
	}
}
