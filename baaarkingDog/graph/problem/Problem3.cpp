#include <iostream>
#include <algorithm>
#include <queue>
#include <vector>
using namespace std;

/*
 * 1점 : 다른 모든 회원과 친구
 * 2점 : 다른 모든 회원과 친구 OR 친구의 친구
 * 3점 : 다른 모든 회원과 친구 OR 친구의 친구 OR 친구의 친구의 친구
 *
 * 주의 사항: 두 회원이 친구 사이면서 친구의 친구사이면 두 사람은 친구사이
 *
 * 회장 : 회원들 중에서 점수가 가장 작은 사람
 *
 * 입력 : 회원의 수, 친구임을 나타내는 회원 번호
 * 출력 : 회장의 점수와 회장일 될 수 있는 모든 사람을 찾는 프로그램
 */
int N;
vector<int> adj[51];
vector<pair<int, int> > president;
void bfs(){

    for(int i = 1; i <= N; i++){
        //연결된게 없다는 뜻이다.
        if(adj[i].size() == 0) continue;
        queue<pair<int, int> > q;
        bool vis[51] = {false, };
        int totalLevel = 0;
        q.push(make_pair(i, 0));
        while(!q.empty()){
            int friends = q.front().first;
            int level = q.front().second;
            vis[friends] = true;
            q.pop();
            //값을 구하기 위해 몇번을 이동했는지 구하는 방법
            totalLevel = max(totalLevel, level);
            for(int j = 0; j < adj[friends].size(); j++){
                if(vis[adj[friends][j]]) continue;
                vis[adj[friends][j]] = true;
                q.push(make_pair(adj[friends][j], level + 1));
            }
        }
        president.push_back(make_pair(totalLevel, i));
    }
}
int main(){
    int a, b;
    cin >> N;
    while(1){
        cin >> a >> b;
        if(a == -1 && b == -1) break;
        adj[a].push_back(b);
        adj[b].push_back(a);
    }

    bfs();
    sort(president.begin(), president.end());

    int ansCnt = 0;
    int ansFriends = president[0].first;
    vector<int> ans;

    for(int i = 0; i < president.size(); i++){
        if(president[0].first == president[i].first){
            ansCnt++;
            ans.push_back(president[i].second);
        }
    }
    cout << ansFriends << " " << ansCnt << "\n";
    for(int i = 0; i < ans.size(); i++){
        cout << ans[i] <<" ";
    }
    cout << "\n";
    return 0;
}