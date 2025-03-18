import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] str = br.readLine().split(" ");
        int M = Integer.parseInt(str[0]);
        int N = Integer.parseInt(str[1]);

        int[] arr = new int[N];
        str = br.readLine().split(" ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        int max = arr[N - 1];

        int min = 1;
        int mid = 0;
        int result = 0;
        while(min <= max){
            int count = 0;
            mid = (max + min) / 2;
            for(int i = 0; i < N; i++){
                count += arr[i] / mid;
            }
            if(count >= M){min = mid + 1;}
            else if(count < M){max = mid - 1;}
        }

        System.out.println(max);




        bw.flush();
        br.close();
        bw.close();
    }

}

