import java.io.*;

class Queue{

    int[] save;
    int head = 0;
    int tail = 0;
    public Queue()
    {
      save = new int[100000];
    }
    public void push(int x){
        save[tail] = x;
        tail++;
    }
    public int pop(){
        if(empty() == 1)
        {
            return -1;
        }
        return save[head++];
    }
    public int front(){
        if(empty() == 1)
        {
            return -1;
        }
        return save[head];
    }
    public int back(){
        if(empty() == 1)
        {
            return -1;
        }
        return save[tail-1];
    }
    public int size(){
        return tail - head;
    }
    public int empty(){
        if(tail == head){
            return 1;
        }
        else
        {
            return 0;
        }
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        Queue queue = new Queue();

        for(int i = 0;i<num;i++)
        {
            String[] str = br.readLine().split(" ");

            switch(str[0])
            {
                case "push" :
                    queue.push(Integer.parseInt(str[1]));
                    break;
                case "pop" :
                    bw.write(String.valueOf(queue.pop())+"\n");
                    break;
                case "size" :
                    bw.write(String.valueOf(queue.size())+"\n");
                    break;
                case "empty" :
                    bw.write(String.valueOf(queue.empty())+"\n");
                    break;
                case "front" :
                    bw.write(String.valueOf(queue.front())+"\n");
                    break;
                case "back" :
                    bw.write(String.valueOf(queue.back())+"\n");
                    break;
            }
        }

        bw.flush();

        br.close();
        bw.close();
    }
}