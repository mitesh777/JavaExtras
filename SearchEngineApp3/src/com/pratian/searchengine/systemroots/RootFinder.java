package com.pratian.searchengine.systemroots;

import java.io.File;
import java.util.List;

public interface RootFinder {
	List<String> getSubDirectories();
	List<String> getSubSubDirectories(File file);
}
