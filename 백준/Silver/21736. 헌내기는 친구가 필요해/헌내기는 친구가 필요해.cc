#include <iostream>
#include <queue>
#include <algorithm>

using namespace std;

int x_dir[4] = {0, 1, 0, -1};
int y_dir[4] = {1, 0, -1, 0};

int main()
{
    int N, M;
    cin >> N >> M;
    string str;
    queue<pair< int, int> > q;
    char arr[N][M];
    bool visited[N][M];
    int count = 0;
    for(int i = 0 ; i < N; i++){
        cin >> str;
        for(int j = 0; j < M; j++){
            arr[i][j] = str[j];
            visited[i][j] = false;
            if(arr[i][j] == 'I'){
                q.push(make_pair(i ,j));
                visited[i][j] = true;
            }
        }
    }
    while(!q.empty()){
        pair<int, int> temp = q.front();
        q.pop();
        if(arr[temp.first][temp.second] == 'P'){
            count++;
        }
        for(int i = 0 ; i < 4; i++){
            int x_num = temp.first + x_dir[i];
            int y_num = temp.second + y_dir[i];
            if((y_num >= 0 && y_num < M)&&
            (x_num >= 0 && x_num <N)&&
            !visited[x_num][y_num] &&
            arr[x_num][y_num] != 'X'){
                visited[x_num][y_num] = true;
                q.push(make_pair(x_num, y_num));
            }
        }
    }
    if(count > 0){
        cout << count;
    }
    else{
        cout << "TT";
    }

}