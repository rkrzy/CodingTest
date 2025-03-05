import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = N-1; i >= 0; i--){
            int num = arr[i];
            for(int j = i -1 ; j >= 0; j--){
                if(arr[j] >= num){
                    result += arr[j] - num + 1;
                    arr[j] = num - 1;
                }
            }
        }
        System.out.println(Math.abs(result));



    }

}
