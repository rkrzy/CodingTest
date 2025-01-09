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
        int num = data[head];
        head++;
        return num;
    }
    public int pop_back(){
        int num = data[tail-1];
        tail--;
        return num;
    }
    public int front(){
        return data[head];
    }
    public int back(){
        return data[tail-1];
    }
}


public class Main {
    public static void main(String[] args) throws IOException {

        

    }
}