package NumberLineJumps;

import java.io.*;
import java.util.*;

public class Solution {

	static String kangaroo(int x1, int v1, int x2, int v2) {

		int d1 = x1;
		int d2 = x2;

		if (x1 > x2) {
			while (d2 < d1) {
				d1 += v1;
				d2 += v2;
				if (d1 == d2) return "YES";
			}
		} else {
			while (d2 > d1) {
				d1 += v1;
				d2 += v2;
				if (d1 == d2) return "YES";
			}
		}

		return "NO";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] x1V1X2V2 = scanner.nextLine().split(" ");

		int x1 = Integer.parseInt(x1V1X2V2[0]);

		int v1 = Integer.parseInt(x1V1X2V2[1]);

		int x2 = Integer.parseInt(x1V1X2V2[2]);

		int v2 = Integer.parseInt(x1V1X2V2[3]);

		String result = kangaroo(x1, v1, x2, v2);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
