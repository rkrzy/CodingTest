import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for(int i = 0; i < arr.length; i++){
            boolean flag = true;
            for(int j = 2; j * j <= arr[i]; j++){
                if(arr[i] % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag && arr[i] != 1){
                result++;
            }
        }
        System.out.println(result);

    }

}
