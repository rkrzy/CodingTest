import java.io.*;
import java.util.LinkedList;
import java.util.Queue;



public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        if(N >= M){
            System.out.println(N-M);
            return;
        }
        int roomSize = M + 2;
        int[] room = new int[M + 2];

        Queue<Integer> queue = new LinkedList<>();

        queue.add(N);

        while(!queue.isEmpty()){
            int cur = queue.remove();
            if(cur == M){
                System.out.println(room[cur]);
                break;
            }
            if(cur + 1 < roomSize && room[cur + 1] == 0){
                room[cur + 1] = room[cur] + 1;
                queue.add(cur + 1);
            }
            if(cur - 1 >= 0 && room[cur - 1] == 0){
                room[cur - 1] = room[cur] + 1;
                queue.add(cur - 1);
            }
            if(cur * 2 < roomSize && room[cur * 2] == 0){
                room[cur * 2] = room[cur] + 1;
                queue.add(cur * 2);
            }
        }
    }
}