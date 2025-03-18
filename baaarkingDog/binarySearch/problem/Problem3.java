import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        arr = new int[N];

        str = br.readLine().split(" ");
        for(int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        int min = 0;
        int mid = 0;
        int max = arr[N-1];

        while(min <= max){
            long total = 0;
            mid = (min + max) / 2;
            for(int i = 0; i < N; i++){
                if(arr[i] - mid > 0) total += arr[i] - mid;
            }
            if(total < M){
                max = mid - 1;
            }
            else {
                min = mid + 1;
            }
        }
        System.out.println(max);
        br.close();
    }

}

