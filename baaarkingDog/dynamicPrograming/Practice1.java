import java.io.*;
import java.util.Scanner;

//1. 테이블 정의하기 : D[i] = i를 1로 만들기 위해 필요한 연산 사용 횟수의 최솟값
//2. 점화식 찾기 : D[12] = ?
//(1). 3으로 나누거나 (D[12] = D[4] + 1)
//(2). 2로 나누거나 (D[12] = D[6] + 1)
//(3). 1을 빼거나 (D[12] = D[11] + 1)
//(4) D[12] = min(D[4] + 1, D[6] + 1, D[11] + 1)
//(5) D[k]의 경우도 생각해보자
//3. 초기값 정의하기 : D[1] = 0


public class Main {

    static int[] dp;
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        dp = new int[n + 1];

        dp[1] = 0;
        for(int i = 2; i <= n; i++){
            if(i % 3 == 0 && i % 2 == 0){
                dp[i] = Math.min(dp[i/3] + 1, Math.min(dp[i/2] + 1 ,dp[i-1] + 1));
            }
            else if(i % 2 == 0){
                dp[i] = Math.min(dp[i/2] + 1 ,dp[i-1] + 1);
            }
            else if(i % 3 == 0){
                dp[i] = Math.min(dp[i/3] + 1 ,dp[i-1] + 1);
            }
            else {
                dp[i] = dp[i-1] + 1;
            }

        }

        System.out.println(dp[n]);
    }
}
