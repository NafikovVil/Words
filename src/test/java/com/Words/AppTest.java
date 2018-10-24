package com.Words;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{    
	public void test() {
		ArrayList<String> listWord = new ArrayList<String>();
		listWord.add("Слово");
		listWord.add("Пар");
		listWord.add("Слов");
		listWord.add("Слово");
		int expected = 3;
		
		WordsFrequency frequency = new WordsFrequency(listWord);
		int actual = frequency.getFrequency().size();		
		
		assertEquals(expected, actual);
	}
	
	public void testReader() throws IOException {
		FileInputStream file = new FileInputStream("E:\\test.txt");
		ReadWords reader = new ReadWords(file, new CheckRusWord());
		ArrayList<String> testArray = reader.getWords();
		int expected = 7;
		int actual = testArray.size();
		assertEquals(expected, actual);
	}
}
