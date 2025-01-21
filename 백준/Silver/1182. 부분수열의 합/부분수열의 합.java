import java.io.*;
import java.util.Arrays;

public class Main {
    static int result = 0;

    public static void func1(int num,int current, int s,int n, int[] numbers){

        if(num == n){
            if(current == s)result++;
            return;
        }
        func1(num+1, current,s ,n, numbers);
        func1(num+1, current + numbers[num], s, n ,numbers);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int s = Integer.parseInt(str[1]);

        int[] numbers = Arrays.stream(br.readLine().split(" ")).
                mapToInt(Integer::parseInt).
                toArray();
        //Arrays.sort(numbers);

        func1(0,0,s, n, numbers);
        if(s == 0) result--;
        System.out.println(result);

    }
}