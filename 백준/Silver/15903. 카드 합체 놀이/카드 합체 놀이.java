import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        long result = 0;

        str = br.readLine().split(" ");

        long[] arr = Arrays.stream(str).mapToLong(Long::parseLong).toArray();
        Arrays.sort(arr);
        for(int i = 0; i < M; i++){
            long plus = arr[0] + arr[1];
            arr[0] = plus;
            arr[1] = plus;
            Arrays.sort(arr);
        }
        for(long num : arr){
            result += num;
        }
        System.out.println(result);

    }
}
