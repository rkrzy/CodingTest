import java.io.*;
import java.util.Scanner;

public class Main {

    static int chance0 = 0;
    static int chance1 = 0;
    public static void func1(int num,int row, int col, int[][] paper){
        int temp = paper[row][col];
            for(int i = row; i<num + row;i++)
            {
                for(int j = col; j< num + col; j++){
                    if(paper[i][j] != temp){
                        func1(num/2, row, col, paper);
                        func1(num/2, row + num/2, col + num/2, paper);
                        func1(num/2, row, col + num/2, paper);
                        func1(num/2, row + num/2, col, paper);
                        return;
                    }
                }
            }
            if(temp == 1)
            {
                chance1++;
            }
            else
            {
                chance0++;
            }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] paper = new int[N][N];
        for(int i = 0; i < N; i++){
            String[] str = br.readLine().split(" ");

            for(int j = 0; j < N; j++){
                paper[i][j] = Integer.parseInt(str[j]);
            }
        }

        func1(N, 0,0, paper);
        System.out.println(chance0);
        System.out.println(chance1);
    }
}