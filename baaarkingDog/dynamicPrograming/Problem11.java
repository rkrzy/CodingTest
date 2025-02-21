import java.io.*;


//dp[3] = dp[2] + arr[3] or dp[1] + arr[3]
//dp[4] = dp[2] + arr[4] or arr[3] + arr[4] + dp[1]
//dp[5] = dp[3] + arr[5] or arr[4] + arr[5] + dp[2]
public class Main {


    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[n + 1];
            int[] dp = new int[n + 1];
            for(int i = 1; i <= n; i++){
                arr[i] = Integer.parseInt(br.readLine());
            }
            dp[1] = arr[1];
            if(n >= 2){
                dp[2] = arr[2] + arr[1];
            }
            if(n >= 3) {
                dp[3] = Math.max(dp[2], Math.max(arr[3] + arr[1], arr[3] + arr[2]));
            }
            for(int i = 4; i <= n; i++){
                dp[i] = Math.max(dp[i-1],Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]));
            }
            System.out.println(dp[n]);



    }
}
