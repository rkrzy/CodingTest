import java.io.*;


/*
1. 테이블 정의하기 :
D[i] = 2 * i 크기의 직사각형을 채우는 방법의 수
2. 점화식 찾기 :
D[i] = D[i-1] + D[i-2]


3. 초기값 정의하기 :
D[1] = 1
D[2] = 2
*/

public class Main {

    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(br.readLine());

        dp = new int[n+1];

        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++){
            dp[i] = (dp[i-1] + dp[i-2])%10007;
        }
        System.out.println(dp[n]);

    }
}
