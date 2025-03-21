import java.io.*;


public class Main {

    public static int func(int n, int r, int c){

        if(n == 0){
            return 0;
        }
        int half = 1<<(n-1);
        if(half > r && half > c)return func(n-1, r, c);
        else if(half > r && half <= c) return half * half + func(n-1, r ,c-half);
        else if(half <= r && half > c) return 2 * half * half + func(n-1, r-half, c);
        else return 3 * half * half + func(n-1, r-half, c-half);
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int r = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);

        System.out.println(func(n,r,c));

    }
}