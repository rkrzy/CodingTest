import java.io.*;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Number> stack = new Stack<>();

        int num = Integer.parseInt(br.readLine());
        int command = 0;
        int count = 0;
        int pos = 1;//이제 들어가야 하는 수

        String result = "";
        while(count < num)
        {
            command = Integer.parseInt(br.readLine());
            if(command == pos)
            {
                stack.push(pos);
                sb.append("+ \n");
                stack.pop();
                sb.append("- \n");
                pos++;
                count++;
            }
            else{
                if(command > pos)
                {
                    while(command >= pos)
                    {
                        stack.push(pos);
                        sb.append("+ \n");
                        pos++;
                    }
                    stack.pop();
                    sb.append("- \n");
                    count++;
                }
                else
                {
                    if(stack.peek().intValue() == command)
                    {
                        stack.pop();
                        sb.append("- \n");
                        count++;
                    }
                    else
                    {
                        sb.setLength(0);
                        sb.append("NO");
                        break;
                    }
                }
            }
        }

        System.out.println(sb.toString());

        br.close();
    }
}