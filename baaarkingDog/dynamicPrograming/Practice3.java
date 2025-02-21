import java.io.*;
import java.util.Scanner;

//1. 테이블 정의하기 : D[i] : i칸을 밟았을때 가지는 최솟값을 구하자
//2. 점화식 찾기 : DP[i-3] + DP[i-1] vs DP[i-2]

//3. 초기값 정의하기 :
//(0). D[1] : D[1]
//(1). D[2] : D[1] + D[2]


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N+1];
        int[] DP = new int[N+1];

        for(int i = 1;i<=N;i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }
        DP[1] = arr[1];

        if(N >= 2)
        {
            DP[2] = arr[1] + arr[2];
        }
        for(int i = 3;i<=N;i++)
        {
            DP[i] = Math.max(DP[i-2], DP[i-3] + arr[i - 1]) + arr[i];
        }
        System.out.println(DP[N]);
    }
}
