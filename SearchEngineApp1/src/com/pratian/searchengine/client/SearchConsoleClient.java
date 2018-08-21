package com.pratian.searchengine.client;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.List;

import com.pratian.searchengine.search.FileSearcher;
import com.pratian.searchengine.search.FolderTypes;
import com.pratian.searchengine.search.HiddenRootFinder;
import com.pratian.searchengine.search.NonHiddenRootFinder;
import com.pratian.searchengine.search.SystemRootFinder;
import com.pratian.searchengine.util.Console;

public class SearchConsoleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileTOSearch=null;FolderTypes folderType = null;
		try {
			System.out.println("Enter The File To Search");
			fileTOSearch = Console.readLine();
			System.out.println("Select type of files to search from: ALL, NONHIDDEN, HIDDEN");
			folderType = FolderTypes.valueOf(Console.readLine().toUpperCase());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> directories = null;
		switch(folderType) {
			case ALL : directories = new SystemRootFinder().getSubDirectories();
			break;
			case NONHIDDEN : directories = new NonHiddenRootFinder().getSubDirectories();
			break;
			case HIDDEN : directories = new HiddenRootFinder().getSubDirectories();
			break;
		}
		
		for(String s : directories) {
			System.out.println(s);
		}
		
		System.out.println("Enter folder to search from the list : ");
		String folderToSearch=null;
		try {
			folderToSearch = Console.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileSearcher searcher = new FileSearcher();
		List<String> fileFound = searcher.searchFile(new File(folderToSearch), new File(fileTOSearch));
		System.out.println(fileFound);
	}
}
