import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Main {

    public static class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        public int getX(){return x;}
        public int getY(){return y;}
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        Queue<Pair> queue = new LinkedList<>();
        for(int i = 0;i <T;i++)
        {
            int result = 0;
            String[] str = br.readLine().split(" ");
            int M = Integer.parseInt(str[0]);
            int N = Integer.parseInt(str[1]);
            int K = Integer.parseInt(str[2]);

            int[] px = {1, 0, -1, 0};
            int[] py = {0, 1, 0, -1};

            int[][] field = new int[M][N];
            boolean[][] visit = new boolean[M][N];
            for(int j = 0; j<K; j++){
                str = br.readLine().split(" ");
                field[Integer.parseInt(str[0])][Integer.parseInt(str[1])] = 1;
            }
            for(int a = 0; a<M; a++){
                for(int c = 0; c<N; c++){
                    if(field[a][c] == 1 && !visit[a][c]){
                        result++;
                        visit[a][c] = true;
                        queue.add(new Pair(a,c));
                        while(!queue.isEmpty()){
                            Pair pair = queue.remove();
                            for(int num = 0; num < 4; num++){
                                int tx = pair.getX() + px[num];
                                int ty = pair.getY() + py[num];
                                if(tx < 0 || tx >= M || ty < 0 || ty >= N){continue;}
                                if(visit[tx][ty]|| field[tx][ty] != 1){continue;}
                                visit[tx][ty] = true;
                                queue.add(new Pair(tx, ty));
                            }
                        }
                    }
                }
            }
            queue.clear();
            System.out.println(result);
        }

    }
}