import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int gcd(int a, int b){
        if(b == 0) return a;
        else return gcd(b, a%b);
    }
    static int lcm(int a, int b){
        return a * b / gcd(a,b);
    }
    static int solution(int M, int N, int x, int y){
        int l = lcm(M, N);
        for(int i = x; i <= l; i+=M){
            if((i-1) % N + 1  == y){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String[] str = br.readLine().split(" ");
            int M = Integer.parseInt(str[0]);
            int N = Integer.parseInt(str[1]);
            int x = Integer.parseInt(str[2]);
            int y = Integer.parseInt(str[3]);
            System.out.println(solution(M, N, x, y) );
        }
    }
}
