import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        char ch;
        Stack<Character> stack = new Stack();
        boolean result = true;
        while(true)
        {
            str = br.readLine();
            if(str.equals(".")){
                break;
            }
            for(int i = 0;i<str.length();i++)
            {
                ch = str.charAt(i);
                if(ch == '(' || ch == '['){
                    stack.push(ch);
                }
                else if(ch == ')'){
                    if(!stack.empty() && stack.peek() == '(' ){
                        stack.pop();
                    }
                    else
                    {
                        result = false;
                        break;
                    }
                }
                else if(ch == ']'){
                    if( !stack.empty() && stack.peek() == '[' ){
                        stack.pop();
                    }
                    else
                    {
                        result = false;
                        break;
                    }
                }
                if(ch != '.' && i == str.length()-1){
                    result = false;
                    break;
                }
            }
            if(!stack.empty()){
                result = false;
            }
            if(result){
                bw.write("yes"+"\n");
            }
            else
            {
                bw.write("no"+"\n");
            }
            result = true;
            stack.clear();
        }
        bw.flush();

        br.close();
        bw.close();
    }
}