#include <iostream>
#include <queue>
#include <stack>
#include <algorithm>
using namespace std;

vector<int> adj[1005];
bool vis[1005];
bool vis2[1005];


int main(){
    int N;
    int M;
    int V;
    int u;
    int v;
    queue<int> q;
    stack<int> s;
    cin >> N >> M >> V;
    for(int i = 0; i < M; i++){
        cin >> u >> v;
        adj[u].push_back(v);
        adj[v].push_back(u);
    }
    for(int i = 1; i <=N ;i++){
        sort(adj[i].begin(), adj[i].end());
    }
    s.push(V);
    while(!s.empty()){
        int cur = s.top();
        s.pop();
        if(vis2[cur])continue;
        vis2[cur] = true;
        cout << cur<<' ';
        for(int i = 0; i < adj[cur].size(); i++){
            int nxt = adj[cur][adj[cur].size() -1 - i];
            if(vis2[nxt]) continue;
            s.push(nxt);
        }
    }

    cout << "\n";
    q.push(V);
    vis[V] = true;
    while(!q.empty()){
        int cur = q.front();
        q.pop();
        cout << cur << ' ';
        for(int temp : adj[cur]){
            if(vis[temp])continue;
            q.push(temp);
            vis[temp] = true;
        }
    }

}