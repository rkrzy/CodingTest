#include <iostream>
#include <algorithm>
#include <climits>
#include <queue>
#include <stack>
#include <vector>
using namespace std;

/*
 * 방향 그래프 사용
 */
int dfs(vector<int> * users, int * result, int N){
    int maxNum = INT_MIN;
    for(int i = 1; i <= N; i++){
        queue<int> q;
        bool vis[N+1];
        vector<int> hacking;
        for(int j = 1; j <= N ; j++){
            vis[j] = false;
        }
        q.push(i);
        vis[i] = true;
        hacking.push_back(i);

        while(!q.empty()){
            int cur = q.front();
            q.pop();

            vis[cur] = true;

            for(int temp : users[cur]){
                if(!vis[temp]){
                    hacking.push_back(temp);
                    vis[temp] = true;
                    q.push(temp);
                }
            }
        }
        result[i] = hacking.size();
        if(result[i] > maxNum){
            maxNum = result[i];
        }
    }
    return maxNum;
}

int main(){

    int N;
    int M;
    int a, b;
    int maxNum = 0;
    cin >> N >> M;
    vector<int> users[N+1];
    int result[N+1];
    vector<int> answer;
    for(int i = 0; i <= N; i++){
        result[i] = 0;
    }

    for(int i = 0; i < M; i++){
        cin >> a >> b;
        users[b].push_back(a);
    }
    maxNum = dfs(users,result, N);

    for(int i = 1; i <= N; i++){
        if(maxNum == result[i]){
            cout << i << " ";
        }
    }

}