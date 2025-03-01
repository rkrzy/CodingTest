import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static class Pair{
        public int start;
        public int end;
        Pair(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int result = 0;

        Pair[] arr = new Pair[N];

        for(int i = 0; i < N; i++){
            String[] str = br.readLine().split(" ");
            arr[i] = new Pair(Integer.parseInt(str[0]),Integer.parseInt(str[1]));
        }

        Arrays.sort(arr, Comparator.comparingInt((Pair pair) -> pair.end)
                .thenComparingInt(pair -> pair.start));

        int temp = 0;
        for(int i = 0; i < N; i++){
            if(temp > arr[i].start)continue;
            result++;
            temp = arr[i].end;
        }

        System.out.println(result);
    }

}
