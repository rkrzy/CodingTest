#include <iostream>
#include <queue>

using namespace std;

int dir_x[6] = {-1,0,1,0,0,0};
int dir_y[6] = {0,1,0,-1,0,0};
int dir_up_down[6] = {0,0,0,0,1,-1};

int tomato[100][100][100];
int dist[100][100][100];


int main(){
    int M, N, H;
    //입력받는 구간
    cin >> M >> N >> H;
    int day = 0;
    queue<pair<pair<int,int>,int> >q;
    for(int i = 0; i < H; i++){
        for(int j = 0; j < N; j++)
        {
            for(int k = 0; k < M; k++)
            {
                cin >> tomato[i][j][k];
                if(tomato[i][j][k] == 1){
                    q.push(make_pair(make_pair(i,j),k));
                }
                if(tomato[i][j][k] == 0)
                {
                    dist[i][j][k] = -1;
                }
            }
        }
    }
    while(!q.empty()){
        pair<pair<int, int>, int> cur = q.front();
        q.pop();
        for (int i = 0; i < 6; i++) {
            int nz = cur.first.first + dir_up_down[i];
            int nx = cur.first.second+ dir_x[i];
            int ny = cur.second + dir_y[i];

            if (nx < 0 || nx >= N || ny < 0 || ny >= M || nz < 0 || nz >= H) continue;
            if (dist[nz][nx][ny] >= 0) continue;
            dist[nz][nx][ny] = dist[cur.first.first][cur.first.second][cur.second] + 1;
            q.push(make_pair(make_pair( nz,nx ),ny));
        }
    }
    for (int i = 0; i < H; i++) {
        for (int j = 0; j < N; j++) {
            for (int k = 0; k < M; k++) {
                if (dist[i][j][k] == -1) {
                    cout << -1;
                    return 0;
                }
                day = max(day, dist[i][j][k]);
            }
        }
    }
    cout << day;
}
