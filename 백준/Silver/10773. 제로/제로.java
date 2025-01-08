import java.io.*;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Number> stack = new Stack<>();

        int num = Integer.parseInt(br.readLine());
        int command;
        int result = 0;

        for(int i = 0; i<num;i++)
        {
            command = Integer.parseInt(br.readLine());
            if(command == 0)
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            else{
                stack.push(command);
            }
        }
        while(!stack.isEmpty())
        {
            result += (int)stack.pop();
        }
        bw.write(String.valueOf(result));
        bw.flush();

        br.close();
        bw.close();
    }
}