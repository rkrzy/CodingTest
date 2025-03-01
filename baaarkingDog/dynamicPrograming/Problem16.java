import java.io.*;

/**


 **/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[][] arr = new int[3][100001];

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            int result = 0;
            int[][] dp = new int[3][N + 1];
            String[] str1 = br.readLine().split(" ");
            String[] str2 = br.readLine().split(" ");

            //입력
            for(int j = 0; j < str1.length; j++){
                arr[1][j+1] = Integer.parseInt(str1[j]);
                arr[2][j+1] = Integer.parseInt(str2[j]);
            }
            if(N >= 1){
                dp[1][1] = arr[1][1];
                dp[2][1] = arr[2][1];
            }
            if(N >= 2){
                dp[1][2] = arr[2][1] + arr[1][2];
                dp[2][2] = arr[1][1] + arr[2][2];
            }
            for(int j = 3; j <= N; j++){
                dp[1][j] = Math.max(dp[2][j-1] + arr[1][j], dp[2][j-2] + arr[1][j]);
                dp[2][j] = Math.max(dp[1][j-1] + arr[2][j] , dp[1][j-2] + arr[2][j]);
            }

            System.out.println(dp[1][N] > dp[2][N] ? dp[1][N] : dp[2][N]);

        }




    }

}
