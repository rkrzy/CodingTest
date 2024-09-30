import java.util.Scanner;
import java.io.*;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) throws IOException{
        int N;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        boolean flag = true;
        int [][] arr = new int[N][3];
        int [] result = new int[N];
        for(int i = 0;i<N;i++)
        {
            for(int j = 0;j<3;j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i<3;i++)
        {
            for(int j = 0;j<N;j++)
            {
                for(int k = 0;k < N;k++)
                {
                    if(arr[j][i] == arr[k][i] && j != k)
                    {
                        flag = false;
                        break;
                    }
                    else
                    {
                        flag = true;
                    }
                }
                if(flag)
                {
                    result[j] += arr[j][i];
                }
            }
        }
        for(int i = 0;i<N;i++)
        {
            System.out.println(result[i]);
        }
    }
}