import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       int A = scanner.nextInt();
       int B = scanner.nextInt();
       int C = scanner.nextInt();
       int M = scanner.nextInt();

       int fatigue  = 0;
       int result = 0;
       int time = 0;

       while(time < 24)
       {
           if(A > M)
           {
               break;
           }
           if(fatigue + A <= M)
           {
                result = result + B;
                fatigue = fatigue + A;
           }
           else
           {
               if(fatigue - C >= 0)
               {
                   fatigue = fatigue - C;
               }
               else
               {
                   fatigue = 0;
               }
           }
           time++;
       }
       System.out.println(result);
    }
}