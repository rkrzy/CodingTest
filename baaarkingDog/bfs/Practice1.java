import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Main {
    static class Pair{
        Integer x;
        Integer y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        public int getX(){return x;}
        public int getY(){return y;}
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        int[][] picture = new int[N][M];
        boolean[][] vis = new boolean[N][M];

        int resultNum = 0;
        int maxSize = 0;

        for(int i = 0;i<N;i++)
        {
            str = br.readLine().split(" ");
            for(int j = 0;j<M;j++)
            {
                picture[i][j] = Integer.parseInt(str[j]);
            }
        }
        Queue<Pair> queue = new LinkedList<>();
        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,1,0,-1};

        for(int i = 0;i<N;i++)
        {
            for(int j = 0;j<M;j++){
                if(picture[i][j] == 1 && !vis[i][j]){
                    queue.add(new Pair(i,j));
                    vis[i][j] = true;
                    int tempSize = 1;
                    while(!queue.isEmpty()){
                        Pair pair = queue.remove();
                        for(int k = 0;k<4;k++)
                        {
                            int tempX = pair.getX()+dx[k];
                            int tempY = pair.getY()+dy[k];
                            if(tempX < 0 || tempX >= N || tempY < 0 ||tempY >= M){continue;}//범위를 벗어난다면
                            if(picture[tempX][tempY] != 1 || vis[tempX][tempY]){continue;}//이미 방문을 했거나 그림이 표시된게 아니라면
                            queue.add(new Pair(tempX, tempY));
                            vis[tempX][tempY] = true;
                            tempSize++;
                        }
                    }
                    resultNum = resultNum + 1;
                    maxSize = maxSize < tempSize? tempSize : maxSize;
                    queue.clear();
                }
            }
        }
        System.out.println(resultNum + "\n" + maxSize);


    }
}