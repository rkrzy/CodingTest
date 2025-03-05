import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int max = 0;

        int[][] arr = new int[N][M];
        int[][] dp = new int[N][M];

        for(int i = 0; i < N; i++){
            str = br.readLine().split("");
            for(int j = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(str[j]);
                dp[i][j] = Integer.parseInt(str[j]);
                if(i >= 1 && j >= 1 && dp[i][j] != 0 ){
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]), dp[i-1][j-1]) + 1;
                }
                if(max < dp[i][j]){
                    max = dp[i][j];
                }
            }
        }
        System.out.println(max * max);

    }

}
