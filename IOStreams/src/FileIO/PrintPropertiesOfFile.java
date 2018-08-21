package FileIO;

import java.io.File;
import java.util.Scanner;

public class PrintPropertiesOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String nameOfFile = sc.next();
		File file = new File(nameOfFile);
		System.out.println("name of file "+ file.getName());
		System.out.println("size "+ file.length());
		System.out.println("can read "+ file.canRead());
		System.out.println("can write "+ file.canWrite());
		System.out.println("is hidden "+ file.isHidden());
	}

}
