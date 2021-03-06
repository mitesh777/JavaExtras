package com.pratian.searchengine.search;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.pratian.searchengine.systemroots.impl.HiddenRootFinder;
import com.pratian.searchengine.util.Console;

public class FileSearcher extends Thread{
	
	File folderToSearch;
	File file;
	
	SearchResult sr;

	
	
	public File getFolderToSearch() {
		return folderToSearch;
	}

	public void setFolderToSearch(File folderToSearch) {
		this.folderToSearch = folderToSearch;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public SearchResult getSearchResult() {
		return sr;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		searchFile(folderToSearch, file);
	}
	
	public FileSearcher(File folderToSearch, File file) {
		super();
		this.folderToSearch = folderToSearch;
		this.file = file;
		sr = new SearchResult();
	}
	
	

	public void searchFile(File folderToSearch, File file) {
		// File folder = new File(folderToSearch.getCanonicalPath());
		File[] listOfFiles = folderToSearch.listFiles();
		if (listOfFiles != null) {
			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
					if (listOfFiles[i].getName().contains(file.getName())) {
						sr.addFoundFilePaths((folderToSearch.getAbsolutePath()));
					}
				} else if (listOfFiles[i].isDirectory()) {
					sr.incrementnoOfFoldersScanned();
					searchFile(new File(listOfFiles[i].getAbsolutePath()), file);
				}
			}
		}

	}

//	public static void main(String[] args) {
//		FileSearcher fs = new FileSearcher();
//		String fileToSearch = null;
//		String folderToSearch = null;
//		try {
//			System.out.println("Enter folder to search");
//			folderToSearch = Console.readLine();
//			System.out.println("Enter file to search");
//			fileToSearch = Console.readLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
////		List<String> list = fs.searchFile(new File(folderToSearch), new File(fileToSearch));
////		System.out.println(list);
//		List<String> list = new HiddenRootFinder().getSubDirectories();
//		System.out.println(list);
//
//	}
}
