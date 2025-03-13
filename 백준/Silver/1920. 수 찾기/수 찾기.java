import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());

        int[] findArr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for(int i = 0; i < findArr.length; i++){
            boolean flag = false;
            int start = 0;
            int end = arr.length-1;
            while(start <= end){
                int mid = (start + end) / 2;
                if(findArr[i] > arr[mid]){
                    start = mid + 1;
                }else if(findArr[i] < arr[mid]){
                    end = mid - 1;
                }
                else{
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }

    }


}

