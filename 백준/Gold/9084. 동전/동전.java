import java.io.*;
import java.util.Arrays;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            int[] money = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int M = Integer.parseInt(br.readLine());
            int[] dp = new int[M + 1];
            dp[0] = 1;

            for(int j = 0; j < N; j++){
                int coin = money[j];
                for(int k = coin; k <= M; k++){
                    dp[k] += dp[k-coin];
                }
            }



            System.out.println(dp[M]);
        }
    }

}
