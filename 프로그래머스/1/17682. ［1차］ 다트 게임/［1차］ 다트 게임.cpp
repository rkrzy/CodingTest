#include <string>
#include <vector>
#include <iostream>
using namespace std;
//*(스타상) = 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다.
//첫번째로 나오면 해당 점수만 2배로 마든다.
//다른 스타상과 중첩이 가능하다.
//#(아차상) = 당첨 시 해당 점수는 -
//스타상과 아차상은 중첩이 가능하다. 아차상 점수가 -2배가 된다.
//S, D, T는 점수마다 하나씩 존재한다.
//*, #은 둘중 하나만 존재가 가능, 없을 수도 있다.

int solution(string dartResult) {
    int answer = 0;
    int count = 0;
    int index = -1;
    string numStr = "";
    vector<int> result;
    for(int i = 0; i < dartResult.length(); i++){
        char temp = dartResult[i];
        if(dartResult[i] >= '0' && dartResult[i] <= '9'){
            numStr += dartResult[i];
        }
        else if(temp == 'S' || temp == 'D' || temp == 'T') {
            int score = stoi(numStr);
            numStr = "";
            if (temp == 'D'){
                score = score * score;
            }else if(temp == 'T'){
                score = score * score * score;
            }
            result.push_back(score);
        }else {
            if (temp == '*'){
                if(!result.empty()){
                    result.back() *= 2;
                }
                if(result.size() > 1){
                    result[result.size() - 2] *= 2;
                }
            }
            else if(temp == '#'){
                if(!result.empty()) {
                    result.back() *= -1;
                }
            }
        }
    }
    for(int num : result){
        answer += num;
    }
    return answer;
}