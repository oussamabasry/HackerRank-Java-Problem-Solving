package SimpleArraySum;


import java.io.*;
import java.util.*;


public class Solution {
    /**
     * Sum of the array elements
     * @param ar the array's elements
     * @return sum the sum of the array's elements as a single integer
     */
	static int simpleArraySum(int[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++)
			sum += ar[i];
		return sum;
	}
   
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
        
		System.out.print("Enter the size of the array: ");
		int arCount = Integer.parseInt(scanner.nextLine().trim());

		int[] ar = new int[arCount];
		
        System.out.println("Enter "+arCount+" integers separated by spaces:");
		String[] arItems = scanner.nextLine().split(" ");

		for (int arItr = 0; arItr < arCount; arItr++) {
			int arItem = Integer.parseInt(arItems[arItr].trim());
			ar[arItr] = arItem;
		}

		int result = simpleArraySum(ar);
		System.out.println("The sum is: "+result);
	
	}
}
