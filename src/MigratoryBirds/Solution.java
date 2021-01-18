package MigratoryBirds;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

	static int migratoryBirds(List<Integer> arr) {

		int indexMax = 0;
		int max = 0;
		int tab[] = { 0, 0, 0, 0, 0 };

		for (int i = 0; i < arr.size(); i++) {
			
			if (arr.get(i) == 1) tab[0]++;
			else if (arr.get(i) == 2) tab[1]++;
			else if (arr.get(i) == 3) tab[2]++;
			else if (arr.get(i) == 4) tab[3]++;
			else if (arr.get(i) == 5) tab[4]++;
		}

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > max || (tab[i] == max && i < indexMax)) {
				max = tab[i];
				indexMax = i;
			}
		}

		return indexMax + 1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = migratoryBirds(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
