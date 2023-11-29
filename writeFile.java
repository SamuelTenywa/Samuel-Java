package collection;

import java.io.*;


public class writeFile{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileWriter writer = new FileWriter("text.txt");
		writer.append("I need a new mentor and new direction when learning\n");
		writer.append("I don't seem to head in the positive direction\n");
		writer.append("This is an emergency");
		System.out.println("Successfully wrote to the file");
		writer.close();
		}
		catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
