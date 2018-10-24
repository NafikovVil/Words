package com.Words;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map.Entry;

public class App 
{
    public static void main( String[] args )
    {
    	if (args.length == 0) {
			System.out.print("Не указан файл");
			return;
		}
		String filename = args[0];
		try(FileInputStream file = new FileInputStream(filename)) {
			ReadWords reader = new ReadWords(file, new CheckRusWord());
			ArrayList<String> listWords = reader.getWords();
			WordsFrequency frequency = new WordsFrequency(listWords);
			for(Entry<String, Integer> s: frequency.getFrequency()) {
				System.out.print(s.getKey() + " " + s.getValue() + "\n");
			}
		}
		catch (FileNotFoundException e) {
			System.out.print("Не найден нужный файл");
		}
		catch (IOException e) {
			System.out.print("Ошибка потока");
		}
		catch (IllegalArgumentException e) {
			System.out.print(e.getMessage());
		}
	}    
}
