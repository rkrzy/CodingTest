import java.io.*;
import java.util.Arrays;


public class Main {
    static boolean check(int num1, int num2){
        String str = String.valueOf(num1);
        String str2 = String.valueOf(num2);

        int strStart = 0;
        int str2Start = str2.length()-1;

        while(strStart < str.length() && str2Start >= 0){
            if(str.charAt(strStart) != str2.charAt(str2Start))
            {
                return false;
            }
            strStart++;
            str2Start--;
        }
        if(strStart != str.length() || str2Start != -1){
            return false;
        }
        return true;
    }
    static boolean check2(int num1){
        String str = String.valueOf(num1);
        int start = 0;
        int end = str.length()-1;

        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());

        int[] arr = new int[N + 1];
        int[][] dp = new int[N+1][N+1];
        for(int i = 1; i <= N; i++){
            Arrays.fill(dp[i],1);
        }

        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(str[i-1]);
        }

        for(int i = 1; i <= N; i++){
            for(int j =1; j <= i; j++){
                if(i == j ){
                    dp[j][i] = 1;
                }
                else if(i - j == 1) dp[j][i] = (arr[j] == arr[i])?1:0;
                else{
                    dp[j][i] = (arr[i] == arr[j] && dp[j+1][i-1]==1)?1:0;
                }
            }
        }



        for(int i = 0; i < M; i++){
            int[] question = Arrays.stream(br.readLine().split(" ")).
                    mapToInt(Integer::parseInt)
                    .toArray();
            if(dp[question[0]][question[1]] == 1){
                bw.write("1"+"\n");
            }
            else {
                bw.write("0"+"\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
