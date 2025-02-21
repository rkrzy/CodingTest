import java.io.*;


public class Main {


    public static void main(String[] args) throws IOException {
            final long MOD = 1000000009L;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            long[] arr = new long[1000001];
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 4;
            for(int i = 4; i < 1000001; i++){
                arr[i] = ((arr[i-3]%MOD) + (arr[i-2]%MOD) + (arr[i-1]%MOD))%MOD;
            }
            for(int i = 0; i < t; i++) {
                int n = Integer.parseInt(br.readLine());
                System.out.println(arr[n]);
            }



    }
}
