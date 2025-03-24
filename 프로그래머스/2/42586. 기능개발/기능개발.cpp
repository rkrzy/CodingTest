#include <string>
#include <vector>
#include <stack>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> progresses, vector<int> speeds) {
    vector<int> answer;
    stack<int> s;
    int day = 1;
    int length = progresses.size();
    for(int i = 0; i < length; i++){
        s.push(progresses.back());
        progresses.pop_back();
    }
    while(!s.empty()){
        int total = s.top() + (speeds.front() * day);
        if(total < 100){
            day++;
        }
        else if(total >= 100){
            int result = 0;
            while(!s.empty() && 
                  s.top() + (speeds.front() * day) >= 100){
                s.pop();
                speeds.erase(speeds.begin());
                result++;
            }
            answer.push_back(result);
        }
    }
    return answer;
}