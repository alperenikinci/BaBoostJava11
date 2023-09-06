package com.bilgeadam.week10.lecture002;

import java.io.File;
import java.nio.file.Path;

public class FileSabitler {

//	String path = "C:/Users/busin/Desktop/BoostJava11/Eclipse Workspace/BilgeAdamBoostJava11/fileislemler.txt";
	public static Path path = Path
			.of("C:/Users/busin/Desktop/BoostJava11/Eclipse Workspace/BilgeAdamBoostJava11/fileislemler.txt");
	public static File file = new File(path.toString());

}
