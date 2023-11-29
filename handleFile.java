package collection;
import java.io.*;
public class handleFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		File file = new File("text.txt");
		
			if(file.createNewFile()) {
				System.out.println("File has been created");
			}
			else {
				System.out.println("File already exist");
			}
		try {
			File file2 = new File("index.txt");
			if(file2.createNewFile()) {
				System.out.println("New file is created");
			}
			else {
				System.out.println("File existent");
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File error");
			e.printStackTrace();
		}
		
			
	}

}
