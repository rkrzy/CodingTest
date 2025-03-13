import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        long result = 0;
        long A = Long.parseLong(str[0]);
        long B = Long.parseLong(str[1]);
        long N = (long) Math.sqrt(B);

        boolean[] prime = new boolean[(int)(N + 1)];
        for (int i = 2; i <= N; i++) {
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i * i <= N; i++) {
            if (!prime[i]) continue;
            for (int j = i + i; j <= N; j += i) {
                prime[j] = false;
            }
        }
        for(long i = 2; i < prime.length; i++){
            if(prime[(int)i]){
                long temp = i * i;
                while(temp <= B){
                    if(temp >= A){
                        result++;
                    }
                    if(temp > B / i) break;
                    temp *= i;
                }
            }
        }

        System.out.println(result);
    }
}

