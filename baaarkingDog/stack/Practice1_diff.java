import java.io.*;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Number> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        String str;
        for(int i = 0;i<N;i++)
        {
            str = br.readLine();
            String[] command = str.split(" ");
            switch(command[0]){
                case "push":
                    stack.push(Integer.parseInt(command[1]));
                    break;
                case "pop":
                    if(stack.isEmpty()){
                        bw.write(-1 + "\n");
                    }
                    else
                    {
                        bw.write(String.valueOf(stack.pop())+"\n");
                    }
                    break;
                case "size":
                    bw.write(String.valueOf(stack.size())+"\n");
                    break;
                case "empty":
                    if(stack.empty())
                    {
                        bw.write(String.valueOf(1)+"\n");
                    }
                    else
                    {
                        bw.write(String.valueOf(0)+"\n");
                    }

                    break;
                default:
                    bw.write(String.valueOf(stack.peek())+"\n");
                    break;
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }
}