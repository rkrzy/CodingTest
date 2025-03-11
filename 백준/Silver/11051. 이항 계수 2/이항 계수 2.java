import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int[][] comb = new int[1002][1002];

        for(int i = 1; i <= 1000; i++){
            comb[i][0] = comb[i][i] = 1;
            for(int j = 1; j < i ; j++){
                comb[i][j] = (comb[i-1][j] + comb[i-1][j-1])%10007;
            }
        }
        System.out.println(comb[N][K]);

        }
    }

