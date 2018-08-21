package com.pratian.searchengine.systemroots.impl;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import com.pratian.searchengine.abstractsystemroots.AbstractRootFinder;
import com.pratian.searchengine.systemroots.RootFinder;

public class HiddenRootFinder extends AbstractRootFinder{
	public List<String> getSubDirectories() {
		List<String> foundFilePaths = new LinkedList<String>();
		File folderToSearch = new File("/home/user");
		File[] listOfFiles = folderToSearch.listFiles();
		if(listOfFiles != null) {
			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isDirectory() && listOfFiles[i].isHidden()) {
					foundFilePaths.add(listOfFiles[i].getAbsolutePath());
				}
			}
		}
		return foundFilePaths;
	}
}
