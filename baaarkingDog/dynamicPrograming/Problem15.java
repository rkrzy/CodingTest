import java.io.*;

/**
 i = 1
 1장팩으로 만들 수 있는 가장 큰 값
 i = 2
 1, 2장팩으로 만들 수 있는 가장 큰 값
 i = 3
 1, 2, 3장팩으로 만들 수 있는 가장 큰 값

**/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int[] arr = new int[N + 1];
        int[] dp = new int[N + 1];
        //값을 입력
        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(str[i-1]);
        }
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                dp[i] = Math.max(dp[i], dp[i - j] + arr[j]);
            }
        }
        System.out.println(dp[N]);



    }

}
