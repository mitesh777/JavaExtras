package com.pratian.searchengine.client;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.pratian.searchengine.abstractsystemroots.AbstractRootFinder;
import com.pratian.searchengine.search.FileSearcher;
import com.pratian.searchengine.search.SearchMap;
import com.pratian.searchengine.search.SearchResult;
import com.pratian.searchengine.systemroots.FolderTypes;
import com.pratian.searchengine.systemroots.RootFinder;
import com.pratian.searchengine.systemroots.RootFinderFactory;

import com.pratian.searchengine.util.Console;
import com.pratian.searchengine.util.SearchManager;
import com.pratian.searchengine.util.SearchHistory;
public class SearchConsoleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileTOSearch = null;
		RootFinder rf = null;
		try {
			System.out.println("Enter The File To Search");
			fileTOSearch = Console.readLine();
			
			System.out.println("Select type of files to search from: ALL, NONHIDDEN, HIDDEN");

			rf = RootFinderFactory.create(FolderTypes.valueOf(Console.readLine().toUpperCase()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> directories = rf.getSubDirectories();

		for (String s : directories) {
			System.out.println(s);
		}

		System.out.println("Enter folder to search from the list : ");

		String folderToSearch = null;
		try {
			folderToSearch = Console.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<String> subDirectories = rf.getSubSubDirectories(new File(folderToSearch));
		SearchMap map = SearchManager.startSearch(fileTOSearch, folderToSearch, subDirectories);
		System.out.println(map);
		
		
		
//		FileSearcher searcher = new FileSearcher(new File(folderToSearch), new File(fileTOSearch));
//		searcher.start();
//		try {
//			searcher.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		SearchResult fileFound = searcher.getSearchResult();
//		System.out.println(fileFound);

	}
	// abstrac

	

}
