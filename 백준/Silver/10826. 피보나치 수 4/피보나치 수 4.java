import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int N;
         BigInteger[]arr = new  BigInteger[10001];
      Scanner scanner = new Scanner(System.in);
      N = scanner.nextInt();
      arr[0] = new BigInteger("0");
      arr[1] = new BigInteger("1");
      for(int i = 2;i<=N;i++)
      {
          arr[i] = arr[i-1].add(arr[i-2]);
      }
      System.out.println(arr[N]);

    }
}