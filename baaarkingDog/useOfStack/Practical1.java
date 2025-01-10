import java.io.*;
import java.util.Stack;



//()가 연속으로 들어오면 레이저로 인식
//(이후에 레이저가 나오고 나서 )가 나오면 여기까지를 쇠막대기로 인식

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();
        String str = br.readLine();

        int strLength = str.length();
        int result = 0;
        for(int i = 0;i<strLength;i++){
            if(str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }else
            {
                if(str.charAt(i-1) == '('){
                    stack.pop();
                    result = result + stack.size();
                }
                else
                {
                    stack.pop();
                    result = result + 1;
                }
            }
        }
        System.out.println(result);
    }
}