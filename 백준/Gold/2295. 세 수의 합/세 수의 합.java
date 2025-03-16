import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
1. a[i] + a[j] + a[k] = a[l]만족하는 a[l]중에서 최댓값
2. O(N^4)풀이 : i,j ,k ,l에 대한 4중 for문
3. O(N^3logN)풀이 : i, j, k 3중 for문 a[i] + a[j] + a[k]가 배열 a에 있는지 이분탐색
4. two[m] + a[k] = a[l]을 만족하는 a[l]중에서 최댓값
5. O(N^2logN)풀이 : k, l 2중 for문, a[l] - a[k]가 배열 two에 있는지 이분탐색 log(N^2) = 2logN
 */
public class Main {
    static List<Integer> list = new ArrayList<>();

    public static boolean binarySearch(int num){
        int start = 0;
        int end = list.size() -1;
        boolean flag = false;
        while(start <= end){
            int mid = (start + end)/2;
            if(list.get(mid) < num){
                start = mid + 1;
            }
            else if(list.get(mid) > num){
                end = mid - 1;
            }
            else{
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];


        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                list.add(arr[i] + arr[j]);
            }
        }
        Collections.sort(list);
        for(int i = N - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(binarySearch(arr[i] - arr[j])){
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
    }

}

