#include<vector>
#include <queue>

using namespace std;

int solution(vector<vector<int> > maps)
{
    int dx[4] = {0,0,1,-1};
    int dy[4] = {1,-1,0,0};
    int n = maps.size();
    int m = maps[0].size();
    
    vector<vector<int>> distance (n, vector<int>(m, -1));
    
    queue<pair<int,int>> q;
    
    q.push({0,0});
    distance[0][0] = 1;
    
    while(!q.empty()){
        pair<int, int> current = q.front();
        int x = current.first;
        int y = current.second;
        q.pop();
        
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx >= 0 && nx < n && ny >= 0 && ny < m &&
              maps[nx][ny] == 1 && distance[nx][ny] == -1){
                distance[nx][ny] = distance[x][y] + 1;
                q.push({nx,ny});
            }
        }
    }
    return distance[n-1][m-1];
}