import java.io.*;



public class Main {

    static final long MOD = 1000000000L;
    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String[] str = br.readLine().split(" ");
       int t = Integer.parseInt(str[0]);
       int w = Integer.parseInt(str[1]);

       int[] tree = new int[t+1];
       int[][][] dp = new int[t+1][w+1][3];
       int result = 0;
       tree[0] = 1;
       for(int i = 1; i <= t;i++){
            tree[i] = Integer.parseInt(br.readLine());
       }

       if(tree[1] == 1){
           dp[1][0][1] = 1;
           dp[1][1][2] = 0;
       }
       else{
           dp[1][0][1] = 0;
           dp[1][1][2] = 1;
       }

       for(int i = 2; i <= t; i++){
           if(tree[i] == 1){
               dp[i][0][1] = dp[i-1][0][1] + 1;
               dp[i][0][2] = dp[i-1][0][2];

               for(int j = 1; j<= w; j++){
                   dp[i][j][1] = Math.max(dp[i-1][j][1], dp[i-1][j-1][2]) + 1;
                   dp[i][j][2] = Math.max(dp[i-1][j-1][1], dp[i-1][j][2]);
               }
           }
           else{
               dp[i][0][1] = dp[i-1][0][1];
               dp[i][0][2] = dp[i-1][0][2] + 1;

               for(int j = 1; j <= w; j++){
                   dp[i][j][1] = Math.max(dp[i-1][j][1], dp[i-1][j-1][2]);
                   dp[i][j][2] = Math.max(dp[i-1][j-1][1], dp[i-1][j][2]) + 1;
               }
           }
       }
       for(int i = 0; i <= w; i++){
           result = Math.max(result, Math.max(dp[t][i][1], dp[t][i][2]));
       }
        System.out.println(result);

    }
}
