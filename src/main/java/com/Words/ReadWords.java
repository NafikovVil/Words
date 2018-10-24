package com.Words;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadWords {
	private InputStream reader;
	private CheckWord checker;
	
	public ReadWords(InputStream in, CheckWord func) {
		if (in == null)
			throw new IllegalArgumentException("�� ��������� �������� �����");
		if (func == null)
			throw new IllegalArgumentException("�� ���������� �������� ����");
		this.reader = in;
		checker = func;
	}
	public ArrayList<String> getWords() throws IOException {
		ArrayList<String> listWord = new ArrayList<String>();
		try (Scanner scan = new Scanner(reader)){					
			while(scan.hasNextLine()) {
				String inputStr = scan.next();
				if(checker.match(inputStr))
					listWord.add(inputStr);
			}
		}
		return listWord;
	}
}
