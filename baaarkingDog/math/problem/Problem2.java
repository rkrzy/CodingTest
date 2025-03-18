import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 1;
        boolean[] arr = new boolean[123457 * 2];
        Arrays.fill(arr, false);

        for(int i = 2; i <= Math.sqrt(123456 * 2); i++){
            if(arr[i]) continue;

            for(int j = i + i; j <= 123456 * 2; j = j + i){
                    arr[j] = true;
            }
        }
        while(true){
            N = Integer.parseInt(br.readLine());
            if(N == 0){
                break;
            }
            int start = N;
            int end = N * 2;
            int result = 0;
            for(int i = start+1; i <= end; i++){
                if(!arr[i]){
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}

