import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int N;
        N = scanner.nextInt();
        long[] arr = new long[N+1];
        arr[0] = 1;
        for(int i = 1;i <= N;i++)
        {
            for(int j = 0;j<i;j++)
            {
                arr[i] += arr[j] * arr[i - j - 1];
            }
        }
        System.out.println(arr[N]);
    }
}