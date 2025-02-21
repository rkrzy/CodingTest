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
        int max = 0;

        int[] dp = new int[n + 1];
        int[] arr = new int[n + 1];
        String[] str = br.readLine().split(" ");

        arr[0] = 0;
        for(int i = 1; i <= n; i++)
        {
            arr[i] = Integer.parseInt(str[i-1]);
        }

        for(int i = 1; i <= n; i++){
            dp[i] = arr[i];
            for(int j = 1; j < i; j++){
                if(arr[j] < arr[i]) dp[i] = Math.max(dp[i], dp[j] + arr[i]);
            }
            if(dp[i] > max){
                max = dp[i];
            }
        }
        System.out.println(max);
    }
}
