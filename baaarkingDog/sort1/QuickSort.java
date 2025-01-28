import java.io.*;


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

        arr = new int[]{0,-1,20,12,14,1463,14,11,25,66};
        quickSort(0, 10);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
