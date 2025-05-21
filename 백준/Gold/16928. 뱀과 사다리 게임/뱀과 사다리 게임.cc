#include <iostream>
#include <queue>

using namespace std;

int map[102] = {0,};
int visit[102] = {0,};

void solution(int start, int count){
    queue<pair<int, int> > q;
    q.push(make_pair(start, count));
    while(!q.empty()){
        int location = q.front().first;
        int cnt = q.front().second;
        q.pop();
        for(int i =1; i <= 6; i++){
            int next = location + i;
            if(next == 100){
                cout << cnt+1;
                return;
            }
            else if(next < 100){
                while(map[next] != 0){
                    next = map[next];
                }
                if(!visit[next]){
                    q.push(make_pair(next, cnt + 1));
                    visit[next] = true;
                }
            }
        }
    }

}
int main()
{
    int N, M;
    int temp1, temp2;
    cin >> N >> M;
    for(int i = 0; i < N; i++){
        cin >> temp1 >> temp2;
        map[temp1] = temp2;
    }
    for(int i = 0; i < M; i++){
        cin >> temp1 >> temp2;
        map[temp1] = temp2;
    }
    solution(1,0);
    return 0;
}