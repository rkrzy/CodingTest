#include <iostream>
#include <queue>
#include <stack>
using namespace std;

vector<int> adj[10];
bool vis[10];
//인접리스트 방식
void NotStlDirected(){
    int edge[10][2];
    int deg[10]; // 각 정점의 outdgree
    int * adj[10];
    int idx[10];

    int v,e;
    cin >> v >> e;
    for(int i = 0; i < e; i++){
        cin >> edge[i][0] >> edge[i][1];
        deg[edge[i][0]]++;
        deg[edge[i][1]]++;
    }
    for(int i = 1; i <= v; i++){
        adj[i] = new int[deg[i]];
    }
    for(int i = 0; i < e; i++){
        int u = edge[i][0];
        int v = edge[i][1];
        adj[u][idx[u]] = v;
        idx[u]++;
        adj[v][idx[v]] = u;
        idx[v]++;
    }
}

void NotStlUndirected(){
    int edge[10][2];
    int deg[10]; // 각 정점의 outdgree
    int * adj[10];
    int idx[10];

    int v,e;
    cin >> v >> e;
    for(int i = 0; i < e; i++){
        cin >> edge[i][0] >> edge[i][1];
        deg[edge[i][0]]++;
    }
    for(int i = 1; i <= v; i++){
        adj[i] = new int[deg[i]];
    }
    for(int i = 0; i < e; i++){
        int u = edge[i][0];
        int v = edge[i][1];
        adj[u][idx[u]] = v;
        idx[u]++;
    }
}

void BFS(){
    queue<int> q;
    q.push(1);
    vis[1] = true;
    while(!q.empty()){
        int cur = q.front();
        q.pop();
        cout << cur << ' ';
        for(auto nxt : adj[cur]){
            if(vis[nxt]) continue;
            q.push(nxt);
            vis[nxt] = true;
        }
    }
}

void DFS(){
    stack<int> s;
    s.push(1);
    vis[1] = true;
    while(!s.empty()){
        int cur = s.top();
        s.pop();
        cout<<cur<<' ';
        for(auto nxt : adj[cur]){
            if(vis[nxt]) continue;
            s.push(nxt);
            vis[nxt] = true;
        }
    }
}

void DFSRecursive(int cur){
    vis[cur] = true;
    cout << cur << ' ';
    for(auto nxt : adj[cur]){
        if(vis[nxt]) continue;
        DFSRecursive(nxt);
    }
}
void
int main() {

    int T;
    cin >> T;

    for(int i = 0; i < T; i++){
        priority_queue<long long, vector<long long>, greater<long long> > pq;
        int N;
        long long answer = 0;
        cin >> N;
        int temp = 0;
        for(int j = 0; j < N; j++){
            cin >> temp;
            pq.push(temp);
        }
        while(pq.size() > 1){
            long long result = 0;
            result += pq.top();
            pq.pop();
            result += pq.top();
            pq.pop();
            pq.push(result);
            answer += result;
        }
        cout << answer  << '\n';
    }

}
