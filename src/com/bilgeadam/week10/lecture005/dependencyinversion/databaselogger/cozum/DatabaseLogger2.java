package com.bilgeadam.week10.lecture005.dependencyinversion.databaselogger.cozum;

public class DatabaseLogger2 {

	ILogger logger;

	// loosely coupled
	public DatabaseLogger2(ILogger logger) {
		super();
		this.logger = logger;
	}

	public void logToDatabase(String ex) {
		logger.log(ex);
	}

}
