import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       int N;
       N = scanner.nextInt();
       int result = 0;
       int []arr = new int[N];
       int chance = 0;
       int front = 0;
       int back = N-1;
       for(int i = 0;i<N;i++)
       {
           arr[i] = scanner.nextInt();
       }
       while(chance != N - 1)
       {
           if(arr[front] < arr[back])
           {
               result += arr[front];
               chance++;
               front++;
           }
           else
           {
               result += arr[back];
               chance++;
               back--;
           }
       }
       System.out.println(result);
    }
}