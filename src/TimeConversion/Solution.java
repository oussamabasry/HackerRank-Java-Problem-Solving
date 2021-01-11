package TimeConversion;

import java.io.*;
import java.util.*;


public class Solution {

	static String timeConversion(String s) {
		
		int hour = Integer.parseInt(Character.toString(s.charAt(0)) + Character.toString(s.charAt(1)));
		int minute = Integer.parseInt(Character.toString(s.charAt(3)) + Character.toString(s.charAt(4)));
		int second = Integer.parseInt(Character.toString(s.charAt(6)) + Character.toString(s.charAt(7)));
		String suffixe = Character.toString(s.charAt(8)) + Character.toString(s.charAt(9));

		if (hour >= 1 && hour <= 11 && suffixe.equals("PM"))
			hour += 12;

		else if (hour == 12 && suffixe.equals("AM"))
			hour = 0;

		return String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second);
	}
	
	

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scan.nextLine();

		String result = timeConversion(s);

		bw.write(result);
		bw.newLine();

		bw.close();
	}
}
