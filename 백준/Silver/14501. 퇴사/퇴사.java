import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
//하루에 하나씩

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] T = new int[N];
        int[] P = new int[N];
        int[] result = new int[N+1];
        int max = 0;
        Arrays.fill(result, 0);//전부 0으로 초기화한다.

        for(int i = 0;i<N;i++)
        {
            st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0;i<N;i++)
        {
            if(i+T[i]<=N)
            {
                result[i+T[i]] = Math.max(result[i+T[i]], result[i] + P[i]);
            }

            result[i+1] = Math.max(result[i+1], result[i]);
        }
        System.out.println(result[N]);

    }
}