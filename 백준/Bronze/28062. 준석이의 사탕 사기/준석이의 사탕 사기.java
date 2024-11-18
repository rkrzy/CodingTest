import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        N = scanner.nextInt();
        int result = 0;
        int temp = 0;
        List<Integer> arr = new ArrayList();
        for(int i = 0; i < N;i++)
        {
            temp = scanner.nextInt();
            if(temp % 2 == 0)
            {
                result += temp;
            }
            else
            {
                arr.add(temp);
            }
        }
        Collections.sort(arr);
        if(result == 0&&arr.size() == 1)
        {
            System.out.println(0);
        }
        else
        {
            if(arr.size() % 2 == 0)
            {
                for(int i = 0;i<arr.size();i++)
                {
                    result += arr.get(i);
                }
            }
            else
            {
                for(int i = arr.size()-1;i>0;i--)
                {
                    result += arr.get(i);
                }
            }
            System.out.println(result);
        }



    }
}