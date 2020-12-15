package com.google.search.googlesearch.services;

import java.util.ArrayList;

public interface SearchAutoCompleteServiceInterface {

	public abstract ArrayList<String> findByKeywordUsingLoop(String keyword);

	public abstract ArrayList<String> findByKeywordUsingStream(String keyword);

	public abstract ArrayList<String> getKeywordArrayList();

}
