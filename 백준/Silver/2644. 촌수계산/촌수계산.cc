#include <iostream>
#include <vector>
#include <queue>

using namespace std;


int main() {
    int a, b;
    int answer = 0;
    bool flag = false;
    int n;
    int person, otherPerson;
    int m;
    cin >> n;
    cin >> person >> otherPerson;
    cin >> m;
    vector<int> adj[n + 1];
    bool vis[101] = {false, };
    for(int i = 0; i < m; i++){
        cin >> a >> b;
        adj[a].push_back(b);
        adj[b].push_back(a);
    }
    queue<pair<int,int> > q;

    q.push(make_pair(person, 0));
    vis[person] = true;

    while(!q.empty() && !flag){
        int cur = q.front().first;
        int depth = q.front().second;
        q.pop();
        vis[cur] = true;
        if(otherPerson == cur){
            flag = true;
            cout << depth;
        }
        for(int temp : adj[cur]){
            if(!vis[temp]){
                q.push(make_pair(temp, depth+1));
            }
        }
    }
    if(!flag){
        cout << -1;
    }

}