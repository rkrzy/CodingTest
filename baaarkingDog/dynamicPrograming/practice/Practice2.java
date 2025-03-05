import java.io.*;
import java.util.Scanner;

//1. 테이블 정의하기 : D[i] : i를 1, 2, 3의 합으로 나타내는 방법의 수
//2. 점화식 찾기 : D[4] = ?
//(1). D[4] = D[3] + D[2] + D[1]
//3. 초기값 정의하기 :
//(1). D[1] = 1;
//(2). D[2] = 2;
//(3). D[3] = 4;


public class Main {

    static int[] dp;
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        dp = new int[12];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i = 4; i <= 11; i++){
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }
        for(int i = 0; i < T; i++)
        {
            int temp = scanner.nextInt();
            System.out.println(dp[temp]);
        }



    }
}
