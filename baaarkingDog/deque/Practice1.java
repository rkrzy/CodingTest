import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

class Deque{
    private final int MX = 100005;
    int[] data;
    int head;
    int tail;

    public Deque(){
        data = new int[MX*2+1];
        head = MX;
        tail = MX;
    }
    public void push_front(int x){
        head = head - 1;
        data[head] = x;
    }
    public void push_back(int x){
        data[tail] = x;
        tail++;
    }
    public int pop_front(){
        if(empty() == 1)
        {
            return -1;
        }
        int num = data[head];
        head++;
        return num;
    }
    public int pop_back(){
        if(empty() == 1)
        {
            return -1;
        }
        int num = data[tail-1];
        tail--;
        return num;
    }
    public int size(){
        return tail - head;
    }
    public int front(){
        if(empty() == 1)
        {
            return -1;
        }
        return data[head];
    }
    public int back(){
        if(empty() == 1)
        {
            return -1;
        }
        return data[tail-1];
    }
    public int empty(){
        if(head == tail){
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

        Deque deque = new Deque();
        for(int i = 0;i<num;i++)
        {
            String[] command = br.readLine().split(" ");
            switch(command[0]){
                case "push_back":
                    deque.push_back(Integer.parseInt(command[1]));
                    break;
                case "push_front":
                    deque.push_front(Integer.parseInt(command[1]));
                    break;
                case "pop_front":
                    bw.write(deque.pop_front()+"\n");
                    break;
                case "pop_back":
                    bw.write(deque.pop_back()+"\n");
                    break;
                case "size":
                    bw.write(deque.size()+"\n");
                    break;
                case "empty":
                    bw.write(deque.empty()+"\n");
                    break;
                case "front":
                    bw.write(deque.front()+"\n");
                    break;
                case "back":
                    bw.write(deque.back()+"\n");
                    break;
            }

        }
        bw.close();
        br.close();


    }
}