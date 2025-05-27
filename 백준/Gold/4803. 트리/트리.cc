#include <iostream>
#include <vector>
#include <queue>
using namespace std;

#define CASE1 "Case %d: A forest of %d trees."
#define CASE2 "Case %d: There is one tree."
#define CASE3 "Case %d: No trees."


bool is_tree(vector<vector<int> >& adj, vector<bool> & visited,vector<int> & parent, int root){
    queue<int> q;
    q.push(root);
    visited[root] = true;
    while(!q.empty()){
        int cur = q.front();
        q.pop();
        for(int next : adj[cur]){
            if (!visited[next]) {
                visited[next] = true;
                parent[next] = cur;
                q.push(next);
            } else if (parent[cur] != next) {
                // 부모가 아닌데 방문된 노드를 다시 만났다 → 사이클
                return false;
            }
        }
    }
    return true;
}

int main(){
    int n = 0, m = 0;
    int edge1, edge2;
    int test_num = 1;
    while(true){
        int T = 0; // 트리의 갯수
        cin >> n >> m;
        vector<bool> visited(n + 1, false);
        vector<int>  parent (n + 1, 0);
        vector<vector<int> > adj(n + 1);
        if(n == 0 && m == 0){
            break;
        }
        for(int i = 0; i <= n; i++){
            visited[i] = false;
            parent[i] = 0;
        }
        for(int i = 0; i < m; i++){
            cin >> edge1 >> edge2;
            adj[edge1].push_back(edge2);
            adj[edge2].push_back(edge1);
        }

        for(int i = 1; i <= n; i++){
            if(!visited[i] && is_tree(adj,visited,parent,i)) {
                T++;
            }
        }
        if(T == 0){
            printf(CASE3"\n", test_num);
        }
        else if(T == 1) {
            printf(CASE2"\n", test_num);
        }
        else{
            printf(CASE1"\n", test_num, T);
        }
        test_num++;
    }
}