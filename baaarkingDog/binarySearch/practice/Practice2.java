import java.io.*;
import java.util.*;

public class Main {
        static int[] arr;
        static int solution(int target){
            int start = 0;
            int end = arr.length;

            while(start < end){
                int mid = (start + end) / 2;
                if(arr[mid] >= target) end = mid;
                else start = mid + 1;
            }
            return start;
        }
        static int solution2(int target){
            int start = 0;
            int end = arr.length;
            while(start < end){
                int mid = (start + end) / 2;
                if(arr[mid] > target) end = mid;
                else start = mid + 1;
            }
            return start;
        }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());

        int[] findArr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for(int i = 0 ; i < M; i++){
            bw.write(solution2(findArr[i]) - solution(findArr[i]) + " ");
        }
        bw.close();
    }



}

