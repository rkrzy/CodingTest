import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] arr = new int[]{3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        int [] save = new int[4001];
        int num1 = 1;
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        String name2 = scanner.next();
        for(int i = 0;i<name1.length();i++)
        {
            save[num1] = arr[name1.charAt(i)-65];
            num1++;
            save[num1] = arr[name2.charAt(i)-65];
            num1++;
        }
        num1--;
        while(num1 > 2)
        {
            for(int i = 1;i<num1;i++)
            {
                save[i] = (save[i] + save[i+1])%10;
            }
            num1--;
        }
        System.out.print(save[1]);
        System.out.println(save[2]);


    }
}