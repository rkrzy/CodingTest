#include <string>
#include <vector>
#include <iostream>
using namespace std;
/*
* 가로 길이 >= 세로 길이
*/
vector<int> solution(int brown, int yellow) {
    vector<int> answer;
    int weight = yellow;
    int height = 1;
    if(yellow == 1){
        answer.push_back(3);
        answer.push_back(3);
    }
    for(int i = 1; i*2 <= yellow ; i++){
        //나누어 질때
        if(yellow % i == 0 && (i+1)*2 + ((yellow/i)+1)*2 == brown){
            answer.push_back(yellow/i + 2);
            answer.push_back(i + 2);
            break;
        }
    }
    return answer;
}