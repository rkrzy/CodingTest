import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String str;
        int N = scanner.nextInt();
        long[] arr = new long[N];
        N = N - 1;

        while (N >= 0) {
            str = "" + scanner.nextLong();
            str = new StringBuilder(str)
                    .reverse()
                    .toString();
            arr[N--] = Long.parseLong(str);
        }

        Arrays.sort(arr);


        for (long a : arr) {
            System.out.println(a);
        }
    }
}
