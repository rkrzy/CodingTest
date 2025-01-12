import java.io.*;
import java.util.LinkedList;
import java.util.Queue;



public class Main {
    static class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        public int getX(){return x;}
        public int getY(){return y;}
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = -1;

        String[] str = br.readLine().split(" ");

        int M = Integer.parseInt(str[0]); //열의수
        int N = Integer.parseInt(str[1]); //행의수

        int[][] storage = new int[N][M];
        boolean vis[][] = new boolean[N][M];
        int[] px = {0,1,0,-1};
        int[] py = {1,0,-1,0};

        Queue<Pair> queue = new LinkedList<>();

        for(int i = 0; i < N; i++)
        {
            str = br.readLine().split(" ");
            for(int j = 0; j < M; j++)
            {
                int temp = Integer.parseInt(str[j]);
                storage[i][j] = temp;
                if(temp == 1){
                  queue.add(new Pair(i,j));
                  vis[i][j] = true;
                }
            }
        }
        while(!queue.isEmpty()){
            int tomato = queue.size();
            for(int i = 0; i < tomato; i++)
            {
                Pair pair = queue.remove();
                for(int j = 0; j < 4; j++)
                {
                    int tx = pair.getX() + px[j];
                    int ty = pair.getY() + py[j];
                    if(tx < 0 || tx >= N || ty < 0 || ty >= M){continue;}
                    if(vis[tx][ty] || storage[tx][ty] != 0 ){continue;}
                    storage[tx][ty] = 1;
                    vis[tx][ty] = true;
                    queue.add(new Pair(tx, ty));
                }
            }
            result++;
        }
        Loop1 :
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++){
                if(storage[i][j] == 0)
                {
                    result = -1;
                    break Loop1;
                }
            }
        }
        System.out.println(result);
    }
}