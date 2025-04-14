#include <iostream>
#include <vector>
#include <queue>
using namespace std;


int main(){


    int N;
    int a;
    int b;
    cin >> N;
    int answer[N+1];
    for(int i = 0; i <= N; i++){
        answer[i] = 0;
    }
    vector<int> v[N+1];
    bool vis[N + 1];
    for(int i = 0; i <= N; i++){
        vis[i] = false;
    }
    for(int i = 0; i < N-1; i++){
        cin >> a>>b;
        v[a].push_back(b);
        v[b].push_back(a);
    }
    queue<int> q;
    q.push(1);
    vis[1] = true;

    while(!q.empty()){
        int cur = q.front();
        q.pop();
        vis[cur] = true;
        for(int num : v[cur]){
            if(!vis[num]){
                answer[num] = cur;
                q.push(num);
            }
        }
    }
    for(int i = 2; i <= N; i++){
        cout << answer[i] << "\n";
    }
}