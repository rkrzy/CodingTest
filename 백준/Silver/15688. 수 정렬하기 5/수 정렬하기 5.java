import java.io.*;

public class Main {
    static int[] arr;
    static int[] temp;

    static void merge(int start, int end)
    {
        int mid = (start + end)/2;
        int lIdx = start;
        int rIdx = mid;
        for(int i = start; i <end; i++){
            if(rIdx == end)temp[i] = arr[lIdx++];
            else if(lIdx == mid)temp[i] = arr[rIdx++];
            else if(arr[lIdx] <= arr[rIdx])temp[i] = arr[lIdx++];
            else temp[i] = arr[rIdx++];
        }
        for(int i = start; i < end; i++) arr[i] = temp[i];
    }
    static void mergeSort(int start, int end)
    {
        if(start + 1 == end)return;
        int mid = (start + end)/2;
        mergeSort(start, mid);
        mergeSort(mid, end);
        merge(start, end);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        temp = new int[N];
        for(int i = 0; i < N;i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }
        mergeSort(0, N);
        for(int num : arr){
            bw.append(num + "\n");
        }
        bw.flush();

        br.close();
        bw.close();


    }
}
