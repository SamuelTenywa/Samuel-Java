package collection;

import java.util.regex.*;


public class regularEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("lule", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Visit Lule");
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
		
	}

}
