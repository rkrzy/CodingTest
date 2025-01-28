import java.io.*;
import java.util.Scanner;


public class Main {
    static int[] arr;
    static void quickSort(int start, int end){
        if(end <= start + 1) return;
        int pivot = arr[start];
        int l = start+1;
        int r = end-1;
        int temp = 0;
        while(true){
            while(l <= r && arr[l] <= pivot) l++;
            while(l <= r && arr[r] >= pivot) r--;
            if(l > r)break;
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
        temp = arr[start];
        arr[start] = arr[r];
        arr[r] = temp;
        quickSort(start, r);
        quickSort(r+1, end);
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        arr = new int[N];
        for(int i = 0;i < N;i++){
            arr[i] = scanner.nextInt();
        }
        quickSort(0,N);
        for(int num : arr){
            System.out.println(num);
        }

    }
}
