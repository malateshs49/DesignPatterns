package com.designpatterns.srp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class JournalsTest {

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@Test
	public void addEntriesTest() {
		Journal journal = new Journal();
		journal.addEntries("Breaking bad");
		journal.addEntries("Dexter");
		assertEquals(journal.journals.size(), 2);
	}

	@Test
	public void addRemoveTest() {
		Journal journal = new Journal();
		journal.addEntries("Breaking bad");
		journal.addEntries("Dexter");
		assertTrue(journal.removeJournal(0));

	}

	@Test
	public void addRemoveNonExistingTest() {
		Journal journal = new Journal();
		journal.addEntries("Breaking bad");
		journal.addEntries("Dexter");
		assertFalse("No such index found", journal.removeJournal(3));
	}

	@Test
	public void PersistToFileTest() throws IOException {
		Journal journal = new Journal();
		Persistence persist = new Persistence();
		journal.addEntries("Breaking bad");
		journal.addEntries("Dexter");
		File fileName = folder.newFile("mala.txt");
		persist.saveToFile(journal, fileName.getAbsolutePath());
		assertTrue(fileName.exists());
	}

}
