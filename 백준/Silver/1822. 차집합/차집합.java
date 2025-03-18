import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    static long[] arrA;
    static long[] arrB;

    static int nA;
    static int nB;
    static int result = 0;
    static boolean solution(long num){
        int start = 0;
        int end = nB - 1;

        while(start <= end){
            int mid = (start + end) / 2;
            if(mid < 0 || mid >= nB){
                break;
            }
            if(num < arrB[mid]){
                end = mid - 1;
            }
            else if(num > arrB[mid]){
                start = mid + 1;
            }
            else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Long> list = new ArrayList<>();

        String[] str = br.readLine().split(" ");
        nA = Integer.parseInt(str[0]);
        nB = Integer.parseInt(str[1]);

        arrA = new long[nA];
        arrB = new long[nB];

        str = br.readLine().split(" ");
        for(int i = 0; i < nA; i++){
            arrA[i] = Integer.parseInt(str[i]);
        }
        str = br.readLine().split(" ");
        for(int i = 0; i < nB; i++){
            arrB[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        for(int i = 0; i < nA; i++){
            if(!solution(arrA[i])){
                list.add(arrA[i]);
                result++;
            }
        }
        System.out.println(result);
        int cnt = 0;
        for(Long num : list){
            bw.write(num + (cnt == result - 1 ? "\n" : " "));
            cnt++;
        }
        bw.flush();
        bw.close();
    }

}

