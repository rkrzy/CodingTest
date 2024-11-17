import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int H;
       int Y;
       double interest = 0;
       double total = 0;

       int []arr = new int[11];
       H = scanner.nextInt();
       Y = scanner.nextInt();
       arr[0] = H;
       arr[1] = (int)(H * 1.05);
       arr[2] = (int)(arr[1] * 1.05);
       for(int i = 3;i<=Y;i++)
       {
           if(i >= 5 && interest < arr[i-5] * 1.35)
           {
                interest = arr[i-5] * 1.35;
           }
           if(i >= 3 && interest < arr[i-3] * 1.20)
           {
                interest = arr[i-3] * 1.20;
           }
           if(interest < arr[i-1] * 1.05)
           {
               interest = arr[i-1] * 1.05;
           }
           arr[i] = (int)interest;

       }
       System.out.println(arr[Y]);
    }
}