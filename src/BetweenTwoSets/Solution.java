package BetweenTwoSets;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

	// function that calcul the LCM of two integers
	public static int lcmTwoIntegers(int x, int y) {
		return x * (y / gcdTwoIntegers(x, y));
	}

	// function that calcul the GCD of two integers
	public static int gcdTwoIntegers(int x, int y) {
		while (y > 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}

	public static int getTotalX(List<Integer> a, List<Integer> b) {

		// extract the lcm between all the elements of the list a
		int lcm = a.get(0);
		for (int i = 1; i < a.size(); i++) {
			lcm = lcmTwoIntegers(lcm, a.get(i));
		}

		// extract the gcd between all the elements of the list b
		int gcd = b.get(0);
		for (int i = 1; i < b.size(); i++) {
			gcd = gcdTwoIntegers(gcd, b.get(i));
		}

		// count the number of multiple of lcm that divides the gcd
		int count = 0;
		int j = 1;
		for (int i = lcm; i <= gcd; i = lcm * j) {
			if (gcd % i == 0)
				count++;
			j++;
		}

		return count;
	}
}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int total = Result.getTotalX(arr, brr);

		bufferedWriter.write(String.valueOf(total));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
