package com.pratian.searchengine.search;

import java.util.LinkedList;
import java.util.List;

public class SearchResult {
	private List<String> foundFilePaths = new LinkedList<String>();
	int noOfFoldersScanned;
	public int getNoOfFoldersScanned() {
		return noOfFoldersScanned;
	}
	public void setNoOfFoldersScanned(int noOfFoldersScanned) {
		this.noOfFoldersScanned = noOfFoldersScanned;
	}
	
	public void addFoundFilePaths(String path) {
		foundFilePaths.add(path);
	}
	
	public void incrementnoOfFoldersScanned() {
		++noOfFoldersScanned;
	}
	public List<String> getFoundFilePaths() {
		return foundFilePaths;
	}
	@Override
	public String toString() {
		return "SearchResult [foundFilePaths=" + foundFilePaths + ", noOfFoldersScanned=" + noOfFoldersScanned + "]";
	}
	
	
}
