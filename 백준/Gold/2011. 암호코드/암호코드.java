import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        long [][]dp = new long[5000][2];

        if(str.charAt(0) - 48 > 0){
            dp[0][0] = 1;
            dp[0][1] = 0;
        }
        else
        {
            dp[0][0] = 0;
            dp[0][1] = 0;
        }

        for(int i = 1; i < str.length(); i++){
            int num = Integer.parseInt(str.substring(i-1, i+1));

            if(str.charAt(i) - 48 == 0){
                dp[i][0] = 0;
                if(10<=num && num < 30)
                dp[i][1] = dp[i-1][0]%1000000;
            }
            else if(num < 10){
                dp[i][0] = dp[i-1][1]%1000000;
                dp[i][1] = 0;
            }
            else if(num <= 26){
                dp[i][0] = dp[i-1][0] + dp[i-1][1]%1000000;
                dp[i][1] = dp[i-1][0]%1000000;
            }
            else{
                dp[i][0] = (dp[i-1][0] + dp[i-1][1])%1000000;
                dp[i][1] = 0;
            }
        }
        System.out.println((dp[str.length()-1][0] + dp[str.length()-1][1])%1000000);
    }
}
