import java.io.*;


public class Main {
    static int[] arr;
    static int[] temp;
    static void merge(int start, int end){
        int mid = (start + end)/2;
        int lIdx = start;
        int rIdx = mid;
        for(int i = start; i < end; i++){
            if(rIdx == end)temp[i] = arr[lIdx++];
            else if(lIdx == mid) temp[i] = arr[rIdx++];
            else if(arr[lIdx] <= arr[rIdx]) temp[i] = arr[lIdx++];
            else temp[i] = arr[rIdx++];
        }
        for(int i = start; i < end; i++) arr[i] = temp[i];
    }
    static void mergeSort(int start, int end){
        if(end == start + 1){
            return;
        }
        int mid = (start + end)/2;
        mergeSort(start, mid);
        mergeSort(mid, end);
        merge(start, end);
    }

    public static void main(String[] args) throws IOException {

        arr = new int[]{0,-1,20,12,14,1463,14,11,25,66};
        temp = new int[10];

    }
}
