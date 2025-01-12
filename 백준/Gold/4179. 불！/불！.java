import java.io.*;
import java.util.LinkedList;
import java.util.Queue;



public class Main {
    static class Pair {
        int x;
        int y;
        int distance;

        public Pair(int x, int y) {
            this.distance = 0;
            this.x = x;
            this.y = y;
        }

        public Pair(int x, int y, int distance) {
            this.distance = distance;
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getDistance() {
            return distance;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int R = Integer.parseInt(str[0]);
        int C = Integer.parseInt(str[1]);
        boolean [][] vis = new boolean[R][C];
        int[][] room = new int[R][C];
        Queue<Pair> J = new LinkedList<>();
        Queue<Pair> F = new LinkedList<>();

        int result = 0;
        int[] px = {1, 0, -1, 0};
        int[] py = {0, 1, 0, -1};

        boolean escape = false;

        for (int i = 0; i < R; i++) {
            char[] ch = br.readLine().toCharArray();
            for (int j = 0; j < C; j++) {
                if (ch[j] == '#') {
                    room[i][j] = 0;
                } else if (ch[j] == '.') {
                    room[i][j] = 1;
                } else if (ch[j] == 'F') {
                    room[i][j] = -1;
                    F.add(new Pair(i, j));
                } else {
                    room[i][j] = 2;
                    vis[i][j] = true;
                    J.add(new Pair(i, j));
                }
            }
        }
        while (!J.isEmpty() && !escape) {
            if (!F.isEmpty()) {
                int fSize = F.size();
                for (int j = 0; j < fSize; j++) {
                    Pair pair = F.remove();
                    for (int i = 0; i < 4; i++) {
                        int tx = pair.getX() + px[i];
                        int ty = pair.getY() + py[i];
                        if (tx < 0 || tx >= R || ty < 0 || ty >= C) {
                            continue;
                        }
                        if (room[tx][ty] == -1 || room[tx][ty] == 0) {
                            continue;
                        }
                        F.add(new Pair(tx, ty));
                        room[tx][ty] = -1;
                    }
                }
            }
            int jSize = J.size();
            for (int j = 0; j < jSize; j++) {
                Pair pair = J.remove();
                if (pair.getX() == 0 || pair.getX() == R - 1 || pair.getY() == 0 || pair.getY() == C - 1) {
                    result = pair.getDistance();
                    escape = true;
                    break;
                }
                for (int i = 0; i < 4; i++) {
                    int tx = pair.getX() + px[i];
                    int ty = pair.getY() + py[i];
                    if (tx < 0 || tx >= R || ty < 0 || ty >= C) {
                        continue;
                    }
                    if (room[tx][ty] == -1 || room[tx][ty] == 0 || vis[tx][ty]) {
                        continue;
                    }
                    J.add(new Pair(tx, ty, pair.getDistance() + 1));
                    vis[tx][ty] = true;
                }
            }
        }
        if(escape)
        {
            System.out.println(result + 1);
        }
        else
        {
            System.out.println("IMPOSSIBLE");
        }

    }
}