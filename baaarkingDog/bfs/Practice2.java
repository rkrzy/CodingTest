    import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Main {
    static class Pair{
        int x;
        int y;
        int distance;
        public Pair(int x, int y,int distance){
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
        public int getX(){return this.x;}
        public int getY(){return this.y;}
        public int getDistance(){return this.distance;}
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        int[][] maze = new int[N+1][M+1];
        boolean[][] vis = new boolean[N+1][M+1];

        Queue<Pair> queue = new LinkedList<>();

        int[] px = {1,0,-1,0};
        int[] py = {0,1,0,-1};

        int result = 0;

        //들어오는 값들을 순서대로 저장
        //1,1부터 저장을 시작해야 하기 때문에 i, j의 값을 1으로 설정했다.
        for(int i = 0; i < N; i++)
        {
            str = br.readLine().split("");
            for(int j = 0; j < M;j++)
            {
                maze[i+1][j+1] = Integer.parseInt(str[j]);
            }
        }
        queue.add(new Pair(1,1,1));
        vis[1][1] = true;

        while(true)
        {
            Pair pair = queue.remove();
            if(pair.getX() == N && pair.getY() == M){
                result = pair.getDistance();
                break;
            }
            for(int i = 0;i<4;i++)
            {
                int tx = pair.getX() + px[i];
                int ty = pair.getY() + py[i];
                if(tx < 1 || tx > N || ty < 1 || ty > M){continue;}
                if(vis[tx][ty]||maze[tx][ty] != 1){continue;}
                queue.add(new Pair(tx, ty, pair.getDistance() + 1));
                vis[tx][ty] = true;
            }
        }
        System.out.println(result);
    }
}