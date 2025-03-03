import java.io.*;
import java.util.Arrays;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            long result = 0;

            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int max = arr[N-1];
            for(int j = N-2; j >= 0; j--){
                if(arr[j] <= max){
                    result += max - arr[j];
                }
                else{
                    max = arr[j];
                }
            }

            System.out.println(result);
        }
    }

}
