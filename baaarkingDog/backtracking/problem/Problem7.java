import java.io.*;
import java.util.Arrays;

public class Main {

    static int N;
    static int M;
    static int[] numbers;
    static int[] save;
    public static void func1(int depth, int start) {
        if (depth == M) {
            for(int i = 0; i < M ;i ++){
                System.out.print(save[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = start;i<N;i++){
                save[depth] = numbers[i];
                func1(depth+1, i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        numbers = new int[N];
        save = new int[N];
        str = br.readLine().split(" ");
        for(int i = 0; i < N;i++)
        {
            numbers[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(numbers);
        func1(0, 0);
    }
}
