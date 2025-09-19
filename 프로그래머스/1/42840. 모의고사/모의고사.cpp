#include <string>
#include <vector>
#include <unordered_map>
using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    unordered_map<int, int> scores;
    unordered_map<int, vector<int> > rules;
    
    int max_value = 0;
    
    rules[1] = {1,2,3,4,5};
    rules[2] = {2,1,2,3,2,4,2,5};
    rules[3] = {3,3,1,1,2,2,4,4,5,5};
    
    
    scores[1] = 0;
    scores[2] = 0;
    scores[3] = 0;

    
    for(int i = 1; i <= 3; i++){
        int vec_size = rules[i].size();
        for(int j = 0; j < answers.size(); j++){
            if(rules[i][j % vec_size] == answers[j]){
                scores[i]++;
            }
        }
        if(max_value < scores[i]){
            max_value = scores[i];
        }
    }
    for(int i = 1; i <= 3; i++){
        if(scores[i] == max_value){
            answer.push_back(i);
        }
    }
    return answer;
}