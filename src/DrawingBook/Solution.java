package DrawingBook;

import java.io.*;
import java.util.*;


public class Solution {

    static int pageCount(int n, int p) {

        int totalPageFromStart = p / 2;
        int totalPageFromEnd = n / 2 - p / 2;

        return Math.min(totalPageFromStart, totalPageFromEnd);
    }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
