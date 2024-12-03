import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int result = 1;

        for(int i = 0; i<str.length()-1;i++)
        {
            if((int)str.charAt(i+1) <= (int)str.charAt(i))
            {
                result++;
            }
        }
        System.out.println(result);



    }
}