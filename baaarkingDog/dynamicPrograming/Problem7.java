import java.io.*;
import java.util.Arrays;



public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];
        int[] arr = new int[n + 1];

        String[] str = br.readLine().split(" ");

        arr[0] = 0;
        for(int i = 1; i <= n; i++)
        {
            arr[i] = Integer.parseInt(str[i-1]);
        }

        for(int i = 1; i <= n; i++){
            dp[i] = 1;
            for(int j = 1; j < i; j++){
                if(arr[j] < arr[i]) dp[i] = Math.max(dp[j]+1, dp[i]);
            }
        }
        Arrays.sort(dp);
        System.out.println(dp[n]);
    }
}
