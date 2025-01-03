import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr= new int[26];

        String str = scanner.next();

        for(int i = 0;i<str.length();i++)
        {
            arr[(int)str.charAt(i) - 97]++;
        }
        for(int i = 0;i<26;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}