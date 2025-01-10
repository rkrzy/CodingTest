import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    public static int leftSide(Deque<Integer> deque, int num){
        int count = 0;
        for(int d : deque){
            if(d == num)
            {
                break;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deque = new ArrayDeque();

        String[] str= br.readLine().split(" ");
        String[] order = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int num;
        int temp = 0;
        int result = 0;


        boolean direction = true;

        for(int i = 1; i <= N;i++)
        {
            deque.add(i);
        }

        for(int j = 0; j < M;j++)
        {
            num = Integer.parseInt(order[j]);
            temp = leftSide(deque, num);
            direction = temp <= deque.size() - temp  ? true : false;
            if(direction) // 왼쪽부터 접근
            {
                while(num != deque.getFirst())
                {
                    deque.add(deque.getFirst());
                    deque.remove();
                    result++;
                }
                deque.remove();
            }
            else
            {
                while(num != deque.getLast())
                {
                    deque.addFirst(deque.getLast());
                    deque.removeLast();
                    result++;
                }
                deque.addFirst(deque.getLast());
                deque.removeLast();
                result++;
                deque.remove();
            }
        }

        System.out.println(result);

    }
}