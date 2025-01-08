import java.io.*;

class Stack{
    int size = 10000;
    int[] save;
    int pos = 0;
    public Stack(){
        save = new int[size];
    }
    public void push(int x){
        save[pos] = x;
        pos++;
    }
    public void pop(){
        save[pos] = 0;
        pos--;
    }
    public int top(){
        return (save[pos-1]);
    }
}



public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = 0;

        Stack stack = new Stack();

        for(int i = 0;i<3;i++)
        {
            num = Integer.parseInt(br.readLine());
            stack.push(num);
        }
        for(int i = 0;i<3;i++)
        {
            bw.write(String.valueOf(stack.top()));
            stack.pop();
        }

        br.close();
        bw.close();
    }
}