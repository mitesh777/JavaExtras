package FileIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class CopyAnImage {
	public static void main(String[] args) {
		long inputStream = inputStreamTime();
		
		long bufferedStream = bufferedStreamTime();
		
		long timeDiff = inputStream - bufferedStream;
		
		System.out.println("difference " + timeDiff );
	}

	private static long bufferedStreamTime() {
		long startTime = System.nanoTime();
		try {
			
			BufferedInputStream in = new BufferedInputStream(new FileInputStream("/home/user/Desktop/ImageCopy/image.jpeg"));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("/home/user/Desktop/ImageCopy/image2.jpeg"));
			
			int len;
			System.out.println("here");
			while((len=in.read())!=-1) {
				out.write(len);
				//System.out.println(len+"a");
			}
			System.out.println("got here");
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("buffered "+totalTime);
		return totalTime;
	}

	private static long inputStreamTime() {
		long startTime = System.nanoTime();
		try {
			FileInputStream in = new FileInputStream("/home/user/Desktop/ImageCopy/image.jpeg");
			FileOutputStream out = new FileOutputStream("/home/user/Desktop/ImageCopy/copiedimage.jpeg");
			int len;
			System.out.println("here");
			while((len=in.read())!=-1) {
				out.write(len);
				//System.out.println(len+"a");
			}
			System.out.println("got here");
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("time for input stream " + totalTime);
		return totalTime;
	}
}
