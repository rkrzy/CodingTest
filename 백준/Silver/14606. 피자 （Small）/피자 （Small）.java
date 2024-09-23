import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num1 = 0;
        int num2 = 0;
        int []arr = new int[11];
        arr[1] = 0;
        arr[2] = 1;
        arr[3] = 3;
        arr[4] = 6;
        for(int i = 5;i<=N;i++)
        {
            if(i%2 == 1)
            {
                num1 = (i/2) + 1;
            }
            else
            {
                num1 = i/2;
            }
            num2 = i/2;
            arr[i] = (num1*num2) + arr[num1] + arr[num2];

        }
        System.out.println(arr[N]);


    }
}