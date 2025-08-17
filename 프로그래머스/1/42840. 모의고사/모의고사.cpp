#include <string>
#include <vector>
#include <algorithm>
#include <map>
#include <iostream>
using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> solution;
    map<int, vector<int>> peoples;
    int chance[3] = {0, 0, 0};
    peoples.insert({1, {1,2,3,4,5}});
    peoples.insert({2, {2,1,2,3,2,4,2,5}});
    peoples.insert({3, {3, 3, 1, 1, 2, 2, 4,4, 5, 5}});
    
    int high = 0;
    
    for(int i = 1; i <= 3; i++){
        int count = 0;
        int length = peoples[i].size();
        if(answers[0] == peoples[i][0]){
            count++;
        }
        for(int j = 1; j < answers.size(); j++){
            if(peoples[i][j%length] == answers[j]){
                count++;
            }
        }
        cout << count << endl;
        chance[i-1] = count;
        if(high < count)
        {
            high = count;
        }
    }
    for(int i = 0; i < 3; i++){
        if(high == chance[i])
        {
            solution.push_back(i+1);
        }
    }
    return solution;
}