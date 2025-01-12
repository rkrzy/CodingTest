import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Main {

    final int X = 0;
    final int Y = 0;

    static int[][] board;
    static boolean[][] vis;

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
        board = new int[][]{
                {1, 1, 1, 0, 1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 1, 0, 0, 0, 0, 0},
                {1, 1, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        vis = new boolean[502][502];
        int n = 7;//행의 수
        int m = 10;//열의 수
        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,1,0,-1};

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0,0));
        vis[0][0] = true;
        while(!queue.isEmpty()){
            Pair pair = queue.remove();
            System.out.println("(" + pair.getX() + ", " + pair.getY() + ")");
            for(int dir = 0; dir < 4;dir++){
                int nx = pair.getX() + dx[dir];
                int ny = pair.getY() + dy[dir];
                if(nx < 0 || nx >= n || ny < 0 ||ny >= m) continue;
                if(vis[nx][ny] || board[nx][ny] != 1) continue;
                vis[nx][ny] = true;
                queue.add(new Pair(nx, ny));
            }
        }
    }
}