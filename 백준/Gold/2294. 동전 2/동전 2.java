import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int result = 100000;
        int[] arr = new int[100];
        int[] dp = new int[K + 1];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.fill(dp, 100001);
        Arrays.sort(arr);
        dp[0] = 0;

        for(int i = 1; i <= K ;i++){
            for(int j = 0; j < arr.length; j++){
                if(i - arr[j] >= 0){
                    dp[i] = Math.min(dp[i], dp[i-arr[j]]+1);
                }
                else{
                    break;
                }
            }
        }
        if(dp[K] == 100001){
            System.out.println(-1);
        }
        else
        {
            System.out.println(dp[K]);
        }





    }
}
