import java.io.*;
import java.util.Scanner;


public class Main {
    static int[] arr;
    static int[] temp;

    static void merge(int start, int end){
        int mid = (start + end)/2;
        int lIdx = start;
        int rIdx = mid;
        for(int i = start; i < end; i++){
            if(rIdx == end) temp[i] = arr[lIdx++];
            else if(lIdx == mid) temp[i] = arr[rIdx++];
            else if(arr[lIdx] <= arr[rIdx]) temp[i] = arr[lIdx++];
            else temp[i] = arr[rIdx++];
        }
        for(int i = start; i < end; i++)arr[i] = temp[i];
    }
    static void mergeSort(int start, int end){
        if(start + 1 == end){return;}
        int mid = (start + end)/2;
        mergeSort(start,mid);
        mergeSort(mid, end);
        merge(start,end);
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = scanner.nextInt();
        arr = new int[N];
        temp = new int[N];
        for(int i = 0;i < N;i++){
            arr[i] = scanner.nextInt();
        }
        mergeSort(0, N);
        for(int num : arr){
            sb.append(num + "\n");
        }
        System.out.println(sb);

    }
}
