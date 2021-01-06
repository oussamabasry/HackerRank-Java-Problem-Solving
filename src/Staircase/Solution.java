package Staircase;

import java.util.*;

public class Solution {

	static void staircase(int n) {
		int count;

		for (int i = 0; i < n; i++) {
			count = 0;
			while (count < n) {
				if (count < n - i - 1) System.out.print(" ");
				else System.out.print("#");
				count++;
			}
			System.out.print("\n");
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		staircase(n);

		scanner.close();
	}
}
