import java.io.*;
import java.util.Stack;


public class Main {

    static class Pair{
        int index;
        int num;
        Pair(int index, int num)
        {
            this.index = index;
            this.num = num;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Pair[] arr = new Pair[N];
        int[] result= new int[N];
        String[] str = br.readLine().split(" ");
        for(int i = 0; i < N ; i++){
            arr[i] = new Pair(i, Integer.parseInt(str[i]));
        }

        Stack<Pair> stack = new Stack<>();
        for(int i = 0; i < N; i++){
            if(stack.isEmpty()){
                stack.add(arr[i]);
            }
            if(stack.peek().num > arr[i].num){
                stack.add(arr[i]);
            }
            else if(stack.peek().num <= arr[i].num){
                while(!stack.isEmpty() &&stack.peek().num < arr[i].num){
                    Pair p = stack.pop();
                    result[p.index] = arr[i].num;
                }
                stack.add(arr[i]);
            }
        }
        for(Pair p : stack){
            result[p.index] = -1;
        }
        for(int num : result){
            bw.write(num + " ");
        }

        bw.close();
        br.close();
    }

}

