#include <string>
#include <vector>
#include <queue>
#include <iostream>

using namespace std;

int solution(vector<int> scoville, int K) {
    
    int answer = 0;
    priority_queue<int,vector<int>,greater<int>> pq;

    for(int i = 0; i < scoville.size(); i++){
        pq.push(scoville[i]);
    }
    while(pq.size() >= 2&&pq.top() < K){
        int result = 0;
        result += pq.top();
        pq.pop();
        result += pq.top() * 2;
        pq.pop();
        pq.push(result);
        answer++;
    }
    if(pq.top() < K){
        answer = -1;
    }
    return answer;
}