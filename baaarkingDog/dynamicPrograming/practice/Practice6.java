import java.io.*;

import static java.util.Arrays.stream;


/*
1. 테이블 정의하기 :
dp[i] = dp[i]
2. 점화식 찾기 :
dp[i] = dp[i-1] + s[i]

3. 초기값 정의하기 :
dp[0] = 0
*/

public class Main {

    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        int[] arr = stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        dp = new int[n+1];


        for(int i = 1; i <= n;i++){
            dp[i] = dp[i-1] + arr[i-1];
        }
        for(int i = 0; i < m; i++){
            str = br.readLine().split(" ");
            int minNum = Integer.parseInt(str[0]);
            int maxNum = Integer.parseInt(str[1]);
            System.out.println(dp[maxNum] - dp[minNum-1]);
        }



    }
}
