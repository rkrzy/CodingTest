import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            int result = 0;
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            int[] A = new int[n];
            int[] B = new int[m];
            int iIdx = 0;
            for(String s : br.readLine().split(" ")){
                A[iIdx++] = Integer.parseInt(s);
            }
            Arrays.sort(A);
            iIdx = 0;
            for(String s : br.readLine().split(" ")){
                B[iIdx++] = Integer.parseInt(s);
            }
            Arrays.sort(B);
            for(int num : A){
                for(int j = 0; j < B.length; j++){
                    if(num <= B[j])break;
                    result++;
                }
            }
            System.out.println(result);
        }

    }
}
