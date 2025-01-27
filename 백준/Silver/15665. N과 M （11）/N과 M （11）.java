import java.io.*;
import java.util.Arrays;

public class Main {

    static int N;
    static int M;
    static int[] arr;
    static int[] temp;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    static void func(int depth){
        if(depth == M){
            for(int i = 0;i < depth; i++){
                sb.append(temp[i] + " ");
            }
            sb.append("\n");
            return;
        }
        int front = 0;
        for(int i = 0; i < N; i++){
            if(arr[i] !=front)
            {
                temp[depth] = arr[i];
                visit[i] = true;
                front = arr[i];
                func(depth+1);
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        arr = new int[N];
        temp = new int[N];
        visit = new boolean[N];
        str = br.readLine().split(" ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);

        func(0);
        System.out.println(sb);
    }
}
