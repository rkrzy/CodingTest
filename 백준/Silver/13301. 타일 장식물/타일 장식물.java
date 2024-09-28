import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        long []arr = new long[82];
        arr[1] = 1;
        arr[2] = 1;
        for(int i = 3; i<=N+1;i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println((arr[N+1] * 2) + (arr[N] * 2));
    }
}