import java.io.*;
import java.util.Arrays;

public class Main {

    static int N;
    static int M;
    static int front = 0;
    static int[] arr;
    static int[] temp;
    static boolean[] visit;

    static void func(int depth, int start){
        if(depth == M){
            for(int i = 0;i < depth; i++){
                System.out.print(temp[i] + " ");
            }
            front = temp[depth-1];
            System.out.println();
            return;
        }
        int front = 0;
        for(int i = start; i < N; i++){
            if(!visit[i] && front != arr[i])
            {
                temp[depth] = arr[i];
                visit[i] = true;
                front = arr[i];
                func(depth+1, i + 1);
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

        func(0, 0);
    }
}
