import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        long []arr = new long[n+1];

        if(n<4)
        {
            for(int i = 1;i<=n;i++)
            {
                arr[i] = 1;
            }
        }
        else{
            arr[1] = 1;
            arr[2] = 1;
            arr[3] = 1;
            for(int i = 4;i<=n;i++){
                arr[i] = arr[i-1] + arr[i-3];
            }
        }


        System.out.println(arr[n]);







    }
}