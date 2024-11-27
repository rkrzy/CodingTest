import java.io.*;


//사과 : A
//파인애플 : P
//펜 : p
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "pPAp";
        int N = Integer.parseInt(br.readLine());
        int num = 0;
        int result = 0;
        String str = br.readLine();

        for(int i = 0;i<N;i++)
        {

            if(str.charAt(i) == 'p')
            {
                for(int j = i;j < N && num < 4;j++)
                {
                    if(str.charAt(j) == answer.charAt(num))
                    {
                        num++;
                    }
                    else
                    {
                        num = 0;
                        break;
                    }
                }
            }
            if(num > 3)
            {
                result++;
                i = i+3;
                num = 0;
            }

        }
        System.out.println(result);





    }
}