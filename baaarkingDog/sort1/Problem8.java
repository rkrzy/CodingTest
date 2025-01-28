import java.io.*;

public class Main {
    static Coordinate[] arr;
    static Coordinate[] temp;
    static class Coordinate{
        int x;
        int y;
        Coordinate(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static void merge(int start, int end)
    {
        int mid = (start + end)/2;
        int lIdx = start;
        int rIdx = mid;
        for(int i = start; i <end; i++){
            if(rIdx == end)temp[i] = arr[lIdx++];
            else if(lIdx == mid)temp[i] = arr[rIdx++];
            else if(arr[lIdx].y < arr[rIdx].y)temp[i] = arr[lIdx++];
            else if(arr[lIdx].y > arr[rIdx].y)temp[i] = arr[rIdx++];
            else {
                if(arr[lIdx].x >= arr[rIdx].x)temp[i] = arr[rIdx++];
                else temp[i] = arr[lIdx++];
            }
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
        String[] str;
        arr = new Coordinate[N];
        temp = new Coordinate[N];
        for(int i = 0; i < N;i++)
        {
            str = br.readLine().split(" ");
            arr[i] = new Coordinate(Integer.parseInt(str[0]), Integer.parseInt(str[1]) );
        }
        mergeSort(0, N);
        for(Coordinate cor : arr){
            bw.append(cor.x + " " + cor.y + "\n");
        }
        bw.flush();

        br.close();
        bw.close();


    }
}
