import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        int temp = 0;
        int[] arr= new int[N];

        for(int i = 0;i<N;i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0;i<N;i++)
        {
            for(int j = i+1;j<N;j++) {
                if(arr[i] > arr[j])
                {
                    temp++;
                }
                else
                {
                    break;
                }
            }
            if(result < temp)
            {
                result = temp;
            }
            temp = 0;
        }
        System.out.println(result);

    }
}