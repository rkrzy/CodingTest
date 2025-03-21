import java.io.*;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    static Integer[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int temp = 0;
        arr = new Integer[N];

        for(int i = 0; i < N;i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i< N;i++){
            bw.append(arr[i] + "\n");
        }
        bw.flush();

        br.close();
        bw.close();


    }
}
