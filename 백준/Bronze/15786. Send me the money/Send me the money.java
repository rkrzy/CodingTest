import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int temp = 0;

        String text = br.readLine();
        String[] arr = new String[M];

        for(int i = 0;i<M;i++)
        {
            arr[i] = br.readLine();
            for(int j = 0;j<arr[i].length();j++)
            {
                if(arr[i].charAt(j) == text.charAt(temp))
                {
                    temp++;
                    if(temp == text.length())
                    {
                        break;
                    }
                }
            }
            if(temp == text.length())
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
            temp = 0;
        }



    }
}