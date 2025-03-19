import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;


public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        long total = 0;

        for(int i = 0; i < N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        for(int num : arr){
            if(stack.isEmpty()){
                stack.add(num);
            }
            else if(stack.peek() > num){
                total += stack.size();
                stack.add(num);
            }
            else if(stack.peek() <= num){
                while(!stack.isEmpty() && stack.peek() <= num){
                    stack.pop();
                }
                total += stack.size();
                stack.add(num);
            }
        }
        System.out.println(total);


        br.close();
    }

}

