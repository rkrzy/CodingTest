import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static List<Integer> list = new ArrayList<>();
    static int solution(int num){
        int start = 0;
        int end = list.size();
        while(start < end){
            int mid = (start + end) / 2;
            if(list.get(mid) >= num){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] findArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            findArr[i] = arr[i];
        }
        Arrays.sort(arr);


        int temp = arr[0];
        list.add(temp);
        for(int i =1 ; i < arr.length ; i++){
            if(temp != arr[i]){
                temp = arr[i];
                list.add(temp);
            }
        }
        for(int i = 0; i < findArr.length; i++){
            bw.write(solution(findArr[i]) + " ");
        }
        bw.close();

    }



}

