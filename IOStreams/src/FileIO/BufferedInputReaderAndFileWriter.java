package FileIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedInputReaderAndFileWriter {
	public static void main(String[] args) {
		
		BufferedReader reader = 
                new BufferedReader(new InputStreamReader(System.in));
		System.out.println("give your ata pata");
		try {
			String name = reader.readLine();
			BufferedWriter bw = new BufferedWriter(new FileWriter("/home/user/Desktop/newDir2/abc2/text3.txt"));
			bw.write(name);
			bw.close();
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}