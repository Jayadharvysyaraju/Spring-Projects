package com.epam.java8;

import java.io.File;
import java.io.FileFilter;

public class FirstLamda {

	public static void main(String[] args) {
		
		//anonymous impl
		FileFilter filter = new FileFilter() {

			public boolean accept(File pathname) {
				
				return pathname.getName().endsWith(".java");
			}
		};
		
		//lamda exp
		FileFilter lamdaFilter = (File pathname)->pathname.getName().endsWith(".java");
		

		File dir = new File("D:/my workspace/helloworld/src/com/epam");
		File[] files = dir.listFiles(filter);
		
		File[] files1 = dir.listFiles(lamdaFilter);
		
		for(File f: files) {
			System.out.println(f);
		}
		
		for(File f: files1) {
			System.out.println(f);
		}
	}

}
