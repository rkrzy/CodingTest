import java.io.*;

public class Main {

    static int N;
    static int M;
    static int[] numbers;
    public static void func1(int depth,int start){
        if(depth == M){
            for(int i = 0; i < M; i++){
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = start;i <= N;i++){
                numbers[depth] = i;
                func1(depth+1, i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        numbers = new int[N + 1];
        func1(0, 1);
    }
}