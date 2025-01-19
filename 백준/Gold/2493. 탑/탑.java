import java.io.*;
import java.util.Stack;


public class Main {
    static class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        public int getX(){return x;}
        public int getY(){return y;}
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        String[] str = br.readLine().split(" ");
        int i = 0;
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(100000000, i));
        for(String temp : str){
            i++;
            while(stack.peek().getX()<Integer.parseInt(temp)){
                stack.pop();
            }
            System.out.print(stack.peek().getY()+" ");
            stack.push(new Pair(Integer.parseInt(temp), i) );
        }




    }
}