#include <iostream>
#include <queue>
#include <stack>
using namespace std;
/*
 * N : 상근이의 동기의
 * M : 리스트의 길이
 */

/*
 * 1 2 3
 * 2 1 3
 * 3 1 2 4
 * 4 3 5
 * 5 4
 */

vector<int> adj[505];
stack<int> st;
bool vis[505];

int main(){
    int N;
    int M;
    int a;
    int b;
    int result = 0;
    int chance = 0;
    cin >> N >> M;
    for(int i = 0; i < M; i++){
        cin >> a >> b;
        adj[a].push_back(b);
        adj[b].push_back(a);
    }
    vis[1] = true;
    for(auto temp : adj[1]){
        st.push(temp);
        vis[temp] = true;
        result++;
    }
    while(!st.empty()){
        int num = st.top();
        st.pop();
        for(auto temp : adj[num]){
            if(!vis[temp])
            {
                result++;
                vis[temp] = true;
            }
        }
    }
    cout << result;
}