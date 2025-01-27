import java.io.*;

public class Main {

    static int N;
    static int M;
    static int[] numbers;
    static boolean[] visit;
    static StringBuilder stringBuilder = new StringBuilder();
    public static void func1(int depth,int start){
        if(depth == M){
            for(int i = 0; i < M; i++){
                stringBuilder.append(numbers[i] + " ");
            }
            stringBuilder.append("\n");
            return;
        }
        for(int i = 1;i <= N;i++){
                numbers[depth] = i;
                visit[i] = true;
                func1(depth+1, i+1);
                visit[i] = false;

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        numbers = new int[N + 1];
        visit = new boolean[N + 1];
        func1(0, 1);

        System.out.println(stringBuilder);
    }
}