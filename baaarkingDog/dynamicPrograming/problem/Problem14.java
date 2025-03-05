import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        String[] str = br.readLine().split(" ");
        int[] arr = new int[N + 1];
        int maxSize = 1;
        //입력받은 값을 저장하는 과정
        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(str[i-1]);
        }
        dp[1] = 1; //가장 처음의 길이는 무조건 0이다.

        for(int i = 1; i <= N; i++){
            dp[i] = 1;
            for(int j = i-1; j > 0; j--){
                if(arr[j] < arr[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    maxSize = Math.max(dp[i],maxSize);
                }
            }
        }
        System.out.println(maxSize);
        Stack<Integer> stack = new Stack<>();
        for(int i = N; i > 0; i--){
            if(dp[i] == maxSize){
                stack.push(arr[i]);
                maxSize--;
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+ " ");
        }
    }

}
