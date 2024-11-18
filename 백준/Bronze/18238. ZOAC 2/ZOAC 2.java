import java.util.Scanner;
import java.util.Arrays;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        char []arr  = {'0', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String str;
        int result = 0;
        int current = 1; //A부터 시작하기
        int small = 0;
        int big = 0;
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            for(int j = 1;j<27;j++)
            {
                if(arr[j] == ch)
                {
                    index = j;
                    break;
                }
            }
            small = min(current, index);
            big = max(current, index);
            result = result + (big - small < small + (26 - big) ? big - small : small + (26 - big));
            current = index;
        }
        System.out.println(result);

    }
}