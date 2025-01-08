import java.io.*;


class Stack{

    int[] save;
    public static final int MAX_SIZE = 10000;
    int pos = 0;

    public Stack(){
        save = new int[MAX_SIZE];
    }
    public void push(int x)
    {
        save[pos] = x;
        pos++;
    }
    public int pop(){
        if(pos == 0)
        {
            return -1;
        }
        else{
            pos--;
            return save[pos];
        }
    }
    public int size(){
        return pos;
    }
    public int empty(){
        if(pos == 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public int top(){
        if(pos == 0)
        {
            return -1;
        }
        else
        {
            return save[pos-1];
        }

    }
}



public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack stack = new Stack();
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
                    bw.write(String.valueOf(stack.pop())+"\n");
                    break;
                case "size":
                    bw.write(String.valueOf(stack.size())+"\n");
                    break;
                case "empty":
                    bw.write(String.valueOf(stack.empty())+"\n");
                    break;
                default:
                    bw.write(String.valueOf(stack.top())+"\n");
                    break;
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }
}