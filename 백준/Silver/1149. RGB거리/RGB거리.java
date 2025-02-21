import java.io.*;


/*
1. 테이블 정의하기 :
(1).D[i][0] = i번째 집까지 칠할 때 비용의 최솟값, 단 i번째 집은 빨강
(2).D[i][1] = i번째 집까지 칠할 때 비용의 최솟값, 단 i번째 집은 초록
(3).D[i][2] = i번째 집까지 칠할 때 비용의 최솟값, 단 i번째 집은 파랑
2. 점화식 찾기 :
(1).D[k][0] = min(D[k-1][1], D[k-1][2]) + R[k]
(2).D[k][1] = min(D[k-1][0], D[k-1][2]) + G[k]
(3).D[k][2] = min(D[k-1][0], D[k-1][1]) + B[k]


3. 초기값 정의하기 :
(1).D[1][0] = R[1]
(2).D[1][1] = G[1]
(3).D[1][2] = B[1]
*/

public class Main {

    static int[][] D;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        D = new int[n+1][3];
        String[] str = br.readLine().split(" ");

        D[1][0] = Integer.parseInt(str[0]);
        D[1][1] = Integer.parseInt(str[1]);
        D[1][2] = Integer.parseInt(str[2]);

        for(int i = 2; i <= n; i++){
            str = br.readLine().split(" ");
            D[i][0] = Math.min(D[i-1][1], D[i-1][2]) + Integer.parseInt(str[0]);
            D[i][1] = Math.min(D[i-1][0], D[i-1][2]) + Integer.parseInt(str[1]);
            D[i][2] = Math.min(D[i-1][0], D[i-1][1]) + Integer.parseInt(str[2]);
        }
        System.out.println(Math.min(D[n][0], Math.min(D[n][1], D[n][2])));


    }
}
