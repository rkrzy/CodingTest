import java.io.*;



public class Main {

    static final long MOD = 1000000000L;
    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int n = Integer.parseInt(br.readLine());

       long[][] dp =  new long[101][10];
       long result = 0;
       for(int i = 0; i<=9 ;i++){
           dp[1][i] = 1L;
       }
       for(int i = 2;i < 101;i++){
           dp[i][0] = dp[i-1][1] % MOD;

           for(int j = 1; j < 9; j++){
               dp[i][j] = (dp[i-1][j-1] % MOD) + (dp[i-1][j+1] % MOD) % MOD;
           }

           dp[i][9] = dp[i-1][8] % MOD;
       }
       for(int i = 1; i < 10; i++)
       {
           result = (result + dp[n][i]) % MOD;
       }
        System.out.println(result);


    }
}
