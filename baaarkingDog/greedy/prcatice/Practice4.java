import java.io.*;
import java.util.Arrays;
import java.util.Comparator;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int[] B = new int[N];

        int result = 0;

        String[] str = br.readLine().split(" ");
        String[] str2 = br.readLine().split(" ");

        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(str[i]);
            B[i] = Integer.parseInt(str2[i]);
        }
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < N; i++){
            result += A[i] * B[N-i-1];
        }

        System.out.println(result);

    }

}
