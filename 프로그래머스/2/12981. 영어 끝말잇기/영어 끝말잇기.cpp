#include <string>
#include <vector>
#include <iostream>

using namespace std;
/*
* 중복된 단어를 말하는 경우, 끝말잇기가 아닌 걸 말하는 경우
*/
bool duplication(vector<string> words, int people){
    string temp = words[people];
    for(int i = people-1; i >= 0; i--){
        if(temp == words[i]){
            return true;
        }
    }
    return false;
}
vector<int> solution(int n, vector<string> words) {
    vector<int> answer;
    int people = 0;
    int turn = 0;
    int i = 0;
    char last_char = words[i].back();
    
    for(i = 1; i < words.size(); i++){
        char first_char = words[i][0];
        
        if(last_char != first_char ||
          duplication(words, i)){//만약 앞글자와 다른 경우 또는 중복
           people = (i % n) + 1;
            turn = (i / n) + 1;
            answer.push_back(people);
            answer.push_back(turn);
            return answer;
        }
        cout << last_char << first_char<<"\n";
        last_char = words[i].back();
    }
    if(i >= n){//만약 검증했을 때 문제가 없다면.
        turn = 0;
        people = 0;
    }
    answer.push_back(people);
    answer.push_back(turn);
    return answer;
}