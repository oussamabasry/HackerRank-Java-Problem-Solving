package CompareTheTriplets;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

	/**
	 * 
	 * @param a List of Integers (first triplets)
	 * @param b List of Integers (second triplets)
	 * @return score List of Integer (the score of each triplet
	 */
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> score = new ArrayList<Integer>();
		score.add(0);
		score.add(0);
		int count = 0;
		for (Integer i : a) {
			if (i > b.get(count))
				score.set(0, score.get(0) + 1);
			else if (i < b.get(count))
				score.set(1, score.get(1) + 1);
			count++;
		}

		return score;

	}

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// input: 3 space-separated integers,the respective values in triplet a
		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());
		// input: 3 space-separated integers,the respective values in triplet b
		List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		List<Integer> result = compareTriplets(a, b);
		// output: List of two integers which represents the score of each triplet
		System.out.println(result.stream().map(Object::toString).collect(joining(" ")) + "\n");

		bufferedReader.close();

	}
}
