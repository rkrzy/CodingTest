import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        String str;
        String str2;
        for(int i = 0;i<N;i++)
        {
            st = new StringTokenizer(br.readLine());
            str = st.nextToken();
            str2 = st.nextToken();
            System.out.print("Distances: ");

            for(int j = 0;j<str.length();j++)
            {
                if((int)str.charAt(j) <= (int)str2.charAt(j))
                {
                    System.out.print(((int)str2.charAt(j) - 65) - ((int)str.charAt(j) - 65));
                }
                else
                {
                    System.out.print(((int)str2.charAt(j) - 65) + 26 - ((int)str.charAt(j) - 65));
                }
                System.out.print(" ");
            }
            System.out.println();
        }







    }
}