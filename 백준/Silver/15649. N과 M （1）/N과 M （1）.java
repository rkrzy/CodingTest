import java.io.*;
import java.util.Scanner;

public class Main {
    public static void func1(int k, int m, int n, int[] arr, boolean[] used){
        if(k == m){
            for(int i = 0;i < m;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 1; i <=n; i++){
            if(!used[i]){
                arr[k] = i;
                used[i] = true;
                func1(k+1, m, n, arr, used);
                used[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[10];
        boolean[] used = new boolean[10];
        func1(0,m,n,arr,used);
    }
}