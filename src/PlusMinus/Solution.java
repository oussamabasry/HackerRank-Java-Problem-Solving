package PlusMinus;

import java.util.*;

public class Solution {

	static void plusMinus(int[] arr) {
		double nbPositive = 0;
		double nbNegative = 0;
		double nbNull = 0;
		int length = arr.length;

		for (int i = 0; i < length; i++) {
			if (arr[i] > 0)
				nbPositive++;
			else if (arr[i] < 0)
				nbNegative++;
			else
				nbNull++;
		}
		System.out.println(Double.parseDouble(String.format("%.6f", nbPositive / length)));
		System.out.println(Double.parseDouble(String.format("%.6f", nbNegative / length)));
		System.out.println(Double.parseDouble(String.format("%.6f", nbNull / arr.length)));

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}
}
