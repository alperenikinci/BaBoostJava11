package com.bilgeadam.week10.lecture005.dependencyinversion.databaselogger;

public class DatabaseLogger {

	// Strictly coupled.
	public void logToPostgre(String ex) {
		PostgreLogger postgreLogger = new PostgreLogger();
		postgreLogger.log(ex);
	}

	public void logToMongo(String ex) {
		MongoLogger mongoLogger = new MongoLogger();
		mongoLogger.log(ex);
	}

//	public void logToOracle(String ex) {
//		OracleLogger oracleLogger = new OracleLogger();
//		oracleLogger.log(ex);
//	}

}
