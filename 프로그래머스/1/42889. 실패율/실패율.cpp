#include <string>
#include <vector>
#include <algorithm>
using namespace std;
//먼저 stage에 각각 남아있는 사람의 수를 구한다.
//각 stage남아있는 사람 / (stages.size() - 이전 스테이지의 사람의 수)
bool compare(pair<double, int> a, pair<double, int> b){
    if (a.first == b.first){
        return a.second < b.second;
    }
    return a.first > b.first;
    }
vector<int> solution(int N, vector<int> stages) {
    vector<int> answer;
    vector<int> stage_counts(N+2, 0);
    
    for(int stage_num : stages){
        stage_counts[stage_num]++;
    }
    
    int total = stages.size();
    vector<pair<double, int>> failure_rates;
     
    for(int i = 1; i <= N; i++) {
        double rate = 0.0;
        if(total != 0){
            rate = (double)stage_counts[i] / total;
        }
        failure_rates.push_back({rate, i});
        
        total -= stage_counts[i];
    }
    
    sort(failure_rates.begin(), failure_rates.end(), compare);
    
    for(auto const& [rate, stage_num] : failure_rates) {
        answer.push_back(stage_num);
    }
    
    
    return answer;
}