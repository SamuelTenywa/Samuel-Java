package collection;
import java.io.*;
import java.util.*;
public class readFile{

	public static void main(String[] args) {
		try {
			File file = new File("text.txt");
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				String data = scan.nextLine();
				System.out.println(data);
			}
			scan.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		try {
			File name = new File("
		}
		
	}
}
