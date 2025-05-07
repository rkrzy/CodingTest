#include <string>
#include <vector>
#include <iostream>
using namespace std;
/*
* discount항목을 0 ~ discount.size() - 10부터 검사
* result = 10;
* want[i] == discount[j] => number[i]--;, result--; 
* want[i] != discount[j] => 그냥 넘어감
*/
int isExists(vector<string> want, string discount){
    int i;
    for(i = 0; i < want.size(); i++){
        if(want[i] == discount){
            return i;
        }
    }
    return -1;
}
int solution(vector<string> want, vector<int> number, vector<string> discount) {
    int answer = 0;
    int len = discount.size();
    for(int i = 0; i <= len - 10; i++){//discount 시작점
        int result = 10;
        vector<int> temp = number;
        for(int j = 0; j < 10; j++){//discount 1 ~ 10일까지 검사
            int index = isExists(want, discount[i+j]); //할인품목이 원하는 거에 존재한다
            if(index >= 0 && temp[index] > 0){
                temp[index]--;
                result--;
            }
        }
        if(result == 0){
            answer++;
        }
    }
    return answer;
}