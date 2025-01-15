import java.util.Scanner;

public class Main {


    //처음에 내가 작성한 O(N^2)복잡도로 계산하는 동작
    public static int func2(int arr[], int N)
    {
        for(int i = 0;i<N-1;i++)
        {
            for(int j = i+1;j<N;j++)
            {
                if(arr[i] + arr[j] == 100)
                {
                    return 1;
                }
            }
        }
        return 0;
    }
    //개선해서 O(N)의 시간복잡도로 계산하는 동작
    public static int func2_improve(int arr[], int N)
    {
        int[] number = new int[101];
        for(int i = 0; i < N; i++)
        {
             number[arr[i]] = 1;
             if(number[100 - arr[i]] == 1)
             {
                 return 1;
             }
        }
        return 0;
    }
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 99;
        arr[2] = 3;
        arr[4] = 12;
        if(func2(arr,5) == 1)
        {
            System.out.println("있다.");
        }
        else {
            System.out.println("없다.");
        }
        if(func2_improve(arr, 5) == 1)
        {
            System.out.println("있다.");
        }
        else {
            System.out.println("없다.");
        }
    }
}