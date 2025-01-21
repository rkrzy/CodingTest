import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    static class Pair{
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

        String[] str = br.readLine().split(" ");
        Queue<Pair> queue = new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        int M = Integer.parseInt(str[0]);
        int N = Integer.parseInt(str[1]);
        int K = Integer.parseInt(str[2]);

        int[][] field = new int[102][102];
        boolean[][] visit = new boolean[102][102];
        int[] px = {1, 0, -1, 0};
        int[] py = {0, 1, 0, -1};

        for(int i = 0; i < K; i++){
            str = br.readLine().split(" ");
            for(int a = Integer.parseInt(str[0]); a < Integer.parseInt(str[2]);a++){
                for(int b = Integer.parseInt(str[1]); b < Integer.parseInt(str[3]); b++){
                    field[b][a] = 1;
                }
            }
        }
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(field[i][j] == 1 || visit[i][j]){continue;}
                    int result = 1;
                    queue.add(new Pair(i, j));
                    visit[i][j] = true;
                    while(!queue.isEmpty()){
                        Pair pair = queue.remove();
                        for(int q = 0; q < 4; q++){
                            int tx = pair.getX() + px[q];
                            int ty = pair.getY() + py[q];
                            if(tx<0 || tx >= M || ty < 0 || ty >= N){continue;}
                            if(visit[tx][ty] || field[tx][ty] == 1){continue;}
                            visit[tx][ty] = true;
                            queue.add(new Pair(tx, ty));
                            result++;
                        }
                    }
                    list.add(result);
                }
            }
        System.out.println(list.size());
        Collections.sort(list);
        for(int num : list){
            System.out.print(num + " ");
        }
    }
}