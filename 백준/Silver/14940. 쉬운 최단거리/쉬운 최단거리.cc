#include <iostream>
#include <queue>
using namespace std;


int N, M;
int visited[1001][1001] = {0,};
int coordinate[1001][1001] = {0, };
int addX[4] = {0,0,1, -1};
int addY[4] = {1,-1,0,0};

void bfs(int targetX, int targetY){
    queue<pair<int, int> > q;
    q.push(make_pair(targetX, targetY));
    visited[targetX][targetY] = 1;
    while(!q.empty()){
        int frontX = q.front().first;
        int frontY = q.front().second;
        q.pop();

        for(int i = 0; i < 4; i++){
            int dx = frontX + addX[i];
            int dy = frontY + addY[i];

            if(dx >= 1 && dx <= N && dy >= 1 && dy <= M){
                if(visited[dx][dy] == 0 && coordinate[dx][dy] != 0){
                    visited[dx][dy] = visited[frontX][frontY] + 1;
                    q.push(make_pair(dx, dy));
                }
            }
        }
    }
}

void printing(){
    for(int i = 1; i <= N; i++){
        for(int j = 1; j <= M; j++){
            if(coordinate[i][j] == 0){
                cout << 0 <<" ";
            }
            else
            {
                cout << visited[i][j] - 1 << " ";
            }
        }
        cout << "\n";
    }
}
int main() {

    int num;
    int targetX, targetY;
    cin>> N>> M;
    for(int i = 1; i <= N; i++){
        for(int j = 1; j <= M; j++){
            cin >> num;
            if(num == 2){
                targetX = i;
                targetY = j;
            }
            coordinate[i][j] = num;
        }
    }
    bfs(targetX, targetY);

    printing();


}