import java.io.*;


//게임은 상근이가 먼저 시작한다
//상근이가 이기면 SK
//창영이가 이기면 CY
//돌은 1, 3, 4개 가져갈 수 있다.

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[N+4];

        arr[1] = true;
        arr[2] = false;
        arr[3] = true;
        arr[4] = true;

        for(int i = 5;i<=N;i++)
        {
            if(arr[i-3] && arr[i-4] && arr[i-1])
            {
                arr[i] = false;
            }
            else
            {
                arr[i] = true;
            }
        }
        if(arr[N] == true)
        {
            System.out.println("SK");
        }
        else
        {
            System.out.println("CY");
        }

    }
}