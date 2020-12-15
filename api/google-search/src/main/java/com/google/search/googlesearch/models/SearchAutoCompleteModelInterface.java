package com.google.search.googlesearch.models;

import java.util.ArrayList;

public interface SearchAutoCompleteModelInterface {
	
	public abstract ArrayList<String> getResults() ;

	public abstract void setResults(ArrayList<String> results);
}
