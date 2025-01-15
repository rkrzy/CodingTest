import java.io.*;


public class Main {

    static long multiple(long A, long B, long C){
        if(B == 1) return A % C;
        long result = multiple(A, B/2, C);
        result = result * result % C;
        if(B%2 == 0) return result;
        else
        {
            return result * A % C;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        long A = Integer.parseInt(str[0]);
        long B = Integer.parseInt(str[1]);
        long C = Integer.parseInt(str[2]);
        long result = 0;
        result = multiple(A, B, C);

        System.out.println(result);
    }
}