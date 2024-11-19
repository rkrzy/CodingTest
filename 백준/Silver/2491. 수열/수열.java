import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = 0;
        int temp = 1;
        int []arr = new int[N];
        for(int i = 0;i < N; i++)
        {
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < N-1; i++)
        {
            if(arr[i] <= arr[i+1])
            {
                temp++;
            }
            else
            {
                temp = 1;
            }
            if(result < temp)
            {
                result = temp;
            }
        }
        temp = 1;
        for(int i = 0;i<N-1;i++)
        {
            if(arr[i] >= arr[i+1])
            {
                temp++;
            }
            else
            {
                temp = 1;
            }
            if(result < temp)
            {
                result = temp;
            }
        }
        if(result == 0)
        {
            result = 1;
        }
        System.out.println(result);





    }
}