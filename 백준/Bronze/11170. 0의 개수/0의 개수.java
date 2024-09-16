import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int T;
       int N;
       int M;
       int save = 0;
       int result = 0;
       Scanner scanner = new Scanner(System.in);
       T = scanner.nextInt();
       for(int i = 0;i<T;i++)
       {
           N = scanner.nextInt();
           M = scanner.nextInt();
               for(int j = N; j <= M;j++)
               {
                   save = j;
                   if(j == 0)
                   {
                       result++;
                   }
                   while(save > 0)
                   {
                       if(save % 10 == 0)
                       {
                           result++;
                       }
                       save /= 10;
                   }
               }
           System.out.println(result);
           result = 0;
       }
    }
}