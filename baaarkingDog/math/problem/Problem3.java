import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {
    static int GCD(int a, int b){
        if(b == 0) return a;
        return GCD(b, a%b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String[] str = br.readLine().split(" ");
            int N = Integer.parseInt(str[0]);
            long result = 0;
            for(int j = 1; j < str.length; j++){
                for(int k = j + 1; k < str.length; k++){
                    int big = Math.max(Integer.parseInt(str[j]), Integer.parseInt(str[k]));
                    int small = Math.min(Integer.parseInt(str[j]), Integer.parseInt(str[k]));
                    result += GCD(big, small);
                }
            }
            System.out.println(result);
        }
    }
}

