import java.io.*;
import java.util.Scanner;

public class Main {

    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
    //원판 n개를 a번 기둥에서 b번 기둥으로 옮기는 방법을 출력하는 함수
    static void hanoi(int a, int b, int n) throws IOException{
        if(n == 1){
            br.write(a + " " + b + "\n");
        }
        else
        {
            hanoi(a, 6-a-b, n-1);
            br.write(a + " " + b + "\n");
            hanoi(6-a-b,b,n-1);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        br.write((1<<N) -1 + "\n");

        hanoi(1,3,N);
        br.flush();
        br.close();
    }
}