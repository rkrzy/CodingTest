import java.io.*;



public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int str1Length = str1.length();
        int str2Length = str2.length();

        char[] str1Ch = str1.toCharArray();
        char[] str2Ch = str2.toCharArray();

        int[][] dp = new int[str1Length+1][str2Length+1];

        for(int i = 1; i <= str1Length; i++){
            for(int j = 1; j <= str2Length; j++){
                if(str1Ch[i-1] == str2Ch[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[str1Length][str2Length]);
    }

}
