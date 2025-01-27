import java.io.*;
import java.util.Arrays;

public class Main {
    static int k;
    static int[] arr;
    static int[] temp;
    static boolean[] visit;
    static final int MAX_NUM = 6;
    static StringBuilder sb = new StringBuilder();

    static void func(int depth, int start){
        if(depth == MAX_NUM){
            for(int i = 0; i < MAX_NUM; i++){
                sb.append(temp[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = start; i < k;i++){
            if(!visit[i])
            {
                temp[depth] = arr[i];
                visit[i] = true;
                func(depth+1, i);
                visit[i] = false;
            }

        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str;

        while(true){
            str = br.readLine().split(" ");
            k = Integer.parseInt(str[0]);
            if(k == 0)break;
            arr = new int[k];
            temp = new int[k];
            visit = new boolean[k];
            for(int i = 0 ; i < k; i++){
                arr[i] = Integer.parseInt(str[i+1]);
            }
            Arrays.sort(arr);
            func(0, 0);
            sb.append("\n");
        }
        
        System.out.println(sb);

    }
}
