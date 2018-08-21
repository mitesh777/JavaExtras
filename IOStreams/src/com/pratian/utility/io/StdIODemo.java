package com.pratian.utility.io;

import java.io.IOException;

public class StdIODemo {
	
	
	public static char readOneChar() throws IOException {
		int data = System.in.read();
		return (char) data;
	}
	
	public static String readString() throws IOException {
		String data = "";
		char input;
		System.in.skip(1);
		while((input=(char)System.in.read()) != '\n') {
			data += input;
		}
		return data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a character");
		
		try {
			char data = readOneChar();
			System.out.println((char)data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("enter a string");
		try {
			String name = readString();
			System.out.println(name);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
