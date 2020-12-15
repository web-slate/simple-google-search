package com.google.search.googlesearch.services;

import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.inject.Named;

@Named
public class SearchAutoCompleteService implements SearchAutoCompleteServiceInterface {

	private ArrayList<String> keywordArray;

	public ArrayList<String> matchedKeywords;

	public SearchAutoCompleteService() {
		super();
		this.getKeywordArrayList();
	}

	@Override
	public ArrayList<String> findByKeywordUsingLoop(String keyword) {
		matchedKeywords = new ArrayList<String>();
		for (String word : keywordArray) {
			if (word.contains(keyword))
				matchedKeywords.add(word);
		}
		return matchedKeywords;
	}
	
	@Override
	public ArrayList<String> findByKeywordUsingStream(String search) {
		matchedKeywords = (ArrayList<String>) keywordArray.stream().filter(str -> str.trim().contains(search))
				.collect(Collectors.toList());

		return matchedKeywords;
	}

	@Override
	public ArrayList<String> getKeywordArrayList() {

		keywordArray = new ArrayList<String>();
		keywordArray.add("amazon");
		keywordArray.add("amazon prime");
		keywordArray.add("amazon API");
		keywordArray.add("amazon registry search");
		keywordArray.add("amazon uk");
		keywordArray.add("google");
		keywordArray.add("google json");
		keywordArray.add("google translate");
		keywordArray.add("google scholar");
		keywordArray.add("google maps");
		keywordArray.add("gmail");
		keywordArray.add("gmail archive folder");
		keywordArray.add("gmail sign in");
		keywordArray.add("gmail create folder");
		keywordArray.add("gmail sign in add account");
		keywordArray.add("facebook");
		keywordArray.add("facebook folder");
		keywordArray.add("factoria mods folder");
		keywordArray.add("facebook search");
		keywordArray.add("factoria mods");
		keywordArray.add("ebay");
		keywordArray.add("ebay uk");
		keywordArray.add("ebates");
		keywordArray.add("ebay login");
		keywordArray.add("ebay australia");
		keywordArray.add("weather");
		keywordArray.add("weather api");
		keywordArray.add("weather nyc");
		keywordArray.add("weather today");
		keywordArray.add("weather report");
		keywordArray.add("youtube");
		keywordArray.add("youtube api");
		keywordArray.add("youtube folder");
		keywordArray.add("youtube to mp3");
		keywordArray.add("youtube video");

		return keywordArray;
	}

}
