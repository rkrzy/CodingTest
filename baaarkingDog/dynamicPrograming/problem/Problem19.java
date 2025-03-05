import java.io.*;

/**


 **/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int testNum = 1;
        int[][] arr = new int[100000][3];

        int[][] dp = new int[100000][3];

        while (true){
            int N = Integer.parseInt(br.readLine());
            if(N == 0){break;}
            for(int i = 0; i < N; i++){
                String[] str = br.readLine().split(" ");
                arr[i][0] = Integer.parseInt(str[0]);
                arr[i][1] = Integer.parseInt(str[1]);
                arr[i][2] = Integer.parseInt(str[2]);
            }

            dp[1][0] = arr[1][0] + arr[0][1];
            dp[1][1] = Math.min(dp[1][0] + arr[1][1] ,Math.min(arr[1][1] + arr[0][1], arr[0][1] + arr[0][2] + arr[1][1]));
            dp[1][2] = Math.min(dp[1][1] + arr[1][2],Math.min(arr[1][2] + arr[0][1],arr[0][1] +arr[1][2] + arr[0][2]));
            for(int i = 2; i < N; i++){
                dp[i][0] = Math.min(dp[i-1][0] + arr[i][0] , dp[i-1][1] + arr[i][0]);
                dp[i][1] = Math.min(Math.min(dp[i-1][0] + arr[i][1],dp[i][0] + arr[i][1]) , Math.min(dp[i-1][1] + arr[i][1],dp[i-1][2] + arr[i][1]));
                dp[i][2] = Math.min(dp[i][1] + arr[i][2],Math.min(dp[i-1][2] + arr[i][2] , dp[i-1][1] + arr[i][2]));
            }
            System.out.println(testNum++ + ". " +dp[N-1][1]);
        }


    }

}
