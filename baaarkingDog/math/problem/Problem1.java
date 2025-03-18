import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        boolean[] arr = new boolean[N + 1];
        for(int i = 0; i <= N; i++){
            arr[i] = false;
        }
        for(int i = 2; i <= N; i++){
            if(arr[i])continue;
            for(int j = i; j <= N; j = j + i){
                if(!arr[j]){
                    arr[j] = true;
                    K--;
                }
                if(K == 0){
                    System.out.println(j);
                    return;
                }
            }
        }
        }
    }

