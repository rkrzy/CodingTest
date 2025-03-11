import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {


    static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    static int lcm(int a, int b){
        return a * b / gcd(a,b);
    }
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int big = Math.max(a,b);
        int small = Math.min(a,b);

        System.out.println(gcd(big, small));
        System.out.println(lcm(big, small));
    }
}
