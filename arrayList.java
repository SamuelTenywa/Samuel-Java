package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Character> letter = new ArrayList<Character>();
		letter.add('a');
		letter.add('B');
		letter.add('X');
		letter.add('p');
		letter.forEach((n) -> {System.out.print(n); });
		LinkedList<Character> list = new LinkedList<Character>();
		list.addAll(letter);
		for(Character e: list) {
			System.out.println(e);
		}
	}

}
