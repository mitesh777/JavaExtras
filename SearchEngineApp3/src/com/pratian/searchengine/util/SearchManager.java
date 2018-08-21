package com.pratian.searchengine.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pratian.searchengine.search.FileSearcher;
import com.pratian.searchengine.search.SearchMap;
import com.pratian.searchengine.search.SearchResult;

public class SearchManager {
	public static SearchMap startSearch(String fileTOSearch, String folderToSearch, List<String> subDirectories) {
		List<FileSearcher> fileSearcherList = new ArrayList<FileSearcher>();
		for (String s : subDirectories) {
			FileSearcher fs = new FileSearcher(new File(s), new File(fileTOSearch));
			fileSearcherList.add(fs);
			fs.start();
		}

		for (FileSearcher fs : fileSearcherList) {
			try {
				fs.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		SearchMap searchMap = new SearchMap();
		for (FileSearcher fs : fileSearcherList) {
			SearchResult sr = fs.getSearchResult();
			if(!sr.getFoundFilePaths().isEmpty())
				searchMap.addSearchResult(fs.getFolderToSearch().getAbsolutePath(), fs.getSearchResult());
		}
		return searchMap;
	}
}
