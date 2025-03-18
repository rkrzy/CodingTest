import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
- (최적화 문제) N개를 만들 수 있는 랜선의 최대 길이
- (결정 문제) 랜선의 길이가 X일 때 랜선이 N개 이상인가 아닌가.
- 그래프가 감소 혹은 증가함수일때 가능하다 -> 답이 여러개가 나올 수 있기 때문이다.
 */
public class Main {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");

        int K = Integer.parseInt(str[0]);
        int N = Integer.parseInt(str[1]);
        int[] arr = new int[K];
        long max = 0;
        for(int i = 0; i < K; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]){
                max = arr[i];
            }
        }

        long min = 1;
        long mid = 0;

        while(min <= max) {
            mid = (max + min) / 2;
            long count = 0;
            for(int i = 0; i < arr.length; i++){
                count += (arr[i] / mid);
            }

            if(count < N){
                max = mid - 1;
            }
            else{
                min = mid + 1;
            }
        }

        System.out.println(max);
    }

}

