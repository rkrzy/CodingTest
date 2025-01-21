import java.io.*;
import java.util.Scanner;

public class Main {
    static int result = 0;
    public static void func(int cur,int n, boolean[] used1, boolean[] used2, boolean[] used3){
        if(cur == n){
            result++;
            return;
        }
        for(int i = 0;i < n; i++){
            if(used1[i] || used2[i + cur] || used3[cur-i+n-1]){continue;}
            used1[i] = true;
            used2[i+cur] = true;
            used3[cur-i+n-1] = true;
            func(cur+1, n, used1, used2, used3);
            used1[i] = false;
            used2[i + cur] = false;
            used3[cur-i+n-1] = false;
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean[] used1 = new boolean[40];
        boolean[] used2 = new boolean[40];
        boolean[] used3 = new boolean[40];
        func(0, n, used1, used2, used3);
        System.out.println(result);
    }
}