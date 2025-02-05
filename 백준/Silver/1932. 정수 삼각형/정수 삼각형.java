import java.io.*;
import java.util.Arrays;


public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int t = Integer.parseInt(br.readLine());
        int[][] d= new int[501][501];
        int[][] p= new int[501][501];
        int max = 0;
        for(int i = 1; i <= t; i++){
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int j = 0; j < arr.length; j++){
                d[i][j+1] = arr[j];
            }
        }
        p[1][1] = d[1][1];
        for(int i = 2; i <= t; ++i)
            for(int j = 1; j <= i; ++j)
                p[i][j] = Math.max(p[i-1][j-1], p[i-1][j]) + d[i][j];
        for(int i = 1; i < t+1; i++){
            if(max < p[t][i]){
                max = p[t][i];
            }
        }
        System.out.println(max);
    }
}
