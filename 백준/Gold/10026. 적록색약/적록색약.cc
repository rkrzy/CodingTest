#include <iostream>
#include <queue>

using namespace std;

int N;
int color_map[100][100];
int visited[100][100];
int color[3] = {1,2,3};
int dir_x[4] = {0,1,0,-1};
int dir_y[4] = {1,0,-1,0};
enum input{R = 1, G = 2, B = 3};

int normal_result = 0;
int blind_result = 0;

void zone_normal(int x, int y,int color_num){
    queue<pair<int, int> >q;
    q.push(make_pair(x,y));
    visited[x][y] = true;
    while(!q.empty()){
        pair<int, int> temp = q.front();
        q.pop();
        for(int i = 0; i < 4; i++){
            int nx = temp.first + dir_x[i];
            int ny = temp.second + dir_y[i];
            if(nx >= 0 && nx < N && ny >= 0 && ny < N &&
            color_map[nx][ny] == color_num&&
            !visited[nx][ny]){
                q.push(make_pair(nx,ny));
                visited[nx][ny] = true;
            }
        }
    }
}

void zone_blind(int x, int y,int color_num){
    queue<pair<int, int> >q;
    q.push(make_pair(x,y));
    visited[x][y] = true;
    if(color_num == 3){
        while(!q.empty()){
            pair<int, int> temp = q.front();
            q.pop();
            for(int i = 0; i < 4; i++){
                int nx = temp.first + dir_x[i];
                int ny = temp.second + dir_y[i];
                if(nx >= 0 && nx < N && ny >= 0 && ny < N &&
                   color_map[nx][ny] == color_num&&
                   !visited[nx][ny]){
                    q.push(make_pair(nx,ny));
                    visited[nx][ny] = true;
                }
            }
        }
    }
    else{
        while(!q.empty()){
            pair<int, int> temp = q.front();
            q.pop();
            for(int i = 0; i < 4; i++){
                int nx = temp.first + dir_x[i];
                int ny = temp.second + dir_y[i];
                if(nx >= 0 && nx < N && ny >= 0 && ny < N &&
                (color_map[nx][ny] == 1 || color_map[nx][ny] == 2) &&
                   !visited[nx][ny]){
                    q.push(make_pair(nx,ny));
                    visited[nx][ny] = true;
                }
            }
        }
    }
}

void solution(int rule){
    for(int i = 0; i < N; i++){
        for(int j = 0; j < N; j++){
            if(!visited[i][j]){
                if(rule == 1){
                    zone_normal(i,j,color_map[i][j]);
                    normal_result++;
                }
                else{
                    zone_blind(i,j,color_map[i][j]);
                    blind_result++;
                }
            }
        }
    }
}

int main(){
    int normal_vision = 0;
    int color_blind = 0;
    string str;
    char ch;
    cin>>N;
    for(int i = 0; i < N; i++){
        cin >> str;
        for(int j = 0; j < str.length(); j++){
            ch = str[j];
            switch (ch) {
                case 'R': color_map[i][j] = R;
                    break;
                case 'G': color_map[i][j] = G;
                    break;
                case 'B': color_map[i][j] = B;
                    break;
            }
            visited[i][j] = false;
        }
    }
    solution(1);
    for(int i = 0; i < N; i++){
        for(int j = 0; j < N; j++){
            visited[i][j] = false;
        }
    }
    solution(2);
    cout << normal_result << " "<< blind_result;
}
