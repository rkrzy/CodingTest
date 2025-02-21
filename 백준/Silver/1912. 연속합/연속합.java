import java.io.*;
import java.util.Arrays;

/*
1. 테이블 정의하기

2. 점화식 찾기 :
3. 초기값 정의하기 :


 */

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dp = new int[100001];

        int max = arr[0];

        dp[1] = arr[0];
        for(int i = 2; i <= n; i++){
            dp[i] = Math.max(arr[i-1], dp[i-1] + arr[i-1]);
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
