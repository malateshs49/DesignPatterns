package com.designpatterns.srp;

import java.io.File;
import java.io.PrintStream;

public class Persistence {

	public void saveToFile(Journal journal, String fileName) {
		try {
			File newFile = new File(fileName);
			newFile.createNewFile();
			PrintStream stream = new PrintStream(newFile);
			stream.println(journal.toString());
			System.out.println("File Created Successfully");
			stream.close();
		} catch (Exception e) {
			System.out.println("Failed to handle file error");
		}
	}

}
