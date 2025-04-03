#include <iostream>
#include <algorithm>
#include <climits>
#include <queue>
#include <stack>
#include <vector>
using namespace std;

vector<int> users[101];

void dfs(long long * result, int N){

    for(int i = 1; i <= N; i++){
        queue<pair<int, int> > st;
        bool vis[N+1];
        for(int j = 1; j <= N; j++){
            vis[j] = false;
        }

        vis[i] = true;
        st.push(make_pair(i, 0));

        while(!st.empty()){
            int cur = st.front().first;
            int depth = st.front().second;
            st.pop();
            result[i] += depth;
            for(int temp : users[cur]){
                if(!vis[temp]){
                    st.push(make_pair(temp, depth+1));
                    vis[temp] = true;
                }
            }
        }
    }
}

int main(){
    int N, M;
    int a, b;
    long long  Min = LONG_LONG_MAX;
    int answer = 0;
    cin >> N >> M;
    long long result[N + 1]; // 각 유저의 값을 저장하기 위한 함수
    for(int i = 1; i <= N; i++){
        result[i] = 0;
    }
    for(int i = 0; i < M; i++){
        cin >> a >> b;
        users[a].push_back(b);
        users[b].push_back(a);
    }
    dfs(result, N);
    for(int i = 1; i <= N; i++){
        if(Min > result[i]){
            Min = result[i];
            answer = i;
        }
    }
    cout << answer;
}