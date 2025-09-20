#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <sstream>
using namespace std;
const long long INF = 1e15;


int main(){

    int N;
    int M;
    cin >> N >> M;
    vector<vector<pair<int, int> > > graph(N+1);

    for(int i = 0; i < M; i++){
        int u,v,w;
        cin >> u >>v >>w;
        graph[u].push_back(make_pair(v,w));
    }
    int start,goal;
    cin >> start >> goal;

    vector<long long> dist(N+1, INF);
    //거리, 정점번호
    priority_queue<pair<long long,int>, vector<pair<long long, int> >, greater<pair<long long, int> > > pq;

    dist[start] = 0;
    pq.push(make_pair(0, start));

    while(!pq.empty()) {
        auto [d,cur] = pq.top();
        pq.pop();
        //만약 더 크다면
        if(dist[cur] < d) continue;

        for(auto [nxt, cost] : graph[cur]) {
            long long nd = d +cost;
            if(nd < dist[nxt]){
                dist[nxt] = nd;
                pq.push(make_pair(nd, nxt));
            }
        }
    }

    cout<<dist[goal] << "\n";
    return 0;
}