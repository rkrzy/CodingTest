#include <string>
#include <vector>
#include <queue>
using namespace std;
//초기에는 합쳐진 값 = 0, 탐색할 index = 0;

int solution(vector<int> numbers, int target) {
    int answer = 0;
    queue<pair<int, int>> q;
    q.push({0,0});
    
    while(!q.empty()){
        int current_sum = q.front().first;
        int current_index = q.front().second;
        q.pop();
        
        if(current_index == numbers.size()){
            if(current_sum == target){
                answer++;
            }
            continue;
        }
        int next_num = numbers[current_index];
        
        q.push({current_sum + next_num, current_index + 1});
        q.push({current_sum - next_num, current_index + 1});
    }
   
    return answer;
}