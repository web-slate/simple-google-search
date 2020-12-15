package com.google.search.googlesearch.models;

import java.util.ArrayList;

import javax.inject.Named;

@Named
public class SearchAutoCompleteModel implements SearchAutoCompleteModelInterface {
	private ArrayList<String> results;

	@Override
	public ArrayList<String> getResults() {
		return results;
	}

	@Override
	public void setResults(ArrayList<String> results) {
		this.results = results;
	}

}
