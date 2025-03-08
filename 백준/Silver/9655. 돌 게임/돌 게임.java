import java.io.*;
import java.util.Arrays;


//1 => 상근
//2 => 창영
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] dp = new String[1001];

        dp[1] = "SK";
        dp[2] = "CY";
        dp[3] = "SK";
        for (int i = 4; i <= N; i++) {
            if (dp[i - 1] == "CY" || dp[i - 3] == "CY") {
              dp[i] = "SK";
            }
            else{
                dp[i] = "CY";
            }
        }
        System.out.println(dp[N]);
    }

}
