package com.bilgeadam.week10.lecture005.dependencyinversion.databaselogger.cozum;

public class MongoLogger implements ILogger {

	@Override
	public void log(String ex) {
		System.out.println(ex + " Mongoya loglandi...");
	}

}
