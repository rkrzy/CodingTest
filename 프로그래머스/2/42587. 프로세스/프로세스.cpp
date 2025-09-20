#include <string>
#include <vector>
#include <queue>
#include <algorithm>
#include <iostream>
using namespace std;
//location의 시작은 0부터 진행된다는걸 알아야 한다.
//priority를 기준으로 값을 저장한다. => vector 사용 => 정렬 수행
//모든 location, priority를 Pair로 quque에 저장한다.
//queue에서 하나씩 제거하면서 priority를 저장한 값을 이용해 최대 값에 대해 탐지한다.
int solution(vector<int> priorities, int location) {
    int answer = 0;
    queue<pair<int, int>> q;
    vector<int> order;
    int chance = 0;
    for(int num : priorities){
        order.push_back(num);
    }
    sort(order.begin(), order.end());
    
    //위치와 우선순위를 하나씩 저장한다.
    for(int i = 0; i < priorities.size(); i++){
        q.push({i, priorities[i]});
    }
    
    while(!q.empty())
    {
        pair<int, int> temp = q.front();
        //우선순위가 가장 최상위의 값인지 확인한다.
        if(temp.second == order[order.size()-1]){
            chance++;
            q.pop();
            order.pop_back();
            if(temp.first == location){
                answer = chance;
                break;
            }
        }
        else//만약 최상위의 값이 아니라면
        {
            q.pop();
            q.push(temp);
            cout << "뒤로 다시 넣기" << endl;
        }
        
    }
    return answer;
}