import java.io.*;
import java.util.Arrays;

/*
1. 테이블 정의하기
dp[i] = 0으로 시작하지 않고, 1이 두번 연속으로 나오지 않는 i자리의 수
2. 점화식 찾기 :dp[i] = dp[i-2] + dp[i-1]
3. 초기값 정의하기 :
dp[1] = 1
dp[2] = 1
dp[3] = 2

 */

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[91];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        for(int i = 4; i <= n; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        System.out.println(dp[n]);
    }
}
