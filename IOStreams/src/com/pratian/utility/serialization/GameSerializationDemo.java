package com.pratian.utility.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameSerializationDemo {
	public static void main(String[] args) {
		Game game = new Game(245,34.41,55);
		
		serializeGame(game); 
		
		System.out.println("game paused and saved");
		
		System.out.println("lets resume the game now");
		
		ObjectInputStream objIn;
		Game g = null;
		try {
			objIn = new ObjectInputStream(new FileInputStream("game_obj.obj"));
			g = (Game)objIn.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("now " + g);
		
	}

	private static void serializeGame(Game game) {
		try {
			ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("game_obj.obj"));
			objOut.writeObject(game);
			System.out.println("serialized... " + game);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
