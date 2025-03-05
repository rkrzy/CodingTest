import java.io.*;
import java.util.Arrays;

/*
1. 테이블 정의하기
- dp[i] = 2*n직사각형을 1X2, 2X1, 2X2 타일로 채울수 있는 방법의 수
2. 점화식 찾기 : dp[i] = (dp[i-2] * 2)+dp[i-1]
3. 초기값 정의하기 :
- dp[1] = 1
- dp[2] = 3

 */

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 3;
        for(int i = 3; i <= n; i++){
            dp[i] = ((dp[i-2] * 2) + dp[i-1])%10007;
        }
        System.out.println(dp[n]);

    }
}
