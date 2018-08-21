package FileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintAsciiTable {
	
	public static void main(String[] args) {
		File file = new File("/home/user/Desktop/asciitable");
		if(file.isDirectory()) {
			System.out.println("already exists directory");
		}
		else {
			boolean b = file.mkdirs();
			System.out.println(b+" making the file");
		}
		//boolean b = file.mkdir();
		//System.out.println(b);
		file = new File("/home/user/Desktop/asciitable/ascii2.txt");
		//file.setReadOnly();
		//byte[] data = {1,65,3,22};
		
		try {
			FileWriter out = new FileWriter(file);
			for(int i = 1 ; i < 128; i++) {
				out.write(i+" "+ (char)i +"\n");
				System.out.println(i+" "+ (char)i);
			}
			out.close();
			System.out.println("printed");	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
