import java.io.*;
import java.util.Arrays;

public class Main {

    static int N;
    static int M;
    static int[] numbers;
    static int[] save;
    static boolean[] visit;
    public static void func1(int depth) {
        if (depth == M) {
            for(int i = 0; i < M ;i ++){
                System.out.print(save[i] + " ");
            }
            System.out.println();
        }
        for(int i = 0;i<N;i++){
            if(!visit[i]){
                save[depth] = numbers[i];
                visit[i] = true;
                func1(depth+1);
                visit[i] = false;
            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        numbers = new int[N];
        visit = new boolean[N];
        save = new int[N];
        str = br.readLine().split(" ");
        for(int i = 0; i < N;i++)
        {
            numbers[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(numbers);
        func1(0);
        }
    }
