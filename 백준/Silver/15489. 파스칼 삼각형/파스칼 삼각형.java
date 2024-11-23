import java.io.*;
import java.util.StringTokenizer;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        int plus = 1;
        int R = Integer.parseInt(st.nextToken()); //줄의 번째 수
        int C = Integer.parseInt(st.nextToken()); //몇번째 수?
        int W = Integer.parseInt(st.nextToken()); //변에 포함하는 수의 개수


        int[][] arr = new int[R+W][R+W];
        arr[1][1] = 1;
        arr[2][1] = 1;
        arr[2][2] = 1;

        for(int i = 3;i<R+W;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                if(j == 1||j == i)
                {
                    arr[i][j] = 1;
                }
                else
                {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }
        for(int i = R;i<R+W;i++)
        {
            for(int j = C;j<C+plus;j++)
            {
                result += arr[i][j];
            }
            plus++;
        }
        System.out.println(result);



    }
}