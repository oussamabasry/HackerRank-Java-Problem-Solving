package DiagonalDifference;

import java.io.*;
import java.util.*;

class Result {

	public static int diagonalDifference(List<List<Integer>> arr) {
		int leftToRight = 0;
		int rightToLeft = 0;
		int size = arr.size();

		for (int i = 0; i < size; i++) {
			leftToRight += arr.get(i).get(i);
			rightToLeft += arr.get(size - 1 - i).get(i);
		}

		return Math.abs(leftToRight - rightToLeft);
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

			List<Integer> arrRowItems = new ArrayList<>();

			for (int j = 0; j < n; j++) {
				int arrItem = Integer.parseInt(arrRowTempItems[j]);
				arrRowItems.add(arrItem);
			}

			arr.add(arrRowItems);
		}

		int result = Result.diagonalDifference(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
