import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       int back;
       int front;
       int N;
       int result = 0;
       N = scanner.nextInt();
       int []arr = new int[N];
       for(int i = 0; i <N;i++)
       {
           arr[i] = scanner.nextInt();
       }
       back = arr[0];
       arr[0] = 0;
       for(int i = 1; i < N; i++)
       {
           front = arr[i];

           if(front - back > 0)
           {
               arr[i] = front - back;
           }
           else
           {
               arr[i] = 0;
           }
           if(arr[i] > result)
           {
               result = arr[i];
           }
           back = back<front ? back : front;
       }
     
       System.out.println(result);
    }

}