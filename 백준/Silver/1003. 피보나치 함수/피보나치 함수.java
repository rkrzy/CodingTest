import java.io.*;
import java.util.Scanner;

/*
1. 테이블 정의하기 :
dp[i] = i를 조건에 따라서 나눴을 때 1을 만들 수 있는 최소의 횟수

2. 점화식 찾기 :
최소 횟수 구하기

3. 초기값 정의하기 :


*/

public class Main {


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int[][] dp = new int[41][2];
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;
        for(int i = 2; i < 41;i++){
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }
        for(int i = 0; i< t; i++){
            int temp = scanner.nextInt();
            System.out.println(dp[temp][0] + " " + dp[temp][1]);
        }
    }
}
