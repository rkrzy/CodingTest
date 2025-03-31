#include <iostream>
#include <queue>
#include <stack>
using namespace std;
/*
 * N : 정점의 개수
 * 이후 : 연결되어 있는지 안되어 있는지
 */

/*
 * 예제 풀이
 * 0 1 0 (1 -> 2)
 * 0 0 1 (2 -> 3)
 * 1 0 0 (3 -> 1)
 */
vector<int> adj[101];
stack<int> st;


int main(){

    int temp = 0;
    int N;
    cin >> N;
    int arr[N+1][N+1];
    // 입력을 받는 구간
    for(int i = 1; i <= N; i++){
        for(int j = 1; j <= N; j++){
            cin >> temp;
            if(temp){
                adj[i].push_back(j);
            }
            arr[i][j] = 0;
        }
    }

    for(int i = 1; i <= N; i++){
        for(int j = 1; j <= N; j++){
            bool vis[101] = {false, };
            stack<int> st;
            for(auto num : adj[i]){
                st.push(num);
            }
            while(!st.empty()){
                int x = st.top();
                st.pop();
                vis[x] = true;
                if(j == x){
                    arr[i][j] = 1;
                    break;
                }
                for(auto num : adj[x]){
                    if(!vis[num]){
                        st.push(num);
                    }
                }
            }
        }
    }
    for(int i = 1; i <= N; i++){
        for(int j = 1; j <= N; j++){
            cout<<arr[i][j]<<" ";
        }
        cout<<'\n';
    }

}