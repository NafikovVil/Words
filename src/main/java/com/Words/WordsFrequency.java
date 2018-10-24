package com.Words;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordsFrequency {
	ArrayList<String> streamOfWords;
	HashMap<String, Integer> frequency;
	
	public WordsFrequency(ArrayList<String> words) {
		streamOfWords = words;	
		frequency = new HashMap<String, Integer>();
	}
	
	public Set<Map.Entry<String, Integer>> getFrequency(){			
		streamOfWords.stream().forEach(word -> {
			if (!frequency.containsKey(word))
				frequency.put(word, 1);
			else 
				frequency.put(word, frequency.get(word) + 1);
			});		
		return frequency.entrySet();
	}
	
}
