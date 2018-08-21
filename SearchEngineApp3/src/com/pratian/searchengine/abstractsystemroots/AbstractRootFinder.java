package com.pratian.searchengine.abstractsystemroots;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import com.pratian.searchengine.systemroots.RootFinder;

public abstract class AbstractRootFinder implements RootFinder {

	public List<String> getSubSubDirectories(File folderToSearch){
		List<String> foundFilePaths = new LinkedList<String>();
		//File folderToSearch = new File("/home/user");
		File[] listOfFiles = folderToSearch.listFiles();
		if(listOfFiles != null) {
			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isDirectory()) {
					foundFilePaths.add(listOfFiles[i].getAbsolutePath());
				}
			}
		}
		return foundFilePaths;
	}
}
