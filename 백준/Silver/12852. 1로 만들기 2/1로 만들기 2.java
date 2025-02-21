import java.io.*;

import static java.util.Arrays.stream;


/*
1. 테이블 정의하기 :
dp[i] = i를 조건에 따라서 나눴을 때 1을 만들 수 있는 최소의 횟수

2. 점화식 찾기 :
최소 횟수 구하기
3으로 나눠질 때 : dp[i] = dp[i/3] + 1;
2로 나눠질 때 : dp[i] = dp[i/2] + 1;
두 조건이 아무것도 해당이 안될 때 : dp[i] = dp[i-1] + 1;
3. 초기값 정의하기 :
dp[0] = 0
dp[1] = 0
dp[2] = 1

*/

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[1000000+1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + 1;
            if(i % 2 == 0)dp[i] = Math.min(dp[i], dp[i/2] + 1);
            if(i % 3 == 0)dp[i] = Math.min(dp[i], dp[i/3] + 1);
        }
        System.out.println(dp[n]);
        while(n != 1){
            System.out.print(n + " ");
            int temp = n;
            if(temp % 2 == 0){
                if(dp[temp] > dp[n/2]) temp = n/2;
            }
            if(temp % 3 == 0){
                if(dp[temp] > dp[n/3]) temp = n/3;
            }
            if(dp[n-1] < dp[temp]){
                temp = n -1;
            }
            n = temp;
        }
        System.out.println(n);
    }
}
