#include <iostream>
#include <vector>
#include <queue>
using namespace std;

/* 4개의 칸을 더했을 때 최대가 되는 부분을 찾자
 *
 */
int main(){

    int N, M;
    int start, end;

    cin >> N >> M;
    int distance[N+1];
    int visited[N+1];
    int result_distance = 0;
    int result_barn = 0;
    int result_chance = 0;
    vector<pair<int, int> > barn[N+1];

    for(int i = 0; i < M; i++){

        cin >> start >> end;
        barn[start].push_back(make_pair(end, 0));
        barn[end].push_back(make_pair(start, 0));
    }
    for(int i = 0; i <= N; i++){
        distance[i] = 0;
        visited[i] = false;
    }
    queue<int> q;
    q.push(1);
    visited[1] = true;
    while(!q.empty()){
        int cur = q.front();
        q.pop();
        int weight = distance[cur];
        visited[cur] = true;
        for(auto & i : barn[cur]){
            int num = i.first;
            if(!visited[num]){
                q.push(num);
                distance[num] = weight+1;
                visited[num] = true;
            }
        }

    }
    for(int i = 2; i <= N; i++){
        if(result_distance < distance[i]){
            result_distance = distance[i];
        }
    }
    for(int i = 2; i <= N; i++){
        if(result_barn == 0 && distance[i] == result_distance){
            result_barn = i;
        }
        if(distance[i] == result_distance){
            result_chance++;
        }

    }
    printf("%d %d %d", result_barn, result_distance, result_chance);
}