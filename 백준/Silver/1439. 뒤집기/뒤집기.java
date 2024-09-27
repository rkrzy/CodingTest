import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int []arr = new int[2];
        Scanner scanner = new Scanner(System.in);
        String str;
        str = scanner.next();
        arr[0] = 0;
        arr[1] = 0;
        if(str.charAt(0) == '0')
        {
            arr[0]++;
        }
        else
        {
            arr[1]++;
        }
        for(int i = 1;i<str.length();i++)
        {
            if(str.charAt(i-1) == '0'&&str.charAt(i) == '1')
            {
                arr[1]++;
            }
            if(str.charAt(i-1) == '1' && str.charAt(i) == '0')
            {
                arr[0]++;
            }
        }
        if(arr[0]>arr[1])
        {
            System.out.println(arr[1]);
        }
        else
        {
            System.out.println(arr[0]);
        }

    }
}