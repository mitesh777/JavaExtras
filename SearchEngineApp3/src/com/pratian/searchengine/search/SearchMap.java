package com.pratian.searchengine.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SearchMap {
	
	private Map<String , SearchResult> resultsMap = new HashMap<String , SearchResult>();
	
	public Set<String> getAllPaths(){
		return resultsMap.keySet();
	}
	
	public void addSearchResult(String path,SearchResult searchResult) {
		resultsMap.put(path,searchResult);
	}
	
	public SearchResult getSearchResult(String path) {
		return resultsMap.get(path);
	}

	@Override
	public String toString() {
		return "SearchMap [resultsMap=" + resultsMap + "]";
	}
	
	
}
