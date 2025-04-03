#include <iostream>
#include <queue>
#include <stack>
using namespace std;

vector<int> adj[1005];
bool vis[1005];


int main(){
    int N;
    int M;
    int u;
    int v;
    cin >> N >> M;
    for(int i = 0; i < M; i++){
        cin >> u >> v;
        adj[u].push_back(v);
        adj[v].push_back(u);
    }
    int num = 0;
    for(int i = 1; i <= N; i++){
        if(vis[i])continue;
        num++;
        queue<int> q;
        q.push(i);
        vis[i] = true;
        while(!q.empty()){
            int cur = q.front();
            q.pop();
            for(auto nxt : adj[cur]){
                if(vis[nxt]) continue;
                q.push(nxt);
                vis[nxt] = true;
            }
        }
    }
    cout << num;
}