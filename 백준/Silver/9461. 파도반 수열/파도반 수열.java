import java.io.*;



public class Main {


    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int t = Integer.parseInt(br.readLine());
       int n = 0;
       long[] arr = new long[101];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 2;
        arr[5] = 2;
       for(int i = 6; i < 101; i++){
           arr[i] = arr[i-2] + arr[i-3];
       }
       for(int i = 0; i < t; i++){
           n = Integer.parseInt(br.readLine());
            System.out.println(arr[n]);
       }
    }
}
