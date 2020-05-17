package com.designpatterns.srp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Journal {

	public List<String> journals = new ArrayList<String>();
	public static int count;

	public void addEntries(String journalName) {
		journals.add("" + (++count) + ": " + journalName);
	}

	public boolean removeJournal(int index) {
		if (index < journals.size()) {
			journals.remove(index);
			return true;
		}
		System.out.println("No such index found");
		return false;
	}

	@Override
	public String toString() {
		return String.join(System.lineSeparator(), journals);
	}

	public static void main(String[] args) throws IOException {
		Journal journal = new Journal();
		journal.addEntries("Breaking bad");
		journal.addEntries("Dexter");
		Persistence pers = new Persistence();
		System.out.println(journal.toString());
		String fileName = "C:\\Users\\Public\\Documents\\mala.txt";
		pers.saveToFile(journal, fileName);

		Runtime.getRuntime().exec("notepad.exe " + fileName);
	}

}
