package com.bilgeadam.week10.lecture005.dependencyinversion;

import com.bilgeadam.week10.lecture005.dependencyinversion.databaselogger.DatabaseLogger;
import com.bilgeadam.week10.lecture005.dependencyinversion.databaselogger.exception.StoryException;
import com.bilgeadam.week10.lecture005.dependencyinversion.databaselogger.exception.VideoException;

public class DbTest {

	public static void main(String[] args) {
		WhatsApp whatsapp = new WhatsApp();

		try {
			whatsapp.hikayePaylas();
			whatsapp.videoKonferansYap();
		} catch (StoryException e) {
			new DatabaseLogger().logToPostgre(e.getMessage());
		} catch (VideoException e) {
			new DatabaseLogger().logToMongo(e.getMessage());
		}
	}

}
