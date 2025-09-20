#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int solution(vector<string> babbling) {
    int answer = 0;
    for(string str : babbling){
        int index = 0;
        bool flag = true;
        vector<bool> chance(4, false);
        while(index < str.length()){
            if(str.length() < 2){
                flag = false;
                break;
            }
            if(str.substr(index, 3) == "aya" && !chance[0]){
                index += 3;
                fill(chance.begin(), chance.end(),0);
                chance[0] = true;
            }else if(str.substr(index, 2) == "ye"&& !chance[1]){
                index += 2;
                fill(chance.begin(), chance.end(),0);
                chance[1] = true;
            }else if(str.substr(index,3) == "woo"&& !chance[2]){
                index += 3;
                fill(chance.begin(), chance.end(),0);
                chance[2] = true;
            }else if(str.substr(index, 2) == "ma"&& !chance[3]){
                index += 2;
                fill(chance.begin(), chance.end(),0);
                chance[3] = true;
            }else{
                flag = false;
                break;
            }
            
        }
        if(flag){
            answer++;
        }
    }
    return answer;
}