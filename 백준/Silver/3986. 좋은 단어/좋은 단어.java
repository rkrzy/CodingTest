import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String str;
        char ch;
        boolean result = true;
        int chance = 0;

        Stack<Character> stack = new Stack();

        for(int i = 0;i<num;i++){
            str = br.readLine();
            for(int j = 0;j< str.length(); j++){

                ch = str.charAt(j);
                if(ch == 'A'){
                    if(!stack.empty() && stack.peek() == 'A'){
                        stack.pop();
                    }
                    else
                    {
                        stack.push(ch);
                    }
                }
                else if(ch == 'B'){
                    if(!stack.empty() && stack.peek() == 'B'){
                        stack.pop();
                    }
                    else
                    {
                        stack.push(ch);
                    }
                }
            }
            if(!stack.empty()){
                result = false;
            }
            if(result){
                chance++;
            }
            result = true;
            stack.clear();
        }
        System.out.println(chance);

    }
}